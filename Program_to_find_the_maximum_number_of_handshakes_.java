import java.util.*;
class Handshaking{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        long a=s.nextLong();
        long hs=a*(a-1);
        System.out.println(hs/2);
    }
}