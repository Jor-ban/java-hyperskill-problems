abstract class IntBinaryOperation {

    protected int firstArg;
    protected int secondArg;

    public IntBinaryOperation(int firstArg, int secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    public abstract int perform();
}

class Addition extends IntBinaryOperation {

    public Addition(int firstArg, int secondArg) {
        super(firstArg, secondArg);
    }
    public int perform() {
        return this.firstArg + this.secondArg;
    }
}
class Multiplication extends IntBinaryOperation {
    public Multiplication(int firstArg, int secondArg) {
        super(firstArg, secondArg);
    }
    public int perform() {
        return this.firstArg * this.secondArg;
    }
}