package structural;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import structural.facade.MinMaxStack;

class FacadeTest {

    @Test
    void testMinMaxStack() {
        MinMaxStack<Integer> stack = new MinMaxStack<>();
        stack.push(5);
        stack.push(16);
        stack.push(1);
        stack.push(78);
        stack.push(3);
        Assertions.assertEquals(3, stack.peek());
        Assertions.assertEquals(1, stack.min());
        Assertions.assertEquals(78, stack.max());

        stack.pop();
        Assertions.assertEquals(78, stack.peek());
        Assertions.assertEquals(1, stack.min());
        Assertions.assertEquals(78, stack.max());

        stack.pop();
        Assertions.assertEquals(1, stack.peek());
        Assertions.assertEquals(1, stack.min());
        Assertions.assertEquals(16, stack.max());

        stack.pop();
        Assertions.assertEquals(16, stack.peek());
        Assertions.assertEquals(5, stack.min());
        Assertions.assertEquals(16, stack.max());
    }

}
