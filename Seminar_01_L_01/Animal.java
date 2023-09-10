package Seminar_01_L_01;

class Animal {
    String name;
    int age;


// Конструктор класса Animal
public Animal(String name, int age) {
    this.name = name;
    this.age = age;
}
public Animal(String name) {
    this.name = name;

}

// Создание пустого объекта для дальнейшего использования пользователем.
public Animal() {
}

//Метод для издания звука
public void makeSound() {
    System.out.println("The animal makes a sound.");
}

//Метод для вывода информации о животном
public void displayInfo(){
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
}
}