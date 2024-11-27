package nov_2023;
// copy only non-numeric data from one Flie to another

import java.io.*;

public class q4e {
    public static void main(String[] args) {
        String file1 = "./nov_2023/input.txt";
        String file2 = "./nov_2023/output.txt";
        try{
            File iFile = new File(file1);
            File oFile = new File(file2);
            FileInputStream inputFile = new FileInputStream(iFile);
            FileOutputStream outputFile = new FileOutputStream(oFile);
            int i;
            while((i=inputFile.read())!= -1){
                if(!Character.isDigit(i)){
                    outputFile.write(i);
                }
            }
            inputFile.close();
            outputFile.close();
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
