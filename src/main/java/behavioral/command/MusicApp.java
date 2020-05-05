package behavioral.command;

public class MusicApp extends App {

    private boolean isPlaying;
    private int songIndex;

    @Override
    public String earphoneClick() {
        return togglePlayPause();
    }

    @Override
    public String earphoneLongPress() {
        return next();
    }

    @Override
    public String swipeUp() {
        isPlaying = false;
        return togglePlayPause();
    }

    @Override
    public String swipeDown() {
        isPlaying = true;
        return togglePlayPause();
    }

    private String togglePlayPause() {
        if (isPlaying) {
            isPlaying = false;
            return "paused";
        } else {
            isPlaying = true;
            return "playing";
        }
    }

    private String next() {
        songIndex++;
        return "next";
    }

}
