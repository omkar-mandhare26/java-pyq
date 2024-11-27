package nov_2023;
// Write a Javaprogram to calculate area of Circle, Triangle & Rectangle.(Use Method Overloading),.

class Areas{
    public double area(double r){
        return 3.14*r*r;
    }
    public double area(double b,double h){
        return 2*b*h;
    }
    public double area(double l,double b,double h){
        return 2*(l*b+b*h+l*h);
    }
}

public class q3b {
    public static void main(String[] args) {
        Areas a = new Areas();
        System.out.println("Area of Circle is "+a.area(5));
        System.out.println("Area of Triangle is "+a.area(5,5));
        System.out.println("Area of Rectangle is "+a.area(5,5,5));
    }
}
