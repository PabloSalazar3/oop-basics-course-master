public class GeometricFigure {
    //declare the attributes

    private String name;
    private int sides = 4;
    private double sideLength = 1.0;

    //declare and implement the constructor

    public GeometricFigure(String name) {
        this.name = name;
    }


    //declare and implement the 2 remaining methods
    public String myNameIs(){
    return "Hello! My name is "+ this.name +"!";
    }

    public double calculatePerimeter(){
        return this.sides * this.sideLength;
    }


    //my new object is done! :)
}
