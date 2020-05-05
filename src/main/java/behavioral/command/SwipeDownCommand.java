package behavioral.command;

public class SwipeDownCommand implements Command {

    private App app;

    public SwipeDownCommand(App app) {
        this.app = app;
    }

    @Override
    public String execute() {
        return app.swipeDown();
    }

}
