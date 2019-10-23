package adv.prog.pkg3;
public class TriangleGO extends GeometricObject {
    private double base=1;
    private double side1=1;
    private double side2=1;
    private static int count=0;
//constructs a triangle with sides of 1
    public TriangleGO(){
        count++;
    }
//constructs a triangle with specified base, sides, fill and color
    public TriangleGO(double base, double side1, double side2, String color, boolean filled){
        super.setColor(color);
        super.setFilled(filled);
        this.base=base;
        this.side1=side1;
        this.side2=side2;
        count++;
    }    
//returns the base of the triangle 
    public double getbase(){
        return base;
    }
    public double getside1(){
        return side1;
    }
    public double getside2(){
        return side2;
    }
    public void setbase(double newBase){
        base= (newBase>=0)? newBase:0;
    }
    public void setside1(double newSide1){
        side1 = (newSide1>=0)? newSide1:0;
    }
    public void setside2(double newSide2){
        side1 = (newSide2>=0)? newSide2:0;
    }
//returns and calculates the area of the triangle
    public double getperimeter(){        
        return (base+side1+side2);
    }
    public static int getcount(){
        return count;
    }
    public String toString(){
        return ("created on " + this.getDateCreated() + "\ncolor: " + getColor() + 
            " filled: " + getFilled() +"\nhas a base of "+ getbase() + " and sides of "
            + getside1()+ " and "+getside2() +"\nthe perimeter = "+ getperimeter());
    }
}