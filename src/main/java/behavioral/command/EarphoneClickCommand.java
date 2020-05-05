package behavioral.command;

public class EarphoneClickCommand implements Command {

    private App app;

    public EarphoneClickCommand(App app) {
        this.app = app;
    }

    @Override
    public String execute() {
        return app.earphoneClick();
    }

}
