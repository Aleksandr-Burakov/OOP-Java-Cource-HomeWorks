package homeworks.homework04.task1;

// Задача 1 : Напишите обобщенный метод printElement,
// который принимает один параметр типа T и выводит его на консоль.
// В этом примере мы объявляем обобщенный метод printElement,
// который принимает один параметр типа T. 
// Мы просто выводим этот элемент на консоль с помощью метода System.out.println().
// В методе main мы вызываем printElement с различными типами 
// данных: целое число (Integer), строку (String) и число с плавающей запятой (Double).
// Компилятор автоматически выводит тип параметра T на основе переданных аргументов.
// Таким образом, обобщенные методы позволяют нам писать код,
// который может работать с различными типами данных,
// обеспечивая простоту и гибкость использования.

public class PrintElement <T> {
    private T item;

    public PrintElement(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void printElement() {
        System.out.println("Тип элемента: " + item.getClass().getName());
    }

    public static void main(String[] args) {
        PrintElement<String> strPrintElement = new PrintElement<String>("Hello my Frends!");
        PrintElement<Integer> intPrintElement = new PrintElement<Integer>(45);
        PrintElement<Double> doublePrintElement = new PrintElement<Double>(44.6);
        PrintElement<Boolean> boolenPrintElement = new PrintElement<Boolean>(null);
    
        strPrintElement.printElement();
        intPrintElement.printElement();
        doublePrintElement.printElement();
        boolenPrintElement.printElement();  
    }     
}
