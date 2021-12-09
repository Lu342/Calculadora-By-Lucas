public class Backend(){

    double result, numberOne, numberTwo;
    String operation, stringResult;


    public double operations(String operation, double numberOne, double numberTwo) {
        if (operation.equalsIgnoreCase("+")) {
            result = addition(numberOne, numberTwo);
        } else if (operation.equalsIgnoreCase("-")) {
            result = subtraction(numberOne, numberTwo);
        } else if (operation.equalsIgnoreCase("/")) {
            result = division(numberOne, numberTwo);
            if (result == NaN) {
                result = 0.0;
            }

        } else if (operation.equalsIgnoreCase("*")) {
            result = multiplication(numberOne, numberTwo);
        } else {
            result = 0.0;
        }
        return result;
    }

    private Double addition(double numberOne, double numberTwo){
       double value = numberOne + numberTwo;

        return value;
    }

    private Double subtraction(double numberOne, double numberTwo){
        double value = numberOne - numberTwo;

        return value;
    }

    private Double multiplication(double numberOne, double numberTwo){
        double value = numberOne * numberTwo;

        return value;
    }

    private Double division(double numberOne, double numberTwo){
        double value = numberOne / numberTwo;

        return value;
    }

    public boolean firstNumberFilter(String value) {
        operation = value;
        try {
            String firstNumber = this.current("");
            inputOutputNumbers.setText("");
            numberOne = Double.parseDouble(firstNumber);

        } catch (NumberFormatException e) {
            inputOutputNumbers.setText(null);
        }

        return true;
    }

    public boolean secondNumberFilter() {
        try {
            String secondNumber = this.current("");
            inputOutputNumbers.setText("");
            numberTwo = Double.parseDouble(secondNumber);

        } catch (NumberFormatException e) {
            inputOutputNumbers.setText(null);
        }

        return true;
    } 
} 