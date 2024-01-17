package software.ulpgc.imageviewer.swing;

import software.ulpgc.imageviewer.Command;
import software.ulpgc.imageviewer.ImageDisplay;
import software.ulpgc.imageviewer.ImagePresenter;

import java.awt.*;

public class NextImageCommand implements Command {
    private final ImagePresenter imagePresenter;

    public NextImageCommand(ImagePresenter imagePresenter) {
        this.imagePresenter = imagePresenter;
    }

    @Override
    public void execute() {
        imagePresenter.show(imagePresenter.image().next());
    }
}

