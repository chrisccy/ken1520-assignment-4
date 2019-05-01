package svg.element.shape;

import java.util.Scanner;

public class QuadraticTo extends PathOp {
    private double x1,x2,y1,y2;


    public QuadraticTo(String expr) {
        String exprPoint1 = expr.substring(1,expr.indexOf(" "));
        String exprPoint2 = expr.substring(expr.indexOf(" ")+1);

        Scanner scanner = new Scanner(exprPoint1).useDelimiter(",");
        x1 = scanner.nextInt(); y1 = scanner.nextInt();
        scanner = new Scanner(exprPoint2).useDelimiter(",");
        x2 = scanner.nextInt(); y2 = scanner.nextInt();
    }
}
