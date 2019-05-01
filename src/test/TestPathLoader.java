package test;

import svg.element.shape.Path;

public class TestPathLoader {
    public static void main(String[] args) {
        Path path = new Path();
        path.load("<path d=\"M20,260 Q40,205 80,260 Z\" fill=\"none\" stroke=\"blue\" stroke-width=\"5\"/>\n");
    }
}
