package nov_2022;
// What is recursion is Java? Write a Java Progra opal factorial of a given number using recursion.
public class q3e {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
}
