package svg.element.shape;

import java.util.ArrayList;
import java.util.List;
import svg.SVGParser;
import svg.element.Element;

public class Polyline extends Shape {
    List<Point2D> points = new ArrayList<Point2D>();
    double x;

    public Polyline() {
        super("polyline");
    }

    public Polyline(String label) {
        super(label);
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
            e.printStackTrace();
            return false;
        }
    }

    public Element newInstance(){
        Polyline newPolyline = new Polyline();
        return newPolyline;
    }

    @Override
    public String toString() {
        String out = label() + ": ";
        for (Point2D point : points) {
            out += String.format("(%.1f,%.1f) ", point.x, point.y);
        }
        return out;
    }
}
