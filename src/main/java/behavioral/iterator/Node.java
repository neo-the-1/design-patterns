package behavioral.iterator;

public class Node<T extends Comparable<T>> {

    T value;
    Node left, right;

    public Node(T value) {
        this.value = value;
    }

}
