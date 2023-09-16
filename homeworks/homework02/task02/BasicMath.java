package homeworks.homework02.task02;

// Класс, реализующий интерфейс
class BasicMath implements MathOperations {
    @Override
    public int add(int width, int height) {
        return 2*(width + height);
    }
}