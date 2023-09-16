package homeworks.homework02.task01;

public class Owner extends Cat {
    String nameOwner;

    // Конструктор класса Owner(имя) с наследованием Родительского класса Cat(имя, возрвст)
    public Owner(String name, int age, String nameOwner) {
        super(name, age);
        this.nameOwner = nameOwner;  
    }
 
    @Override
    public void displayInfo() {
        System.out.println(" Мяу! Меня зовут" + getName() + ". Мне " + getAge() + " лет. Мой владелец - " +  nameOwner + ".");
    }  
}