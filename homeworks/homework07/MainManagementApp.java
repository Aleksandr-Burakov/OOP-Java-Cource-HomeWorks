package homeworks.homework07;
import java.util.Scanner;

public class MainManagementApp {

  // Создание экземпляров модели, представления и презентера
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorControllerPresenter controller = new CalculatorControllerPresenter(model, view);
        Scanner scanner = new Scanner(System.in);
        double num1 = view.getUserInput1();
        double num2 = view.getUserInput1();
        char operator = (char) view.getUserInput2();

  // Обработка действия пользователя (например, нажатие кнопки "Сложить") 

        controller.calculate(num1, num2, operator);
        scanner.close();
    }
}
