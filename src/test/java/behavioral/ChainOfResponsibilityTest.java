package behavioral;

import behavioral.chainofresponsibility.Handler;
import behavioral.chainofresponsibility.Leave;
import behavioral.chainofresponsibility.LeaveHandler;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ChainOfResponsibilityTest {

    private Handler leaveHandler = new LeaveHandler();

    @Test
    void testAnnualLeave() {
        List<String> comments = leaveHandler.handle(new Leave(Leave.Type.ANNUAL, 2));
        Assertions.assertEquals(2, comments.size());
        Assertions.assertEquals(comments.get(0), "leave acknowledged by project manager");
        Assertions.assertEquals(comments.get(1), "leave acknowledged by reporting manager");
    }

    @Test
    void testCasualLeave() {
        List<String> comments = leaveHandler.handle(new Leave(Leave.Type.CASUAL, 3));
        Assertions.assertEquals(1, comments.size());
        Assertions.assertEquals(comments.get(0), "leave acknowledged by reporting manager");
    }

    @Test
    void testMedicalLeave() {
        List<String> comments = leaveHandler.handle(new Leave(Leave.Type.MEDICAL, 2));
        Assertions.assertEquals(1, comments.size());
        Assertions.assertEquals(comments.get(0), "leave acknowledged by reporting manager");
    }

    @Test
    void testMoreMedicalLeave() {
        List<String> comments = leaveHandler.handle(new Leave(Leave.Type.MEDICAL, 4));
        Assertions.assertEquals(2, comments.size());
        Assertions.assertEquals(comments.get(0), "leave acknowledged by reporting manager");
        Assertions.assertEquals(comments.get(1), "leave acknowledged by human resource");
    }

}
