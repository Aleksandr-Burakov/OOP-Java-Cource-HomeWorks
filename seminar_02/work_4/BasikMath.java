package seminar_02.work_4;
// Класс, реализующий интерфейс
class BasicMath implements MathOperations {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}