package behavioral;

import behavioral.interpreter.RomanExpression;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InterpreterTest {

    @Test
    void testRomanExpression() {
        Assertions.assertEquals(23, RomanExpression.interpret("XXIII"));
        Assertions.assertEquals(94, RomanExpression.interpret("XCIV"));
        Assertions.assertEquals(1453, RomanExpression.interpret("MCDLIII"));
        Assertions.assertEquals(3484, RomanExpression.interpret("MMMCDLXXXIV"));
    }

}
