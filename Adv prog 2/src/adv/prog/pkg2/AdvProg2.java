//Faris Kurtagic                         Feb 20, 2018
//this program creates an array of three tiangles from randomly constructor
//values. it will calculate the area of the triangles using their base and height.
package adv.prog.pkg2;
public class AdvProg2 {
    
    public static void main(String[] args) {
        NewTriangle [] triangleArray;
        triangleArray= createTriangleArray();
        printTriangleArray(triangleArray);
    }
//creates the array of triangles
    public static NewTriangle[] createTriangleArray(){
        NewTriangle[] triangleArray = new NewTriangle[3];
        for (int i=0; i<triangleArray.length;i++)
            triangleArray[i]= new NewTriangle(Math.random()*100,Math.random()*100);
        return triangleArray;
    }
//prints the data of the triangles
    public static void printTriangleArray(NewTriangle[] triangleArray){
        for(int i=0;i<triangleArray.length;i++){
            int n=i+1;
            System.out.printf("\nTriangle %d with a base of %.2f and a height"
                    + " of %.2f has an area of %.2f", n, 
                    triangleArray[i].getbase(),triangleArray[i].getheight(), 
                    triangleArray[i].getarea());
        }
        System.out.println("\nTotal number of triangles = "+ NewTriangle.getcount());
    }
}
   
   
