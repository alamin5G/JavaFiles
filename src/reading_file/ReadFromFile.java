package reading_file;

import java.io.*;

public class ReadFromFile {
    public static void main(String[] args){
        File file = new File("MyFolder\\Alamin\\ClientList.txt");
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String  line;
//            first, bufferReader.readLine() method assign to the line  and if line is not equal to null,
//            while loop will work until the line get null value from the bufferReader.readLine() method..
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

            System.out.println("File Read Operation is successful!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;
    }
}
