package svg.element.shape;

import svg.SVGParser;
import svg.element.Element;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Path extends Shape {

    private List<PathOp> operations;

    public Path() {
        super("path");
    }

    @Override
    public Element newInstance() {
        return new Path();
    }

    @Override
    public boolean load(String expr) {
        operations = new ArrayList<>();
        try
        {
            // We first extract the path data string
            int dataLocation = expr.indexOf("d=\"") + 2;
            String dataString = SVGParser.extractStringAt(expr, dataLocation);

            // Use regex to find operation patterns
            // [A-Za-z] means "find sequence starting with letter"
            // [0-9,. ]* means "if there are numbers, dots, commas or spaces after the letter then include them also
            String patternString = "[A-Za-z][0-9,. ]*";
            Pattern operationPattern = Pattern.compile(patternString);
            Matcher match = operationPattern.matcher(dataString);

            while (match.find()) {
                String opString = match.group();
                PathOp newOp = PathOp.makeOp(opString);
                operations.add(newOp);
            }
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public String toString() {
        String out = "path: ";
        for (PathOp op : operations) {
            out += op.toString() + " ";
        }
        return out;
    }
}
