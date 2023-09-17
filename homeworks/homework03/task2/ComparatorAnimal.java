package homeworks.homework03.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + " years)";
    }
}

public class ComparatorAnimal {
    public static void main(String[] args) {
        // Создаем Лист Собак
        List<Animal> dog = new ArrayList<>();
        dog.add(new Animal("Hard", 5));
        dog.add(new Animal("Algo", 7));
        dog.add(new Animal("Charlie", 2));
        // Создаем Лист Котов
        List<Animal> cat = new ArrayList<>();
        cat.add(new Animal("Orange", 1));
        cat.add(new Animal("Ralf", 4));
        cat.add(new Animal("Ariy", 3));

        System.out.println("\nЛист Собак:");
        for (Animal personAnimal : dog) {
            System.out.println(personAnimal);
        }

        // Создаем компаратор для сортировки по возрасту в порядке возрастания
        Comparator<Animal> ageComparator = Comparator.comparingInt(personAnimal -> personAnimal.age);

        // Сортируем список dog(Собак) с помощью компаратора
        Collections.sort(dog, ageComparator);

        System.out.println("\nСортировка Собак по возрасту:");
        for (Animal personAnimal : dog) {
            System.out.println(personAnimal);
        }

        // Создаем компаратор для сортировки по имени в алфавитном порядке
        Comparator<Animal> nameComparator = Comparator.comparing(personAnimal -> personAnimal.name);

        // Сортируем список с помощью нового компаратора
        Collections.sort(dog, nameComparator);

        System.out.println("\nСортировка Клички Собак по Алфавиту:");
        for (Animal personAnimal : dog) {
            System.out.println(personAnimal);
        }
       
        // Создаем компаратор для сортировки по имени в обратном алфавитном порядке
        Comparator<Animal> dognameComparator = (personAnimal1, personAnimal2) -> personAnimal2.name.compareTo(personAnimal1.name);

        // Сортируем список с использованием нового компаратора
        Collections.sort(dog, dognameComparator);
  
        System.out.println("\nОбратная Сортировка Клички Собаки по Алфавиту");
        for (Animal personAnimal : dog) {
            System.out.println(personAnimal);
        }

        System.out.println("\nЛист Кошек:");
        for (Animal catpersonAnimal : cat) {
            System.out.println(catpersonAnimal);
        }

        // Создаем компаратор для сортировки по имени в алфавитном порядке
        Comparator<Animal> catnameComparator = Comparator.comparing(catpersonAnimal -> catpersonAnimal.name);

        // Создаем компаратор для сортировки по возрастанию возраста
        Comparator<Animal> catageComparator = Comparator.comparingInt(catpersonAnimal -> catpersonAnimal.age);

        // Сортируем список с использованием компараторов
        Collections.sort(cat, catnameComparator.thenComparing(catageComparator));

        System.out.println("\nСортировка Имени Кошек  по Алфавиту:");
        for (Animal catpersonAnimal : cat) {
            System.out.println(catpersonAnimal);
        }

        // Обратная сортировка по имени
        Collections.sort(cat, catnameComparator.reversed().thenComparing(catageComparator));

        System.out.println("\nОбратная Сортировка Имени Кошек по Алфавиту:");
        for (Animal catpersonAnimal : cat) {
            System.out.println(catpersonAnimal);
        }
    }
}