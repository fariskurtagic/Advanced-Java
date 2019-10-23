package adv.prog.pkg4;
public class AdvProg4 {
    public static void main(String[] args) {
        try{
            TriangleWithExceptions triangle= new TriangleWithExceptions();
            System.out.println("Triangle 1 "+triangle.toString());
            TriangleWithExceptions triangle2= new TriangleWithExceptions(3,11,6,"red", true);
            System.out.println("Triangle 2 "+triangle2.toString());
            TriangleWithExceptions triangle3= new TriangleWithExceptions(3,5,6,"green", true);
            System.out.println("Triangle 3 "+triangle3.toString());
        }
        catch(IllegalTriangleException ex){
            System.out.println(ex);
        }
        System.out.println("\nthe total number of triangles formed = "+TriangleWithExceptions.getcount());
    }
    
}
