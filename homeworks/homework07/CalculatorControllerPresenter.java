package homeworks.homework07;

public class CalculatorControllerPresenter {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorControllerPresenter(CalculatorModel newModel, CalculatorView view) {
        model = newModel;
        this.view = view;
    }
   
    public void calculate(double num1, double num2, char operator) {       
        double result;
        try {
            switch (operator) {
                case '+':
                    result = model.add(num1, num2);
                    break;
                case '-':
                    result = model.subtract(num1, num2);
                    break;
                case '*':
                    result = model.multiply(num1, num2);
                    break;
                case '/':
                    result = model.divide(num1, num2);
                    break;
                default:
                    view.printError("Вы ввели неверного оператора");
                    return;
            }
            view.printResult(result);
        } 
        catch (ArithmeticException e) {
            view.printError(e.getMessage());            
        }
    }   
}



