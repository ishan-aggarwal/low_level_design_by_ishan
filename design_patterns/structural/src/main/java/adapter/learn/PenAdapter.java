package adapter.learn;

import adapter.learn.friend.PilotPen;

// This is the adapter class that we will use in our code.
// It will implement the interface that we want to use in our code.
// It will also have a reference to the friend class that we want to use in our code.
// It will delegate the calls from this class method to the friend class that we want to use in our code.

public class PenAdapter implements Pen {

    PilotPen pilotPen = new PilotPen();

    @Override
    public void write(String str) {
        pilotPen.mark(str);
    }
}
