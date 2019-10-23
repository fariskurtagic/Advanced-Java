package adv.prog.pkg1;
public class Triangle {
    private double base;
    private double height;
    //constructs a triangle with base and height of 1
    Triangle(){
        base=1;
        height=1;
    }
    //constructs a triangle with specified base and height
    Triangle(double newBase, double newHeight){
        base=newBase;
        height=newHeight;
    }
    //returns the height of the triangle
    double getheight(){
        return height;
    }
    //returns the base of the triangle 
    double getbase(){
        return base;
    }
   //returns and calculates the area of the triangle
    double getarea(){        
        return (base*height)/2;
    }
}


