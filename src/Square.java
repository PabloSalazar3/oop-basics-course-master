public class Square extends PlaneFigure {

    public Square() {
        super("Square");
        setEdgeNumber(4);
    }

    public Square(double edgeLength) {
        super("Square");
        setEdgeLength(edgeLength);
        setEdgeNumber(4);
    }

    @Override
    protected double calculatePerimeter() {
        return getEdgeLength()*getEdgeNumber();
    }

    @Override
    protected double calculateArea() {
        return getEdgeLength()*getEdgeLength();
    }
}
