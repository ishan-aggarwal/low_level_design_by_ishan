package adapter.before;

import java.util.Arrays;

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

public class AdapterDemo {
    public static void main(String[] args) {
        Object[] shapes = {new Line(), new Rectangle()};
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        int width = 40, height = 40;

        Arrays.stream(shapes).forEach(
                eachShape -> {
                    if (eachShape instanceof Line) {
                        ((Line) eachShape).draw(x1, y1, x2, y2);
                    } else if (eachShape instanceof Rectangle) {
                        ((Rectangle) eachShape).draw(x2, y2, width, height);
                    }
                }
        );
    }
}
