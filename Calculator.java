public class Calculator {
    public static void main(String[] args) {

        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        char op = args[2].charAt(0);
        double result;

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("Result: " + result);
    }
}
