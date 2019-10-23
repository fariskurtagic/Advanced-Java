package adv.prog.pkg4;
public class IllegalTriangleException extends Exception{
    private double base;
    
    public IllegalTriangleException(double base){
        super("Invalid side "+ base);
        this.base=base;
    }
    public double getside(){
        return base; 
    }
}
