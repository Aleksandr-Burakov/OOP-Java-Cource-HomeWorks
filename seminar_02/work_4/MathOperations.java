package seminar_02.work_4;

// Интерфейс для математических операций
interface MathOperations {

    int add(int a, int b);

    default int subtract(int a, int b) {
        return a - b;
    }
}