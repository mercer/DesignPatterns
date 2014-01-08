package io.mercer.dp.bridge;

import org.junit.Test;

public class BridgeClientTest {
    @Test
    public void testDraw() throws Exception {
        Shape[] shapes = new Shape[]{
                new Circle(1, 2, 3, new SimpleDrawingAPI()),
                new Circle(1, 2, 3, new FancyDrawingAPI()),
                new Square(2, 10, 4, new SimpleDrawingAPI()),
                new Square(2, 10, 4, new FancyDrawingAPI()),
        };

        for (Shape shape : shapes) {
            shape.resizeByPercentage(2.5);
            shape.draw();
        }
    }
}
