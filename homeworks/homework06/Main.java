package homeworks.homework06;
    /**
    * Главный класс для демонстрации работы с элементами.
    */
public class Main <T> {
    
    /**
    * Конструктор принимающий элементы с конкретным типом данных.
    */
    public static void main(String[] args) {
        PrintElement<String> strPrintElement = new PrintElement<String>("Hello my Frends!");
        PrintElement<Integer> intPrintElement = new PrintElement<Integer>(45);
        PrintElement<Double> doublePrintElement = new PrintElement<Double>(44.6);
        PrintElement<Boolean> boolenPrintElement = new PrintElement<Boolean>(true);

    /**
    * Вызов вывода элементов в консоль .
    */
        strPrintElement.printElement();
        intPrintElement.printElement();
        doublePrintElement.printElement();
        boolenPrintElement.printElement(); 
        
    }     
}

    

