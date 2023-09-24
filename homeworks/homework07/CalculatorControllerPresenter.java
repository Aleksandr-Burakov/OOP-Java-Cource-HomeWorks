package homeworks.homework07;

    /**
    * Класс CalculatorControllerPresenter Презентер,
    * для взаимодействия CalculatorModel (Модель) 
    * и CalculatorView (Представление).
    * @param model Mодель.
    * @param view Представление. 
    */
public class CalculatorControllerPresenter {
    private CalculatorModel model;
    private CalculatorView view;

    /**
    * Конструктор для изменения приватного поля CalculatorModel model
    * и CalculatorView view;
    */
    public CalculatorControllerPresenter(CalculatorModel newModel, CalculatorView view) {
        model = newModel;
        this.view = view;
    }
    
    /**
    * Конструктор для создания вычисления.
    * @param num1 Первое число для вычислений.
    * @param num2 Второе число для вычислений.
    * @param operator Оператор для вычислений.
    */
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
    // Передача в Представление сообщения об ошибке.            
                    view.printError("Вы ввели неверного оператора");
                    return;
            }
    // Передача в Представление результат вычисления.
            view.printResult(result);
        } 
    // Передача в Представление сообщения об ошибке.    
        catch (ArithmeticException e) {
            view.printError(e.getMessage());            
        }
    }   
}



