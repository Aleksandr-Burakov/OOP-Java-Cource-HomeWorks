package seminar_02.work_3;

// Реализация интерфейса Animal
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}