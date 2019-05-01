package svg.element.shape;
import svg.SVGParser;

public class Ellipse extends Shape{

    double cx;
    double cy;
    double rx;
    double ry;

    public Ellipse() {
        super("ellipse");
    }

    @Override
    public boolean load(String expr){
        if(expr.contains(" cx=")){
            final Double result = SVGParser.extractDouble(expr, " cx=");
            if(result != null) {
                cx = result.doubleValue();
            }
            else{
                return false;
            }
        }
        if(expr.contains(" cy")){
            final Double result = SVGParser.extractDouble(expr, " cy=");
            if(result != null) {
                cy = result.doubleValue();
            }
            else{
                return false;
            }
        }
        if(expr.contains(" rx")){
            final Double result = SVGParser.extractDouble(expr, " rx=");
            if(result != null) {
                rx = result.doubleValue();
            }
            else{
                return false;
            }
        }
        if(expr.contains(" ry")) {
            final Double result = SVGParser.extractDouble(expr, " ry=");
            if (result != null) {
                ry = result.doubleValue();
            }
            else{
                return false;
            }
        }

        return true;
    }

}
