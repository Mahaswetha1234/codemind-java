import java.util.*;
class Average{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        float a=s.nextFloat();
        float b=s.nextFloat();
        float avg=(a+b)/2;
        System.out.println(String.format("%.4f",avg));
    }
}