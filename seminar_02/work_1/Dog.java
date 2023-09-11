package seminar_02.work_1;

import seminar_02.SoundMaker;

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