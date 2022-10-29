package pen;

import pen.pens.BallPen;
import pen.pens.Pen;
import pen.writestrategies.SmoothWriteStrategy;

public class Main {
    public static void main(String[] args) {
        Pen reynoldsTrimax = new BallPen(new SmoothWriteStrategy());

    }
}

// Client -> Pen.write() -> WriteSTrategy,writeBehaviou()