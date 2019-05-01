package svg.element.shape;

import java.util.Scanner;

public class QuadraticTo extends PathOp {
    private double x1,x2,y1,y2;

    public QuadraticTo() { super('Q'); }

    @Override
    public PathOp makeInstance() { return new QuadraticTo(); }

    @Override
    public boolean load(String expr) {
        super.absolute = Character.isUpperCase(expr.toCharArray()[0]);
        String exprPoint1 = expr.substring(1,expr.indexOf(" "));
        String exprPoint2 = expr.substring(expr.indexOf(" ")+1);

        Scanner scanner = new Scanner(exprPoint1.trim()).useDelimiter(",");
        x1 = scanner.nextInt(); y1 = scanner.nextInt();
        scanner = new Scanner(exprPoint2.trim()).useDelimiter(",");
        x2 = scanner.nextInt(); y2 = scanner.nextInt();
        return true;
    }

    @Override
    protected String parameterString() {
        return String.format("x1=%.1f, y1=%.1f, x2=%.1f, y2=%.1f",
                x1, y1, x2, y2);
    }
}
