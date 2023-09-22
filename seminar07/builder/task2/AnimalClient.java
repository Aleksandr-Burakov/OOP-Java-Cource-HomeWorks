package seminar07.builder.task2;

// Класс животного с 5 полями (для примера)
class Animal {
  private String species;
  private String name;
  private int age;
  private String color;
  private String sound;

  public Animal(String species, String name, int age, String color, String sound) {
    this.species = species;
    this.name = name;
    this.age = age;
    this.color = color;
    this.sound = sound;
  }

  @Override
  public String toString() {
    return "Вид: " + species + ", Имя: " + name + ", Возраст: " + age + ", Цвет: " + color + ", Звук: " + sound;
  }
}

// Строитель для создания животных с 10 полями
class AnimalBuilder {
  private String species;
  private String name;
  private int age;
  private String color;
  private String sound;

  // Методы для установки значений полей и возврата самого себя для цепочки
  // вызовов
  public AnimalBuilder setSpecies(String species) {
    this.species = species;
    return this;
  }

  public AnimalBuilder setName(String name) {
    this.name = name;
    return this;
  }

  public AnimalBuilder setAge(int age) {
    this.age = age;
    return this;
  }

  public AnimalBuilder setColor(String color) {
    this.color = color;
    return this;
  }

  public AnimalBuilder setSound(String sound) {
    this.sound = sound;
    return this;
  }

  // Метод для создания объекта Animal на основе заданных значений
  public Animal build() {
    return new Animal(species, name, age, color, sound);
  }
}

public class AnimalClient {
  public static void main(String[] args) {
    // Используем строитель для создания объекта Animal с заданными параметрами
    Animal animal = new AnimalBuilder()
        .setSpecies("Собака")
        .setName("Барон")
        // .setAge(3)
        .setColor("Коричневый")
        // .setSound("Гав-гав")
        .build();

    // Выводим информацию о созданном животном
    System.out.println(animal); // Вывод: Вид: Собака, Имя: Барон, Возраст: 3, Цвет: Коричневый, Звук: Гав-гав
  }
}