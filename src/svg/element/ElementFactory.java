package svg.element;
import svg.element.shape.*;

import java.util.*;

public class ElementFactory {

    private List<Element> prototypes = new ArrayList<>();

    public ElementFactory() {
        prototypes.add(new Circle());
        prototypes.add(new Ellipse());
        prototypes.add(new Rectangle());
        prototypes.add(new Line());
        prototypes.add(new Polyline());
        prototypes.add(new Path());
    }

    public List<Element> prototypes() { return prototypes; }

    public Element makeElement(String expr) {
        for (Element prototype : prototypes()) {
            if (expr.contains(prototype.label())) {
                Element out = prototype.newInstance();
                out.load(expr);
                return out;
            }
        }
        return null;
    }


}
