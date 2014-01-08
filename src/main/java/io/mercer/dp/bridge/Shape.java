package io.mercer.dp.bridge;

public abstract class Shape {
    protected DrawingAPI drawingAPI;
    protected double x;
    protected double y;
    protected double radius;

    public Shape(double x, double y, double radius, DrawingAPI drawingAPI) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.drawingAPI = drawingAPI;
    }

    public abstract void draw();
    public abstract void resizeByPercentage(double percentage);

}