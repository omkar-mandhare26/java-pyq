package nov_2023;
// Write a java program to search given name into the array, if itis found then display its index otherwise display appropriate message.

public class q3c {
    public static void main(String[] args) {
        String[] names = {"Martin", "Avicii", "KSHMR", "Hardwell"}; 
        String nameCheck = "Omkar";
        int len = names.length, i =0;

        for(i=0;i<len;i++){
            if(names[i].equals(nameCheck)){
                System.out.println("Index of "+names[i]+" is "+i);
                break;
            }
        }

        if(i==len){
            System.out.println("Name not found");
        }
    
    }
}
