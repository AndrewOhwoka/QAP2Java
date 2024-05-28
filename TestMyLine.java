
public class TestMyLine {

    public static void main(String[] args) {
        
        // Create points
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);

        // Create a line using the points
        MyLine line1 = new MyLine(p1, p2);
        System.out.println(line1); // Test toString

        // Test getters and setters
        System.out.println("Begin point: " + line1.getBegin());
        System.out.println("End point: " + line1.getEnd());

        line1.setBegin(new MyPoint(0, 0));
        line1.setEnd(new MyPoint(3, 4));
        System.out.println("Updated line: " + line1);

        // Test length and gradient
        System.out.println("Length of line: " + line1.getLength());
        System.out.println("Gradient of line: " + line1.getGradient());

        // Test coordinate setters
        line1.setBeginXY(2, 3);
        line1.setEndXY(5, 7);
        System.out.println("Line after setting coordinates: " + line1);
    }
    }
