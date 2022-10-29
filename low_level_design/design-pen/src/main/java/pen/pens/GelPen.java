package pen.pens;


import pen.Refil;
import pen.writestrategies.WriteStrategy;

public class GelPen extends Pen {
    private Refil refil;

    public GelPen(WriteStrategy writeStrategy) {
        super(writeStrategy);
    }

    public Refil getRefil() {
        return refil;
    }

    public void setRefil(Refil refil) {
        this.refil = refil;
    }

    @Override
    public void write() {

    }
}
