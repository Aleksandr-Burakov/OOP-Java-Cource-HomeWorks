package homeworks.homework02.task02;

interface MathOperations {

    int add(int width, int height);

    default int multiplication(int width, int height) {
        return width * height;
    }
}