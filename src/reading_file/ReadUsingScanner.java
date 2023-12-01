package reading_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadUsingScanner {
    public static void main(String[] args){
        try {
            Scanner input = new Scanner(new File("MyFolder\\Alamin\\ClientList.txt"));
            String line;
            while (input.hasNext()){
                line = input.nextLine();
                System.out.println(line);
            }
            input.close();
            System.out.println("Data read successfully!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
