package homeworks.homework02.task02;

public class Main {
    public static void main (String[] args) {
        BasicMath basicMath = new BasicMath();
        int squaredNumber1 = MathHelper.square1(Constants.number1);
        int squaredNumber2 = MathHelper.square2(Constants.number2);
        int calculateArea = basicMath.add(squaredNumber1, squaredNumber2);
        int calculatePerimete = basicMath.multiplication(Constants.number3, Constants.number4);
        System.out.println(Constants.Text1 + calculateArea );
        System.out.println(Constants.Text2 + calculatePerimete);
    }    
}
