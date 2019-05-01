package svg.element.shape;

import java.util.Scanner;

public class MoveTo extends PathOp {
    private double x,y;

    public MoveTo() { super('M'); }

    @Override
    public PathOp makeInstance() { return new MoveTo(); }

    @ Override
    public boolean load(String expr) {
        super.absolute = Character.isUpperCase(expr.toCharArray()[0]);
        String exprPoint1 = expr.substring(1,expr.indexOf(" "));
        Scanner scanner = new Scanner(exprPoint1).useDelimiter(",");
        x = scanner.nextInt(); y = scanner.nextInt();
        return true;
    }

    @Override
    protected String parameterString() {
        return String.format("x=%.1f, y=%.1f", x, y);
    }
}
