package io.mercer.dp.bridge;

public class SimpleDrawingAPI implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("Drawing simple circle with (" + x + ", " + y + ") with radius " + radius);
    }

    @Override
    public void drawSquare(double x, double y, double radius) {
        System.out.println("Drawing simple square with (" + x + ", " + y + ") with radius " + radius);
    }
}
