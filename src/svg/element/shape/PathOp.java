package svg.element.shape;

public abstract class PathOp {
    protected char label;
    protected boolean absolute;

    PathOp(char label) {
        this.label = label;
        this.absolute = true;
    }

    public abstract PathOp makeInstance();

    public abstract boolean load(String expr);
}
