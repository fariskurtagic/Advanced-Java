package adv.prog.pkg4;
public class TriangleWithExceptions extends GeometricObject {
    private double base=1;
    private double side1=1;
    private double side2=1;
    private static int count=0;
//constructs a triangle with sides of 1
    public TriangleWithExceptions() throws IllegalTriangleException{
        count++;
    }
//constructs a triangle with specified base, sides, fill and color
    public TriangleWithExceptions(double base, double side1, double side2, String color, boolean filled) throws IllegalTriangleException{
        if(base<=side1+side2&&side1<=base+side2&&side2<=base+side1){
            super.setColor(color);
            super.setFilled(filled);
            this.base=base;
            this.side1=side1;
            this.side2=side2;
            count++;
        }
        else if(base>side1+side2)
           throw new IllegalTriangleException(base);
        else if(side1>base+side2)
           throw new IllegalTriangleException(side1);
        else if(side2>base+side1)
           throw new IllegalTriangleException(side2);
        
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
    
    public void setbase(double newBase) throws IllegalTriangleException{
        base= newBase;
    }
    public void setside1(double newSide1){
        side1 = newSide1;
    }
    public void setside2(double newSide2){
        side1 = newSide2;
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