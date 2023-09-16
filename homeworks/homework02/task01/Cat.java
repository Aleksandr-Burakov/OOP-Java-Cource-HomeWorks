package homeworks.homework02.task01;

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
