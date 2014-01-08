package io.mercer.dp.bridge;

public class FancyDrawingAPI implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("Drawing fancy circle with (" + x + ", " + y + ") with radius " + radius);
    }

    @Override
    public void drawSquare(double x, double y, double radius) {
        System.out.println("Drawing fancy square with (" + x + ", " + y + ") with radius " + radius);
    }
}
