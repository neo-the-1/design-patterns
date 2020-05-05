package behavioral.command;

public class EarphoneLongPressCommand implements Command {

    private App app;

    public EarphoneLongPressCommand(App app) {
        this.app = app;
    }

    @Override
    public String execute() {
        return app.earphoneLongPress();
    }

}
