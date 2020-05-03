package behavioral.chainofresponsibility;

import java.util.List;

public class LeaveHandler extends Handler {

    private Handler projectManagerHandler = new ProjectManagerHandler();

    public LeaveHandler() {
        Handler reportingManagerHandler = new ReportingManagerHandler();
        Handler humanResourceHandler = new HumanResourceHandler();
        projectManagerHandler.next = reportingManagerHandler;
        reportingManagerHandler.next = humanResourceHandler;
    }

    @Override
    public List<String> handle(Leave leave) {
        return projectManagerHandler.handle(leave);
    }

}
