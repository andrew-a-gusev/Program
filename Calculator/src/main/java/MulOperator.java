
public class MulOperator implements Operator {
    @Override
    public int apply(Operands operands) {
        return operands.var1*operands.var2;
    }
}
