const std = @import("std");

const BUILD_DIR = "build";

pub fn build(b: *std.build.Builder) void {
    const build_all = b.step("build", "Build all examples");

    addExample(b, build_all, .{
        .name = "garage",
        .mainClass = "dev.leroycepearson.qainfosys.garage.Runner",
        .mainSource = "src/dev/leroycepearson/qainfosys/garage/Runner.java",
    });
}

const Example = struct {
    name: []const u8,
    mainClass: []const u8,
    mainSource: []const u8,
    sourceRoot: []const u8 = "src",
};

pub fn addExample(b: *std.build.Builder, build_all: *std.build.Step, example: Example) void {
    const build_step = b.step(b.fmt("build-{s}", .{example.name}), b.fmt("Build the {s} example", .{example.name}));
    build_all.dependOn(build_step);

    const build_command = b.addSystemCommand(&.{
        "javac",
        "--source-path",
        example.sourceRoot,
        "-d",
        BUILD_DIR,
        example.mainSource
    });
    build_step.dependOn(&build_command.step);

    // Create command to run the example
    const run_command = b.addSystemCommand(&.{ "java", "--class-path", BUILD_DIR, example.mainClass });
    run_command.step.dependOn(build_step);

    const run_step = b.step(b.fmt("run-{s}", .{example.name}), b.fmt("Build the {s} example", .{example.name}));
    run_step.dependOn(&run_command.step);
}
