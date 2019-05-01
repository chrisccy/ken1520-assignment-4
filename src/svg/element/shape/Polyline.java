package svg.element.shape;

import java.util.ArrayList;
import java.util.List;
import svg.SVGParser;
import java.awt.geom.Point2D;

public class Polyline extends Shape {
    List<Point2D> points = new ArrayList<Point2D>();
    double x;
}
