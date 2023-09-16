package homeworks.homework02.task02;

public class MainRectangle {
    private int width;
    private int height;

    public MainRectangle (int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    } 

    public void setWidth(int width) {
        if (width > 0) {
        this.width = width;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0) {
        this.height = height;
        }
    }
    public static void main (String[] args) {
        BasicMath basicMath = new BasicMath();
        int squaredNumber1 = MathHelper.square1(Constants.number1);
        int squaredNumber2 = MathHelper.square2(Constants.number2);
        int calculateArea = basicMath.add(squaredNumber1, squaredNumber2);
        int calculatePerimete = basicMath.multiplication(Constants.number3, Constants.number4);
        System.out.println(" Площадь  прямоугольника = " + calculateArea );
        System.out.println(" Периметр прямоугольника = " + calculatePerimete);
    }   
}