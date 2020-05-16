package behavioral.interpreter;

public class OneExpression extends Expression {

    @Override
    protected String one() {
        return "I";
    }

    @Override
    protected String four() {
        return "IV";
    }

    @Override
    protected String five() {
        return "V";
    }

    @Override
    protected String nine() {
        return "IX";
    }

    @Override
    protected int multiplier() {
        return 1;
    }

}
