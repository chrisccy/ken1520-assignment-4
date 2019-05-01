package svg.element.shape;

import svg.element.BaseElement;
import svg.element.Element;

public class Shape extends BaseElement {

    public Shape() {
        super("Shape");
    }

    @Override
    public Element newInstance() {
        return new Shape();
    }

    @Override
    public boolean load(final String expr)
    {
        try
        {
            throw new Exception("SVG shape loading not implemented yet.");
        }
        catch (Exception e)
        {
            // ...
        }
        return false;
    }
}
