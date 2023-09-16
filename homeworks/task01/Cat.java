// Задача 1:
// Создайте класс "Кот" (Cat) со следующими свойствами:
// __
// Приватное поле "имя" (name) типа String для хранения имени кота.
// Приватное поле "возраст" (age) типа int для хранения возраста кота.
// Публичные методы доступа (геттеры и сеттеры) для полей "имя" и "возраст".
// Публичный метод "приветствие" (greet), который выводит на консоль приветствие вида
//  "Мяу! Меня зовут <имя>. Мне <возраст> года(лет).".
// Дополнительное задание:
// Создайте класс "Владелец" (Owner) со свойством "имя" (name) типа String. 
// Добавьте соответствующее поле в классе "Кот" и методы доступа для него. 
// Измените метод "приветствие" класса "Кот", 
// чтобы он выводил приветствие вида "Мяу! Меня зовут <имя>.
//  Мне <возраст> года(лет). Мой владелец - <имя владельца>.".

package homeworks.task01;

class Cat {
    private String name;
    private int age;

    public Cat (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    } 

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

        public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void greet() {
        System.out.println(" Мяу! Меня зовут" + name + ". Мне " + age + " лет.");
    }
}

class Owner extends Cat {
    String nameOwner;

    // Конструктор класса Owner(имя) с наследованием Родительского класса Cat(имя, возрвст)
    public Owner(String name, int age, String nameOwner) {
        super(name, age);
        this.nameOwner = nameOwner;    
    }

    //Метод для вывода информации о Коте и Хозяине
    public void displayInfo(){
        System.out.println(" Мяу! Меня зовут" + super.getName() + ". Мне " + super.getAge() + " лет. Мой владелец -" + nameOwner + ".");
}   
}

class Main {
    public static void main(String[] args) {
        // Создание объекта кот и Хозяин        
        Owner man = new Owner(" Orange ", 8, " Djon ");
        man.greet();
        man.displayInfo();
        }      
}    

