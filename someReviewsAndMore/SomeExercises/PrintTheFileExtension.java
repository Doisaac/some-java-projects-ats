/**
 * Software that prints the extension of a file
 */
package SomeExercises;

/**
 *
 * @author MrDoisaac
 */
public class PrintTheFileExtension {
    public static void main(String[] args) {
        String fileName = "somefile.douglas_isaac_Barrera.pdf";
        
        //find out the position of the last point
        int pointPosition = fileName.lastIndexOf(".");
        System.out.println("The file extension is: ".concat(fileName.substring(pointPosition)));
    }
}
