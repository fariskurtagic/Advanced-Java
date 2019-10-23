package adv.prog.pkg2;
public class NewTriangle {
    private double base=1;
    private double height=1;
    private static int count=0;
//constructs a triangle with base and height of 1
    public NewTriangle(){
        count++;
    }
//constructs a triangle with specified base and height
    public NewTriangle(double newBase, double newHeight){
        base=newBase;
        height=newHeight;
        count++;
    }    
//returns the height of the triangle
    public double getheight(){
        return height;
    }
//returns the base of the triangle 
    public double getbase(){
        return base;
    }
    public void setbase(double newBase){
        base= (newBase>=0)? newBase:0;
    }
    public void setheight(double newHeight){
        height = (newHeight>=0)? newHeight:0;
    }
//returns and calculates the area of the triangle
    public double getarea(){        
        return (base*height)/2;
    }
    public static int getcount(){
        return count;
    }
}

