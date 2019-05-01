package svg.element.shape;

import svg.SVGParser;

public class Line extends Shape{


    double x1,y1,x2,y2;
    String label = "line";

    public Line()
    {
        super(label);
    }

    @Override
    public boolean load(final String expr)  //parse the string to extract the appropriate values
    {

        if(expr.contains("x1")){
            final Double result = SVGParser.extractDouble(expr, "x1=");
            if(result!=null){
                x1 = result.doubleValue();
            }
            else{
                return false;
            }
        }

        if(expr.contains("y1")){
            final Double result = SVGParser.extractDouble(expr, "y1=");
            if(result!=null){
                y1 = result.doubleValue();
            }
            else{
                return false;
            }
        }

        if(expr.contains("x2")){
            final Double result = SVGParser.extractDouble(expr, "x2=");
            if(result!=null){
                x2 = result.doubleValue();
            }
            else{
                return false;
            }
        }

        if(expr.contains("y2")){
            final Double result = SVGParser.extractDouble(expr, "y2=");
            if(result!=null){
                y2 = result.doubleValue();
            }
            else{
                return false;
            }
        }

        return true;

    }
}
