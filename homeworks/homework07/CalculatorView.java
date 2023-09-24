package homeworks.homework07;
import java.util.Scanner;

    /**
    * Класс CalculatorView (Представление), Логика.
    */
public class CalculatorView {
    /**
    * Вывод в консоль результат вычеслений 
    * переданное с Модели;
    */
    public void printResult(double result) {
        System.out.println("\n Результат вычислений: " + result);
    }

    /**
    * Вывод в консоль сообщения об ошибке 
    * переданное с Модели;
    */
    public void printError(String errorMessage) {
        System.err.println("Ошибка: " + errorMessage);
    }
    /**
    * Сканера для пользовательского ввода num1 и num2
    */
    Scanner scanner = new Scanner(System.in);
    /**
    * Пользовательский ввод num1 и num2
    * @return возврат num1 и num2
    */
    public int getUserInput1() {
        System.out.print("Введите число: ");
        int input1 = scanner.nextInt();
        return input1;       
    }
    /**
    * Пользовательский ввод operator
    * @return возврат num1 и num2
    */
     public int getUserInput2() {
        System.out.print("Введите Оператор - ( +, -, *, / ): ");
        int input2 = scanner.next().charAt(0);
        return input2;    
    }  
} 
