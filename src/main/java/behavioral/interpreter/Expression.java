package behavioral.interpreter;

public abstract class Expression {

    public void interpret(Context context) {
        if (context.getInput().isEmpty())
            return;
        if (context.getInput().startsWith(nine())) {
            context.setOutput(context.getOutput() + 9 * multiplier());
            context.setInput(context.getInput().substring(2));
        } else if (context.getInput().startsWith(four())) {
            context.setOutput(context.getOutput() + 4 * multiplier());
            context.setInput(context.getInput().substring(2));
        } else if (context.getInput().startsWith(five())) {
            context.setOutput(context.getOutput() + 5 * multiplier());
            context.setInput(context.getInput().substring(1));
        }
        while (context.getInput().startsWith(one())) {
            context.setOutput(context.getOutput() + multiplier());
            context.setInput(context.getInput().substring(1));
        }
    }

    protected abstract String one();

    protected abstract String four();

    protected abstract String five();

    protected abstract String nine();

    protected abstract int multiplier();

}
