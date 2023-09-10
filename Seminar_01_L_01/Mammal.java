package Seminar_01_L_01;
    //class Mammal (extends (наследует)) содержимое базового, родительского класса Animal
class Mammal extends Animal {
    // Добовляем новое значение для создаваемого объекта
    String furColor;

    // Конструктор класса Mammal
    public Mammal(String name, int age, String furColor) {
        super(name, age); // super Вызов конструктора базового, родительского класса Animal
        this.furColor = furColor;
    }
    
    // Переопределение метода makeSound() - полиморфизм
    // Полиморфизм - это переопределение метода makeSound() в базовом, родительском классе Animal
    @Override //Делает проверку есть в базовом, родительском классе Animal такой метод
    public void makeSound() {
        System.out.println("The mammal makes a mammal sound.");
    }

    // Метод для вывода информации о млекопитающем, включая наследованные свойства
    @Override
    public void displayInfo() {
        super.displayInfo(); // Вызов метода базового, родительского класса
        System.out.println("Fur color: " + furColor);
    }
}
