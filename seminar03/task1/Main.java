

public class Main {
    public static void main(String[] args) {
        MyParamValue myParamValue;
        myParamValue = () -> 98.6;
        System.out.println(myParamValue.getValue());
    }
}