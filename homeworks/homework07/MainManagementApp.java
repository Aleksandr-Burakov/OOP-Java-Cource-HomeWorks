package homeworks.homework07;
import java.util.Scanner;

  /**
  * Главный класс для демонстрации работы с элементами.
  */
public class MainManagementApp {
  /**
  * Создание экземпляров модели, представления и презентера
  * @controller.calculate Обработка введенных значений с консоли пользователем.
  */
  public static void main(String[] args) {
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
