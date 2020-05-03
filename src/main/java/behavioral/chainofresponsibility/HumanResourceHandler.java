package behavioral.chainofresponsibility;

import java.util.List;

public class HumanResourceHandler extends Handler {

    @Override
    public List<String> handle(Leave leave) {
        return List.of("leave acknowledged by human resource");
    }

}
