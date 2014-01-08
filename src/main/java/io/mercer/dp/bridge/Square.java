package io.mercer.dp.bridge;

public class Square extends Shape {
    public Square(double x, double y, double radius, DrawingAPI drawingAPI) {
        super(x, y, radius, drawingAPI);
    }

    @Override
    public void draw() {
        drawingAPI.drawSquare(x, y, radius);
    }

    @Override
    public void resizeByPercentage(double percentage) {
        x *= percentage;
        y *= percentage;
    }
}
