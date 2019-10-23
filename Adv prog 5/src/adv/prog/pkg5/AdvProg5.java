package adv.prog.pkg5;
public class AdvProg5 {
    public static void main(String[] args) {
    // Declare and initialize two geometric objects
    ComparableCircle geoObject1 = new ComparableCircle(4);
    ComparableCircle geoObject2 = new ComparableCircle(6);
    ComparableRectangle geoObject3 = new ComparableRectangle(24,5);
    switch (geoObject1.compareTo(geoObject2)) {
        case 1:
            System.out.println("Object 1 is bigger than Object 2");
            break;
        case -1:
            System.out.println("Object 2 is bigger than Object 1");
            break;
        default:
            System.out.println("Object 1 and Object 2 are the same size");
            break;
    }
    
    switch (geoObject3.compareTo(geoObject2)){
        case 1:
            System.out.println("Object 3 is bigger than Object 2");
            break;
        case -1: 
            System.out.println("Object 2 is bigger than Object 3");
            break;
        default:
            System.out.println("Object 2 and Object 3 are the same size");
            break;
    }
    
    System.out.print("\nObject 1");
    displayGeometricObject(geoObject1);

    System.out.print("\nObject 2");
    displayGeometricObject(geoObject2);
    
    System.out.print("\nObject 3");
    displayGeometricObject(geoObject3);
  }

    public static void displayGeometricObject(GeometricObject object) {
        if (object instanceof Circle)
            System.out.print(" is a circle: ");
        else
            System.out.print(" is a rectangle: ");
        System.out.println();
        System.out.printf("The area is %.2f", object.getArea());
        System.out.printf("\nThe perimeter is %.2f \n", object.getPerimeter());
  }
    
    
}
