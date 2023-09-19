package homeworks.homework04.task2;
import java.util.ArrayList;
import java.util.List;
// Задача 2 : Напишите обобщенный метод printArray,
// который принимает массив любого типа и выводит его элементы на консоль.
// В этом примере мы объявляем обобщенный метод printArray,
// который принимает массив типа T. Затем мы используем цикл for-each,
// чтобы пройти по всем элементам массива и вывести их на консоль.
// В методе main мы создаем массивы типов Integer и String 
// и вызываем printArray для каждого из них.
// В результате мы получаем вывод на консоль элементов каждого массива.
// Таким образом, обобщенные методы позволяют нам создавать код,
//  который может работать с разными типами данных, обеспечивая повторное использование и гибкость.


public class Main <T> {    
    public static void main(String[] args) {
        PrintArray printer = new PrintArray();
        String[] people = {"Aple", "Link", "Trust", "Rokki", "Mause"};
        Integer[] numbers = {22, 74, 57, 92, 33, 67, 8};
        printer.<String>printArray(people);
        printer.<Integer>printArray(numbers);
    }
}

class PrintArray{

    public <T> void printArray(T[] items){
        System.out.printf( "\nМассив = " + "{");
        for(T item: items){
            System.out.printf(" " + "'" + item + "'" );
        }
        System.out.println(" }");        
    }
}
