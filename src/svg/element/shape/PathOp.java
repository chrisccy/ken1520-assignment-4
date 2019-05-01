package svg.element.shape;

import javafx.scene.shape.Line;

import java.util.Arrays;
import java.util.List;

public abstract class PathOp {
    protected char label;
    protected boolean absolute;

    PathOp(char label) {
        this.label = label;
        this.absolute = true;
    }

    public abstract PathOp makeInstance();

    public abstract boolean load(String expr);

    public static List<PathOp> prototypes() {
        return Arrays.asList(
                new Close(),
                new CubicTo(),
                new LineTo(),
                new MoveTo(),
                new QuadraticTo()
        );
    }

    public static PathOp makeOp(String opString) {
        Character opLabel = opString.charAt(0);

        for (PathOp prototype : prototypes()) {
            if (Character.toUpperCase(opLabel) == prototype.label) {
                PathOp out = prototype.makeInstance();
                out.load(opString);
                return out;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String parameterString = parameterString();
        String outString;
        if (!parameterString.isEmpty())
            outString = String.format("[%s: %s]", label, parameterString());
        else
            outString = String.format("[%s]", label);
        outString += (absolute ? "*":"");
        return outString;
    }

    protected abstract String parameterString();
}
