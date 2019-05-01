package svg.element.shape;

import svg.SVGParser;

public class Rectangle extends Shape{

    private double x, y, rx, ry, width, length;

    public Rectangle(){
        super("rectangle");
    }

    @Override
    public boolean load(String expr){
        if(expr.contains(" x=")){
            final Double result = SVGParser.extractDouble(expr, " x=");
            if(result != null) {
                x = result.doubleValue();
            }
            else{
                return false;
            }
        }
        if(expr.contains(" y=")){
            final Double result = SVGParser.extractDouble(expr, " y=");
            if(result != null){
                y = result.doubleValue();
            }
            else{
                return false;
            }
        }
        if(expr.contains(" rx=")) {
            final Double result = SVGParser.extractDouble(expr, " rx=");
            if (result != null) {
                rx = result.doubleValue();
            }
            else{
                return false;
            }
        }

        if(expr.contains(" ry=")){
            final Double result = SVGParser.extractDouble(expr, " ry=");
            if(result != null) {
                ry = result.doubleValue();
            }
            else{
                return false;
            }
        }
        if(expr.contains(" width=")){
            final Double result = SVGParser.extractDouble(expr, " width=");
            if(result != null){
                width = result.doubleValue();
            }
            else{
                return false;
            }
        }
        if(expr.contains(" length=")) {
            final Double result = SVGParser.extractDouble(expr, " length=");
            if (result != null) {
                length = result.doubleValue();
            }
            else{
                return false;
            }
        }

        return true;
    }

}
