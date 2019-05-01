package svg.element.shape;

import svg.SVGParser;
import svg.element.Element;

public class Point2D {
    public double x;
    public double y;

    public Point2D( double x, double y){
        this.x=x;
        this.y=y;
    }

    public boolean load(String expr) {

        if (expr.contains(" x=")){
            final Double result = SVGParser.extractDouble(expr, " x=");
            if (result != null) {
                x = result.doubleValue();
            }
            else {
                return false;
            }
        }

        if (expr.contains(" y=")){
            final Double result = SVGParser.extractDouble(expr, " y=");
            if (result != null) {
                y = result.doubleValue();
            }
            else {
                return false;
            }
        }

        return true;
    }

}
