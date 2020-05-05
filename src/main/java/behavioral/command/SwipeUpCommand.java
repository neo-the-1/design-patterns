package behavioral.command;

public class SwipeUpCommand implements Command {

    private App app;

    public SwipeUpCommand(App app) {
        this.app = app;
    }

    @Override
    public String execute() {
        return app.swipeUp();
    }

}
