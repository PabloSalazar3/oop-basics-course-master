import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        /******A******* Block for OOP Basic Concepts exercise ***********************/
        //create an instance for GeometricFigure
        //GeometricFigure triangle = new GeometricFigure("Square");
        //make a call for the myName method of the new instance
        //System.out.println(triangle.myNameIs());
        //make a call for the calculatePerimeter method of the new instance
        //System.out.println("My perimeter is: "+ triangle.calculatePerimeter());

        /******A********************** END ********************************************/


        /*****B************* Block for OOP 4Pillars exercise ***************************/
        // FIRST SECTION

        //Square square = new Square(1.0);
        //System.out.println("Perimeter for " + square.getName() + " is " + square.calculatePerimeter());
        //System.out.println("Area for " + square.getName() + " is " + square.calculateArea());

        // SECOND SECTION

        Square square = new Square(1.0);
        System.out.println("Perimeter for " + square.getName() + " is " + square.calculatePerimeter());
        System.out.println("Area for " + square.getName() + " is " + square.calculateArea());
        Circle circle = new Circle(1.0);
        System.out.println("Perimeter for " + circle.getName() + " is " + circle.calculatePerimeter());
        System.out.println("Area for " + circle.getName() + " is " + circle.calculateArea());

        /*****B*************************** END ****************************************/


        /*****C************* Block for Data Structures exercise ***************************/

        /*DataStructures fruits = new DataStructures(new String[5]);
        fruits.print();

        DataStructures chess = new DataStructures(new Integer[8][8]);
        chess.print();

        DataStructures vegetables = new DataStructures(new ArrayList<>());
        vegetables.print();

        DataStructures info = new DataStructures(new HashMap());
        info.print();

        DataStructures numbers = new DataStructures(new TreeSet());
        numbers.print(); */

        /*****C*************************** END ****************************************/

    }
}
