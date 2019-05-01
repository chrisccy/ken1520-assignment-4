package svg.element.shape;

import svg.SVGParser;
import svg.element.Element;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Path extends Shape {
    public Path() {
        super("path");
    }

    @Override
    public Element newInstance() {
        return new Path();
    }

    @Override
    public boolean load(String expr) {
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
                System.out.println(opString);
            }
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
}
