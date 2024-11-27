package nov_2023;
// Write a 'java' prog to check whether given number is Armstrong or not. (Use static keyword
public class q4d {
    public static void main(String[] args) {
        int n = 1530;
        if(isArmstrong(n)){
            System.out.println(n+" is Armstrong");
        }else{
            System.out.println(n+" is not Armstrong");
        }
    }

    public static boolean isArmstrong(int n){
        int sum = 0;
        int temp = n;
        int rem;
        while(temp>0){
            rem = temp%10;
            sum += rem*rem*rem;
            temp/= 10;
        }
        return (n==sum);
    }
}
