package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BST<T extends Comparable<T>> implements Iterable {

    private Node<T> root = null;

    @SuppressWarnings("unchecked")
    public void add(T item) {
        Node<T> node = this.root;
        Node<T> parent = null;
        while (null != node) {
            parent = node;
            if (item.compareTo(node.value) < 0)
                node = node.left;
            else
                node = node.right;
        }

        if (null == parent)
            root = new Node(item);
        else if (item.compareTo(parent.value) < 0)
            parent.left = new Node(item);
        else
            parent.right = new Node(item);
    }

    @Override
    public Iterator<T> iterator() {
        List<T> list = new ArrayList<>();
        inOrder(root, list);
        return list.iterator();
    }

    private void inOrder(Node<T> node, List<T> list) {
        if (node == null)
            return;
        inOrder(node.left, list);
        list.add(node.value);
        inOrder(node.right, list);
    }

}
