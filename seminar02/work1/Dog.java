package seminar02.work1;
class Dog implements SoundMaker {
    private String name;

    public Dog(String name) {
        this.name = name;
    }


    @Override
    public void makeSound() {
        System.out.println(name + " barks.");
    }
}