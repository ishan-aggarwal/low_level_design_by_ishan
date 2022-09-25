package adapter.after;

import java.util.Arrays;

interface Shape {
    void draw(int x, int y, int z, int j);
}

class Line {
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println("Line from point A(" + x1 + ";" + y1 + "), to point B(" + x2 + ";" + y2 + ")");
    }
}

class Rectangle {
    public void draw(int x, int y, int width, int height) {
        System.out.println("Rectangle with coordinate left-down point (" + x + ";" + y + "), width: " + width
                + ", height: " + height);
    }
}

//class LineAdapter implements Shape {
//    private final Line adaptee;
//
//    public LineAdapter(Line line) {
//        this.adaptee = line;
//    }
//
//    @Override
//    public void draw(int x1, int y1, int x2, int y2) {
//        adaptee.draw(x1, y1, x2, y2);
//    }
//}

class RectangleAdapter implements Shape {
    private final Rectangle adaptee;

    public RectangleAdapter(Rectangle rectangle) {
        this.adaptee = rectangle;
    }

    /**
     * Basically in the RectangleAdapter draw method, we are getting 2 points (x1, y1) and (x2, y2)
     * which are used to draw a line
     * But we are converting the points into the format that can be used to draw a rectangle
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     */
    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        int x = Math.min(x1, x2);
        int y = Math.min(y1, y2);
        int width = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);
        adaptee.draw(x, y, width, height);
    }
}

public class AdapterDemo {
    public static void main(String[] args) {
//        Shape[] shapes = {new RectangleAdapter(new Rectangle()),
//                new LineAdapter(new Line())};

        Shape[] shapes = {new RectangleAdapter(new Rectangle())};
        // data is given in format of a line
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;

        Arrays.stream(shapes).forEach(eachShape -> eachShape.draw(x1, y1, x2, y2));

        // normal line draw call
        Line line = new Line();
        line.draw(x1, y1, x2, y2);
    }
}
