package nov_2022;
// Write a java program to accept' 'n' integers from the user & store them
// in an Arraylist collection. Display the elements of ArrayList collection
// in reverse order.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class q4e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        Collections.reverse(list);
        System.out.println("Reversed list:");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        sc.close();
    }
}
