package folder_create;

import java.io.File;

public class FolderCreate {
    public static void main(String[] args) {

//        mkdir() is used for creating a single folder only.
        File file = new File("MyFolder");
        if(file.mkdir()){
            System.out.println("Folder Created");
        }else {
            System.out.println("Folder already exist!");
        }

//        mkdirs() is used for creating multiple folder

        File multipleFolder = new File("MyFolder\\SubFolder\\sub-subFolder");
        if (multipleFolder.mkdirs()){
            System.out.println("Folder created");
        }else {
            System.out.println("Folder already exist!");
        }


        File anotherSubFolder = new File("MyFolder\\Alamin");
        if (anotherSubFolder.mkdirs()){
            System.out.println("Sub folder created");
        }{
            System.out.println("Folder already exist!");
        }
    }
}
