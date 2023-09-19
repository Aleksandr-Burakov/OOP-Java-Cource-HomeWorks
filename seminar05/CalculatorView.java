package seminar05;

//Это тоже логика, все три класса логика
public class CalculatorView {
    public void printResult(double result) {
        System.out.println("Результат: " + result);
    }

    // Тут могло быть логирование
    public void printError(String errorMessage) {
        System.err.println("Ошибка: " + errorMessage);
    }
}