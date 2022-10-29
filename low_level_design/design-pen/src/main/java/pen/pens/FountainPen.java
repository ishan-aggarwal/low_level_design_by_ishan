package pen.pens;


import pen.Ink;
import pen.Nib;
import pen.writestrategies.WriteStrategy;

public class FountainPen extends Pen {
    private Ink ink;
    private Nib nib;

    public FountainPen(WriteStrategy writeStrategy) {
        super(writeStrategy);
    }


    @Override
    public void write() {

    }
}
