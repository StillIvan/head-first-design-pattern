package com.github.stillivan.pattern.command.remote;

/**
 * @author Charming
 * @since 2016-09-05 17:02
 */
public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
