package svg.element.shape;

public class Close extends PathOp {
    public Close() { super('Z'); }

    @Override
    public PathOp makeInstance() { return new Close(); }

    @Override
    public boolean load(String expr) { return true; }

    @Override
    protected String parameterString() {
        return "";
    }
}
