package delete_file;

import java.io.File;

public class DeleteFile {
    public static void main (String[] args){
        File file = new File("MyFolder\\clientList.txt");
        if (file.delete()){
            System.out.println("File deleted success!");
        }else{
            System.out.println("File deleted is not success!");
        }
    }
}
