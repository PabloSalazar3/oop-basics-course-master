public abstract class PlaneFigure {
    private String name;
    private int edgeNumber;
    private double edgeLength;

    protected abstract double calculatePerimeter();

    protected abstract double calculateArea();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdgeNumber() {
        return edgeNumber;
    }

    public void setEdgeNumber(int edgeNumber) {
        this.edgeNumber = edgeNumber;
    }

    public double getEdgeLength() {
        return edgeLength;
    }

    public  void setEdgeLength(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    public PlaneFigure(String name) {
        this.name = name;
    }

    public PlaneFigure() {}
}
