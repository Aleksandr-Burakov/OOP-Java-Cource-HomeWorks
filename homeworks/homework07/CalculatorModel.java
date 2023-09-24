package homeworks.homework07;

    /**
    * Класс CalculatorModel (Модель), Бизнес Логика.
    */
public class CalculatorModel {

    /**
    * Сложение num1 и num2
    * @return Возврат вычисления num1 + num2
    */
    public double add(double num1, double num2) {
        return num1 + num2;
    }

     /**
    * Вычитание num1 и num2
    * @return Возврат вычисления num1 - num2
    */
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    /**
    * Умножение num1 и num2
    * @return Возврат вычисления num1 * num2
    */
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    /**
    * Деление num1 и num2
    * @return Возврат вычисления num1 / num2
    * @throw Сообщение об ошибке "Деление на ноль невозможно."
    */
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Деление на ноль невозможно.");
        }
        return num1 / num2;
    }

}