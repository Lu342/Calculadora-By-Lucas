public class Backend(){

    public Backend (){}

    public double operations(String operation, double numberOne, double numberTwo) {
        double result;
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

    public double firstNumberFilter(String value) {
        String operation = value;
        double numberOne;
        JTextField field;
        try {
            String firstNumber = this.current("");
            field.setText("");
            numberOne = Double.parseDouble(firstNumber);

        } catch (NumberFormatException e) {
            field.setText(null);
        }

        return numberOne;
    }

    public double secondNumberFilter() {
        double numberTwo;
        JTextField field;
        try {
            String secondNumber = this.current("");
            field.setText("");
            numberTwo = Double.parseDouble(secondNumber);

        } catch (NumberFormatException e) {
            field.setText(null);
        }

        return numberTwo;
    } 
} 