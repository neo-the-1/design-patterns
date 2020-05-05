package behavioral;

import behavioral.command.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CommandTest {

    @Test
    void testMusicApp() {
        App app = new MusicApp();
        Assertions.assertEquals("playing", new EarphoneClickCommand(app).execute());
        Assertions.assertEquals("paused", new EarphoneClickCommand(app).execute());
        Assertions.assertEquals("next", new EarphoneLongPressCommand(app).execute());
        Assertions.assertEquals("playing", new SwipeUpCommand(app).execute());
        Assertions.assertEquals("paused", new SwipeDownCommand(app).execute());
        Assertions.assertEquals("playing", new EarphoneClickCommand(app).execute());
        Assertions.assertEquals("paused", new SwipeDownCommand(app).execute());
        Assertions.assertEquals("paused", new SwipeDownCommand(app).execute());
        Assertions.assertEquals("playing", new EarphoneClickCommand(app).execute());
        Assertions.assertEquals("playing", new SwipeUpCommand(app).execute());
    }

    @Test
    void testCallerApp() {
        App app = new CallerApp();
        Assertions.assertEquals("calling", new EarphoneClickCommand(app).execute());
        Assertions.assertEquals("hold", new EarphoneLongPressCommand(app).execute());
        Assertions.assertEquals("calling", new EarphoneLongPressCommand(app).execute());
        Assertions.assertEquals("disconnected", new EarphoneClickCommand(app).execute());

        Assertions.assertEquals("calling", new SwipeUpCommand(app).execute());
        Assertions.assertEquals("hold", new EarphoneLongPressCommand(app).execute());
        Assertions.assertEquals("calling", new EarphoneLongPressCommand(app).execute());
        Assertions.assertEquals("disconnected", new SwipeDownCommand(app).execute());

        Assertions.assertEquals("calling", new EarphoneClickCommand(app).execute());
        Assertions.assertEquals("disconnected", new SwipeDownCommand(app).execute());

        Assertions.assertEquals("calling", new SwipeUpCommand(app).execute());
        Assertions.assertEquals("disconnected", new EarphoneClickCommand(app).execute());
    }

}
