package homeworks.homework07;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
  /**
  * Главный класс для демонстрации работы с элементами.
  */
public class MainManagementApp {

    private static final Logger logger = Logger.getLogger(MainManagementApp.class.getName());

  /**
  * Создание экземпляров модели, представления и презентера
  * @controller.calculate Обработка введенных значений с консоли пользователем.
  */
    public static void main(String[] args){
        Handler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.INFO);
        logger.info("Info");
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorControllerPresenter controller = new CalculatorControllerPresenter(model, view);
        Scanner scanner = new Scanner(System.in);
        double num1 = view.getUserInput1();
        double num2 = view.getUserInput1();
        char operator = (char) view.getUserInput2();   
        controller.calculate(num1, num2, operator);
        scanner.close();
        
    }
}
