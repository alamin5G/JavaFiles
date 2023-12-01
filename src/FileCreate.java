import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {

//        single forward / for mac and linux
//        double backward \\ for windows
//        but we will use double backword \\ in our code.
        File file = new File("C:\\users\\alami\\OneDrive\\Desktop\\clientlist.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Client list created!");
    }
}