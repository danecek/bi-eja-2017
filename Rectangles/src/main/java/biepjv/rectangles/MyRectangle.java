package biepjv.rectangles;

public class MyRectangle {

    final MyPoint refPoint;
    final int width;
    final int height;

    @Override
    public String toString() {
        return "MyRectangle{" + "refPoint=" + refPoint + ", width=" + width + ", height=" + height + '}';
    }

    MyRectangle copy() {
        return new MyRectangle(refPoint, width, height);
    }

    int area() {
        return width * height;
    }

    int minX() {
        return refPoint.x;
    }

    int minY() {
        return refPoint.y - height;
    }

    int maxX() {
        return refPoint.x + width;
    }

    int maxY() {
        return refPoint.y;
    }
    
    static final MyRectangle zero = new MyRectangle(Integer.MAX_VALUE, Integer.MIN_VALUE, 1000, 1000); 

    public MyRectangle(int x, int y, int width, int height) {
        this(new MyPoint(x, y), width, height);
    }

    MyRectangle union(MyRectangle that) {
        int refX = Math.min(minX(), that.minX());
        int refY = Math.max(maxY(), that.maxY());
        int maxX = Math.max(maxX(), that.maxX());
        int minY = Math.min(minY(), that.minY());
        return new MyRectangle(refX, refY, maxX - refX, refY - minY);
    }

    public MyRectangle(MyPoint refPoint, int width, int height) {
        this.refPoint = refPoint;
        this.width = width;
        this.height = height;
    }

}
