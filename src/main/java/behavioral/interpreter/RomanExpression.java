package behavioral.interpreter;

import java.util.ArrayList;
import java.util.List;

public class RomanExpression {

    public static int interpret(String roman) {
        Context context = new Context(roman.toUpperCase().trim());
        List<Expression> expressions = new ArrayList<>();
        expressions.add(new ThousandExpression());
        expressions.add(new HundredExpression());
        expressions.add(new TenExpression());
        expressions.add(new OneExpression());
        for (Expression exp : expressions)
            exp.interpret(context);
        return context.getOutput();
    }

}
