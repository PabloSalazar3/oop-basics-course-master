public class Circle extends PlaneFigure {

    public Circle() {
        super("Circle");
        setEdgeNumber(0);
    }

    public Circle(double edgeLength) {
        super("Circle");
        setEdgeLength(edgeLength);
        setEdgeNumber(0);
    }

    @Override
    protected double calculatePerimeter() {
        return getEdgeLength() * Math.PI * 2;
    }

    @Override
    protected double calculateArea() {
        return Math.pow(getEdgeLength(), 2) * Math.PI;
    }

}
