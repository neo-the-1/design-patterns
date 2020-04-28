package structural.facade;

import java.util.Stack;

public class MinMaxStack<T extends Comparable<T>> {

    private Stack<T> stack = new Stack<>();
    private Stack<T> min = new Stack<>();
    private Stack<T> max = new Stack<>();

    public void push(T item) {
        stack.push(item);
        if (min.empty() || min.peek().compareTo(item) > 0)
            min.push(item);
        if (max.empty() || max.peek().compareTo(item) < 0)
            max.push(item);
    }

    public T pop() {
        T t = stack.pop();
        if (min.peek().compareTo(t) == 0)
            min.pop();
        if (max.peek().compareTo(t) == 0)
            max.pop();
        return t;
    }

    public T peek() {
        return stack.peek();
    }

    public T min() {
        return min.peek();
    }

    public T max() {
        return max.peek();
    }

}
