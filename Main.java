package Rectangle;
import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Point of topLeft x : ");
        int x = sc.nextInt();
        System.out.println("Enter a Point of topLeft y : ");
        int y = sc.nextInt();
        // Create a Point object representing the top-left corner of the rectangle
        Point topLeft = new Point(x, y);
        System.out.println("Enter the Height of the Rectangle : ");
        int Height = sc.nextInt();
        System.out.println("Enter the Width of the Rectangle : ");
        int Width = sc.nextInt();
        // Create a Rectangle object using the Point as the top-left corner and dimensions

        Rectangle rectangle = new Rectangle(topLeft, Height, Width);

        // Calculate the area of the rectangle
        int area = rectangle.getArea();

        // Calculate the perimeter (parameter) of the rectangle
        int parameter = rectangle.getParameter();

        // Get the bottom-right corner of the rectangle
        Point bottomRight = rectangle.getBottomRight();

        System.out.println("-----------------------------------");
        // Print the calculated values
        System.out.println("Area : " + area);
        System.out.println("Parameter : " + parameter);
        System.out.println("BottomRight : " + bottomRight);
        System.out.println("-----------------------------------");
    }
}
