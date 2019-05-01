package svg.element.shape;

import svg.element.Element;

public class Path extends Shape {
    public Path() {
        super("path");
    }

    @Override
    public Element newInstance() {
        return new Path();
    }

    @Override
    public boolean load(String expr) {
        try
        {
            throw new Exception("SVG path loading not implemented yet.");
        }
        catch (Exception e)
        {
            // ...
        }
        return false;
    }
}
