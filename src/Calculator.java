public class Calculator {
    public static float caculate(float firstOperand,float secondOperand,String operator) {
        switch (operator) {
            case "+":
                return firstOperand + secondOperand;
            case "-":
                return firstOperand - secondOperand;
            case "*":
                return firstOperand * secondOperand;
            case "/":
                if(secondOperand != 0) {
                    return firstOperand / secondOperand;
                } else {
                    throw new RuntimeException("Can't divide by zezo");
                }
            default:
                throw new RuntimeException("Invalid operation");
        }
    }
}
