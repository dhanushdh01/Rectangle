package Rectangle;

/*
   Create a class Rectangle.
   It should have 3 data-members
   topLeft:Point
   height:int
   width:int
*/
public class Rectangle {
    Point topLeft;  // Represents the top-left corner of the rectangle
    int height;     // Height of the rectangle
    int width;      // Width of the rectangle

    // Constructor to initialize the Rectangle object
    public Rectangle(Point topLeft, int H, int W) {
        this.topLeft = topLeft;
        this.height = H;
        this.width = W;
    }

    /*
      It should have 3 methods
      getArea: It should return area of rectangle as an integer
      getParameter: It should return parameter of rectangle as an integer
      getBottomRight: It should return a Point to represent the bottom right of the Rectangle.
    */

    // Method to calculate and return the area of the rectangle
    int getArea() {
        return height * width;
    }

    // Method to calculate and return the perimeter of the rectangle
    int getParameter() {
        return 2 * (height + width);
    }

    // Method to calculate and return the bottom-right corner of the rectangle
    Point getBottomRight() {
        // Calculate the x-coordinate of the bottom-right corner
        int bottomRightX = topLeft.x + width;

        // Calculate the y-coordinate of the bottom-right corner
        int bottomRightY = topLeft.y - height;

        // Create and return a new Point for the bottom-right corner
        return new Point(bottomRightX, bottomRightY);
    }
}