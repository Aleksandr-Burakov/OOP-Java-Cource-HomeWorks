package HomeWorks.homework_01_02;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle (int width, int height){
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

    public void calculateArea () {
        System.out.println(" Площадь  прямоугольника = " + width * height);
    }

     public void calculatePerimete () {
        System.out.println(" Периметр прямоугольника = " + 2*(width + height));
    }  
    public static void main (String[] args) {
       Rectangle calculateA = new Rectangle(10, 5);
       calculateA.calculateArea();
       calculateA.calculatePerimete();
    }   
}