package io.mercer.dp.bridge;

public class Circle extends Shape {
    public Circle(double x, double y, double radius, DrawingAPI drawingAPI) {
        super(x, y, radius, drawingAPI);
    }

    @Override
    public void draw() {
        drawingAPI.drawCircle(x, y, radius);
    }

    @Override
    public void resizeByPercentage(double percentage) {
        radius *= percentage;
    }
}
