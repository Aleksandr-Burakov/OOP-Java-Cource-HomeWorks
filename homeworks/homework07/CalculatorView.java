package homeworks.homework07;

import java.util.Scanner;

//Это тоже логика, все три класса логика
public class CalculatorView {

    public void printResult(double result) {
        System.out.println("\n Результат вычислений: " + result);
    }

    // Тут могло быть логирование
    public void printError(String errorMessage) {
        System.err.println("Ошибка: " + errorMessage);
    }

    Scanner scanner = new Scanner(System.in);
    public int getUserInput1() {
        System.out.print("Введите число: ");
        int input1 = scanner.nextInt();
        return input1;       
    }

     public int getUserInput2() {
        System.out.print("Введите Оператор - ( +, -, *, / ): ");
        int input2 = scanner.next().charAt(0);
        return input2;    
    }  
} 
