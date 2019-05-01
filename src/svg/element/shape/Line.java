package svg.element.shape;

import svg.element.BaseElement;
import svg.element.Element;

public class Line extends Shape
    {

    double x1,y1,x2,2;
    String label = "rect";

    public Line(double x1, double y1, double x2, double y2)
    {
        super(label);   //set up the label
        this.x1 = x1;   //set up parameters
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

    }

    @Override
    public boolean load(final String expr)  //parse the string to extract the appropriate values
    {

        if(expr.contains("x1")){
            final Double result = SWParser.extractDouble(expr, "x1=");
            if(result!=null){
                x1 = result.doubleValue();
            }
            else{
                return false;
            }
        }

        if(expr.contains("y1")){
            final Double result = SWParser.extractDouble(expr, "y1=");
            if(result!=null){
                y1 = result.doubleValue();
            }
            else{
                return false;
            }
        }

        if(expr.contains("x2")){
            final Double result = SWParser.extractDouble(expr, "x2=");
            if(result!=null){
                x2 = result.doubleValue();
            }
            else{
                return false;
            }
        }

        if(expr.contains("y2")){
            final Double result = SWParser.extractDouble(expr, "y2=");
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