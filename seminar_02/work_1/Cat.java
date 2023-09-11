package seminar_02.work_1;

import seminar_02.work_1.SoundMaker;

class Cat implements SoundMaker {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " meows.");
    }
}
