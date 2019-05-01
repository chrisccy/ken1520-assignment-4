package svg.element.shape;

import svg.SVGParser;

public class Circle extends Shape {

    double cx;
    double cy;
    double r;


    public Circle(double cx, double cy, double r){
        this.cx = cx;
        this.cy = cy;
        this.r = r;
        super("circle");
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
        if(expr.contains(" cy=")){
            final Double result = SVGParser.extractDouble(expr, " cy=");
            if(result != null){
                cy = result.doubleValue();
            }
            else{
                return false;
            }
        }
        if(expr.contains(" r=")) {
            final Double result = SVGParser.extractDouble(expr, " r=");
            if (result != null) {
                r = result.doubleValue();
            }
            else{
                return false;
            }
        }

        return true;
    }
}
