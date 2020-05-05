package behavioral.command;

public class CallerApp extends App {

    private boolean isCalling;
    private boolean onHold;

    @Override
    public String earphoneClick() {
        return attendDisconnect();
    }

    @Override
    public String earphoneLongPress() {
        return toggleHold();
    }

    @Override
    public String swipeUp() {
        isCalling = false;
        return attendDisconnect();
    }

    @Override
    public String swipeDown() {
        isCalling = true;
        return attendDisconnect();
    }

    private String attendDisconnect() {
        if (isCalling) {
            isCalling = false;
            return "disconnected";
        } else {
            isCalling = true;
            return "calling";
        }
    }

    private String toggleHold() {
        if (onHold) {
            onHold = false;
            return "calling";
        } else {
            onHold = true;
            return "hold";
        }
    }

}
