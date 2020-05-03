package behavioral.chainofresponsibility;

import java.util.List;

public abstract class Handler {

    protected Handler next;

    public abstract List<String> handle(Leave leave);

    void setNext(Handler next) {
        this.next = next;
    }

}
