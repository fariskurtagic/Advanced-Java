package adv.prog.pkg3;
public class AdvProg3 {
    public static void main(String[] args) {
        TriangleGO triangle= new TriangleGO();
        System.out.println("the triangle " + triangle.toString());
        TriangleGO triangle2= new TriangleGO(3,5,6,"green", true);
        System.out.println("\nthe triangle " + triangle2.toString());
        System.out.println("\nthe total number of triangles formed = "+triangle2.getcount());
    }
}