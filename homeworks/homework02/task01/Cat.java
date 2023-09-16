package homeworks.homework02.task01;

class Cat implements Pet {
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
     @Override
    public void greet() {
        System.out.println(" Мяу! Меня зовут" + name + ". Мне " + age + " лет.");
    }

    @Override
    public void displayInfo() {
    }
}