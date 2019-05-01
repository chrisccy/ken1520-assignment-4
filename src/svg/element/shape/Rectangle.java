public class Rectangle extends Shape {
    private final double x, y, rx, ry, width, length;

    public Rectangle(double x, double y, double rx, double ry,double width, double length, String label ) {
        this.x = x;
        this.y = y;
        this.rx = rx;
        this.ry = ry;
        this.width = width;
        this.length = length;
        super("rectangle");
    }

        @Override
        public boolean load(String expr){
            if(expr.contains(" x=")){
                final Double result = SVGParser.extractDouble(expr, " x=");
                if(result != null) {
                    cx = result.doubleValue();
                }
                else{
                    return false;
                }
            }
            if(expr.contains(" y=")){
                final Double result = SVGParser.extractDouble(expr, " y=");
                if(result != null){
                    cy = result.doubleValue();
                }
                else{
                    return false;
                }
            }
            if(expr.contains(" rx=")) {
                final Double result = SVGParser.extractDouble(expr, " rx=");
                if (result != null) {
                    r = result.doubleValue();
                }
                else{
                    return false;
                }
            }

            if(expr.contains(" ry=")){
                final Double result = SVGParser.extractDouble(expr, " ry=");
                if(result != null) {
                    cx = result.doubleValue();
                }
                else{
                    return false;
                }
            }
            if(expr.contains(" width=")){
                final Double result = SVGParser.extractDouble(expr, " width=");
                if(result != null){
                    cy = result.doubleValue();
                }
                else{
                    return false;
                }
            }
            if(expr.contains(" length=")) {
                final Double result = SVGParser.extractDouble(expr, " length=");
                if (result != null) {
                    r = result.doubleValue();
                }
                else{
                    return false;
                }
            }

            return true;
        }
    }
