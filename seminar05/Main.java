package seminar05;

public class Main {
  public static void main(String[] args) {
    CalculatorModel model = new CalculatorModel();
    CalculatorView view = new CalculatorView();
    CalculatorController controller = new CalculatorController(model, view);

    double num1 = 10;
    double num2 = 0;
    char operator = '/';

    controller.calculate(num1, num2, operator);
  }
}
