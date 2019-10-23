package adv.prog.pkg5;
public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    
    public ComparableCircle(double radius){
        super(radius);
    }
    @Override
    public int compareTo(ComparableCircle o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }
    @Override 
    public String toString() {
        return "radius: " + getRadius() + " Area: " + getArea();
  }
}
