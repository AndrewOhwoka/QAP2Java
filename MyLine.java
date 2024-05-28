public class MyLine {
    //Fields
    private MyPoint begin;
    private MyPoint end;
    
    //Constructors
    public MyLine(int x1, int y1, int x2, int y2)
    {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }
    
    
    public MyLine(MyPoint begin, MyPoint end)
    {
        this.begin = begin;
        this.end = end;
    }

    //Getters & Setters
    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }
    
    public int getBeginX()
    {
        return begin.getX();
    }
    
    public void setBeginX(int x)
    {
        begin.setX(x);
    }

    public int getBeginY()
    {
        return begin.getY();
    }
    
    public void setBeginY(int y)
    {
        begin.setY(y);
    }

    public int getEndX()
    {
        return end.getX();
    }
    
    public void setEndX(int x)
    {
        end.setX(x);
    }
    
    public int getEndY()
    {
        return end.getY();
    }
    
    public void setEndY(int y)
    {
        end.setY(y);
    }

    public int[] getBeginXY()
    {
        return new int[] {begin.getX(), begin.getY()};
    }
    
    public void setBeginXY(int x, int y)
    {
        begin.setX(x);
        begin.setY(y);
    }
    
    public int[] getEndXY()
    {
        return new int[] {end.getX(), end.getY()};
    }
    
    public void setEndXY(int x, int y)
    {
        end.setX(x);
        end.setY(y);
    }

    //Methods

    public double getLength()
    {
        int xDiff = this.end.getX() - this.begin.getX();
        int yDiff = this.end.getY() - this.begin.getY();
        return (Math.sqrt((xDiff*xDiff) + (yDiff*yDiff)));
    }

    public double getGradient()
    {
        int xDiff = this.end.getX() - this.begin.getX();
        int yDiff = this.end.getY() - this.begin.getY();
        return Math.atan2(yDiff, xDiff);
    }

    public String toString()
    {
        return ("Begin: " + this.begin + " End: " + this.end);
    }


    
}
