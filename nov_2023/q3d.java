package nov_2023;
// Write a java program to display ASCII values of the characteryfrom a file.

import java.io.*;

public class q3d {
    public static void main(String[] args) {
        try{
            File file = new File("./nov_2023/input.txt");
            FileInputStream inputFile = new FileInputStream(file);
            int i;
            while((i=inputFile.read())!= -1){
                System.out.println(i);
            }
            inputFile.close();
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
