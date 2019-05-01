package svg.element.shape;

import java.util.Scanner;

public class LineTo extends PathOp {
    private double x,y;

    public LineTo(String expr) {
        String exprPoint1 = expr.substring(1,expr.indexOf(" "));
        String exprPoint2 = expr.substring(expr.indexOf(" ")+1);

        Scanner scanner = new Scanner(exprPoint1).useDelimiter(",");
        x = scanner.nextInt(); y = scanner.nextInt();
    }
}
