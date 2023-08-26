package Rectangle;
/*
   Create a class Point. It should have 2 data-members:
   x:int
   y:int
*/
public class Point {
    int x; // Represents the x-coordinate of the point
    int y; // Represents the y-coordinate of the point

    // Constructor to initialize the Point object with given coordinates
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}