package file_write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteOnFile {
    public static void main(String[] args){
        /*Before doing any file operation in java we will use
        * try-catch block
        * */
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("MyFolder\\clientList.txt"))) {

//            using \n for inserting data in new line or as a list.
            bufferedWriter.write("Alamin\n");
            bufferedWriter.write("Arafat\n");
            bufferedWriter.write("Nuha\n");
            bufferedWriter.write("Amena\n");
            bufferedWriter.write("Nurul Amin\n");
            bufferedWriter.write("Sohel Rana\n");
            bufferedWriter.write("Enamul\n");
            bufferedWriter.write("Robiul\n");
            bufferedWriter.write("Sharif\n");
            bufferedWriter.write("Saddam\n");
            bufferedWriter.write("Sahadat\n");
            bufferedWriter.close();
            System.out.println("Data inserted\n");

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something went wrong!");
        }

//        Even I could write in this way
//        The true (append mode) adding the data each execution in your file even if it is duplicate
//        if we do not make it true (append) then our new text/data will not insert into the file
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("MyFolder\\Alamin\\ClientList.txt", true));
            bw.write("Alamin\n");
            bw.write("Arafat\n");
            bw.write("Nuha\n");
            bw.write("Amena\n");
            bw.write("Rakib\n");
            bw.write("Sohel\n\n"); //here uses two \n to notice the behaviour after each execution.
            bw.close(); //always close the BufferWriter, otherwise it may cause you some problems.
            System.out.println("Data inserted!");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Something went wrong!");
        }
    }
}
