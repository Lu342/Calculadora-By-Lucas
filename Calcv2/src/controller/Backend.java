package controller;

import javax.swing.JTextField;
import static java.lang.Double.NaN;

public class Backend {

    public Backend() {
    }

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

    private Double addition(double numberOne, double numberTwo) {
        double value = numberOne + numberTwo;

        return value;
    }

    private Double subtraction(double numberOne, double numberTwo) {
        double value = numberOne - numberTwo;

        return value;
    }

    private Double multiplication(double numberOne, double numberTwo) {
        double value = numberOne * numberTwo;

        return value;
    }

    private Double division(double numberOne, double numberTwo) {
        double value = numberOne / numberTwo;

        return value;
    }

    public double firstNumberFilter(JTextField field) {
        double numberOne = 0.0;
        try {
            String firstNumber = this.current("", field);
            field.setText("");
            numberOne = Double.parseDouble(firstNumber);

        } catch (NumberFormatException e) {
            field.setText(null);
        }

        return numberOne;
    }

    public double secondNumberFilter(JTextField field) {
        double numberTwo = 0.0;
        try {
            String secondNumber = this.current("", field);
            field.setText("");
            numberTwo = Double.parseDouble(secondNumber);

        } catch (NumberFormatException e) {
            field.setText(null);
        }

        return numberTwo;
    }

    public String current(String number, JTextField field) {
        field.setText(field.getText() + number);

        String current = field.getText();

        return current;
    }
}