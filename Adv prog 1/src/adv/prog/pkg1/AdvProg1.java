//Faris Kurtagic                         Feb 7, 2018
//this program creates both a default  triangle with a no-arg constructor and a 
//triangle with user-inputed constructors. it will calculate the area of both 
//triangles using the base and height.
package adv.prog.pkg1;
import java.util.Scanner;
public class AdvProg1 {
    public static void main(String[] args) {
        //creates a triangle with the default values using a no-arg constructor
        Triangle triangle1 = new Triangle ();
        //triangle1.getarea() computes area using the getarea method in Triangle
        System.out.println("Triangle 1 with the base of "+triangle1.getbase()+ 
                " and a height of "+ triangle1.getheight() +" has an area of "
                +triangle1.getarea());
        Scanner keyboard= new Scanner (System.in);
        System.out.println("Enter the desired base value for triangle 2 ");
        double base=keyboard.nextDouble();
        System.out.println("Enter the desired height value for triangle 2 ");
        double height=keyboard.nextDouble();
        //uses the inputed base and height to construct a new triangle
        Triangle triangle2= new Triangle(base, height);
        System.out.println("Triangle 2 with the base of "+triangle2.getbase()+ 
                " and a height of "+ triangle2.getheight() +" has an area of "
                +triangle2.getarea());
    }
    
}


