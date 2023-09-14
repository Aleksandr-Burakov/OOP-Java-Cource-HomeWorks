package seminar01.work1;

public class Main {
    public static void main(String[] args) {
       
        // Создание объектов разных классов
        Mammal lion = new Mammal("Lion", 5, "Yellow");
        Bird sparrow = new Bird("Sparrow", 2, true);
        
        // Использование методов и вывод информации
        lion.makeSound();
        lion.displayInfo();
        
        sparrow.makeSound();
        sparrow.displayInfo();
        }


        //Код для: Конструктор класса Animal

        // Animal animal = new Animal("Petr", 30);
        // animal.displayInfo();
        // Animal animal_2 = new Animal("Ivan");
        // animal_2.displayInfo();
        // Animal animal_3 = new Animal();
        // animal_3.age = 30;
        // animal_3.name = "Sergey";
        // animal_3.displayInfo();

    }
