public class TestMyRectangle {

    public static void main(String[] args) {
        // Create points
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(5, 6);

        // Create a rectangle using the points
        MyRectangle rectangle1 = new MyRectangle(p1, p2);
        System.out.println(rectangle1); // Test toString

        // Test getters and setters
        System.out.println("Top-left point: " + rectangle1.getTopLeft());
        System.out.println("Bottom-right point: " + rectangle1.getBottomRight());

        rectangle1.setTopLeft(new MyPoint(8, 7));
        rectangle1.setBottomRight(new MyPoint(4, 3));
        System.out.println("Updated rectangle: " + rectangle1);

        // Test width, height, area, and perimeter
        System.out.println("Width of rectangle: " + rectangle1.getWidth());
        System.out.println("Height of rectangle: " + rectangle1.getHeight());
        System.out.println("Area of rectangle: " + rectangle1.getArea());
        System.out.println("Perimeter of rectangle: " + rectangle1.getPerimeter());

        // Test isSquare
        System.out.println("Is rectangle ? " + rectangle1.isSquare());
    }
}
