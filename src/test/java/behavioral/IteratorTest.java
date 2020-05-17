package behavioral;

import behavioral.iterator.BST;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class IteratorTest {

    @Test
    void testCharBST() {
        BST<Character> bst = new BST<>();
        for (char c : "coding".toCharArray())
            bst.add(c);

        StringBuilder string = new StringBuilder();
        bst.forEach(item -> string.append(item));
        Assertions.assertEquals("cdgino", string.toString());
    }

    @Test
    void testIntBST() {
        BST<Integer> bst = new BST<>();
        for (int i : List.of(4, 2, 5, 1, 3))
            bst.add(i);

        StringBuilder string = new StringBuilder();
        bst.forEach(item -> string.append(item));
        Assertions.assertEquals("12345", string.toString());
    }

}
