public class MyRectangle {

    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Constructors
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Getters and setters
    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    // Method to calculate the width of the rectangle
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // Method to calculate the height of the rectangle
    public int getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    // Method to calculate the area of the rectangle
    public int getArea() {
        return getWidth() * getHeight();
    }

    // Method to calculate the perimeter of the rectangle
    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    // Method to calculate square of the rectangle
    public boolean isSquare() {
        return getWidth() == getHeight();
    }
   
    // toString method
   
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ",bottomRight=" + bottomRight + "]";
    }
}
