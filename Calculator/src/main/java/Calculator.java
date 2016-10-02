import org.junit.Test;

public class Calculator {

    public int value(String input) {
        Operator operator= getOperator(input);
        Operands operands = getOperands(input);
        return operator.apply(operands);
    }

    private Operands getOperands(String input) {
        String[] substring = input.split("\\+|-|\\*|/");
        Operands Operands = new Operands();
        Operands.var1 = Integer.valueOf(substring[0]);
        Operands.var2 = Integer.valueOf(substring[1]);
        return Operands;
    }

    private Operator getOperator(String input) {
        String str = input;
        for (int i=0; i < str.length(); i++) {
            if (('+' == input.charAt(i)) | ('-' == input.charAt(i)) |
                    (input.charAt(i) == '*') | (input.charAt(i) == '/')) {
                char s = input.charAt(i);
                switch (s) {
                    case '+':
                        return new SumOperator();
                    case '-':
                        return new DiffOperator();
                    case '*':
                        return new MulOperator();
                    case '/':
                        return new DivOperarot();
                }
            }
        }
        return null;
    }

}
