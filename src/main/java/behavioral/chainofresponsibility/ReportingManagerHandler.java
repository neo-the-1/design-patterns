package behavioral.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

public class ReportingManagerHandler extends Handler {

    @Override
    public List<String> handle(Leave leave) {
        List<String> comments = new ArrayList<>();
        comments.add("leave acknowledged by reporting manager");
        if (Leave.Type.MEDICAL == leave.getType() && leave.getDays() >= 3)
            comments.addAll(next.handle(leave));
        return comments;
    }

}
