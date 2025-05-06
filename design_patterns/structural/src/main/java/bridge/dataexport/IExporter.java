package bridge.dataexport;

public abstract class IExporter {
    protected IFormatter formatter;

    public IExporter(IFormatter formatter) {
        this.formatter = formatter;
    }

    public abstract String export(); // returns a string instead of File for simplicity
}
