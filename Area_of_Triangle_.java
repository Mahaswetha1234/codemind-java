import java.util.*;
class Trianglearea{
    public static void main(String args[]){
        Scanner o=new Scanner(System.in);
        double a=o.nextInt();
        double b=o.nextInt();
        double c=o.nextInt();
        double s=(a+b+c)/2;
        double ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(String.format("%.2f",ar));
        
    }
    
}