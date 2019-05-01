package svg.element;
import svg.element.shape.*;

import java.util.*;

public class ElementFactory {

    List<Element> prototypes = new ArrayList<>();

    public ElementFactory{
        prototypes.add(new Circle());
        prototypes.add(new Ellipse());
        prototypes.add(new Line());
        prototypes.add(new Polyline());
        prototypes.add(new Rectangle());
    }


}
