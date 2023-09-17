package homeworks.homework03.task1;

public class MainRectangle {

    // Интерфейс
    public interface ParamValue {
        int getValue(int Width, int Height);
    } 
    public static void main (String[] args) {
        ParamValue ParamValue = (val1, val2) -> 2*(val1 + val2);
        ParamValue ParamValue1 = (a, b) -> a * b;
        System.out.println(" Площадь  прямоугольника = " + ParamValue.getValue(4,4));
        System.out.println(" Периметр прямоугольника = " + ParamValue1.getValue(4 ,6));
    }
}


