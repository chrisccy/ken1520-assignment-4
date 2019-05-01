package svg.element.shape;

import java.util.Scanner;

public class CubicTo extends PathOp {
    private double x1, x2, x3, y1, y2, y3;

    public CubicTo() { super('C'); }

    @Override
    public PathOp makeInstance() { return new CubicTo(); }

    @ Override
    public boolean load(String expr) {
        super.absolute = Character.isUpperCase(expr.toCharArray()[0]);
        String exprPoint1 = expr.substring(1,expr.indexOf(" "));
        String exprPoint2 = expr.substring(expr.indexOf(" ")+1);
        String exprPoint3 = expr.substring(expr.indexOf(" ")+1);

        Scanner scanner = new Scanner(exprPoint1).useDelimiter(",");
        x1 = scanner.nextInt(); y1 = scanner.nextInt();
        scanner = new Scanner(exprPoint2).useDelimiter(",");
        x2 = scanner.nextInt(); y2 = scanner.nextInt();
        scanner = new Scanner(exprPoint3).useDelimiter(",");
        x3 = scanner.nextInt(); y3 = scanner.nextInt();
        return true;
    }
}
