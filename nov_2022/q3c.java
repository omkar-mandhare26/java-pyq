package nov_2022;
// Write Java program which accepts string from user, if its length Less
// than five, then throw user defined exception "Invalid String" o erwise
// display string in uppercase.
import java.util.Scanner;

class StringException extends Exception{
    StringException(String message){
        super(message);
    }
}

public class q3c {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String str;
            System.out.print("Enter String: ");
            str = sc.nextLine();
            if(str.length()<5){
                throw new StringException("Invalid String");
            }
            System.out.println(str.toUpperCase());
        }catch(StringException e){
            System.out.println(e.getMessage());
        }
    }
}
