package svg.element.shape;

import svg.SVGParser;
import svg.element.Element;

import java.util.ArrayList;
import java.util.List;

public class Polygon extends Polyline {
    double x;

    public Polygon() {
        super("polygon");
    }

    @Override
    public boolean load(String expr) {
        try
        {
            // We first extract the path data string
            int dataLocation = expr.indexOf("points=") + 7;
            String dataString = SVGParser.extractStringAt(expr, dataLocation);

            String[] strings = dataString.split(" ");

            for(int i=0; i<strings.length; i = i+2){
                points.add(new Point2D(Double.parseDouble(strings[i]), Double.parseDouble(strings[i+1])));
            }

            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public Element newInstance(){
        Polygon newPolygon = new Polygon();
        return newPolygon;
    }
}
