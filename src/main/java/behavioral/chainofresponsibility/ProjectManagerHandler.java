package behavioral.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

public class ProjectManagerHandler extends Handler {

    @Override
    public List<String> handle(Leave leave) {
        List<String> comments = new ArrayList<>();
        if (Leave.Type.ANNUAL == leave.getType())
            comments.add("leave acknowledged by project manager");
        comments.addAll(next.handle(leave));
        return comments;
    }

}
