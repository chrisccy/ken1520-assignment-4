package svg.element.shape;

import java.util.Scanner;

public class MoveTo extends PathOp {
    private double x,y;

    public MoveTo(String expr) {
        super('L', true);
        String exprPoint1 = expr.substring(1,expr.indexOf(" "));
        Scanner scanner = new Scanner(exprPoint1).useDelimiter(",");
        x = scanner.nextInt(); y = scanner.nextInt();
    }
}
