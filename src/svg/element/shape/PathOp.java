package svg.element.shape;

public abstract class PathOp {
    protected char label;
    protected boolean absolute;

    PathOp(char label, boolean absolute) {
        this.label = label;
        this.absolute = absolute;
    }
}
