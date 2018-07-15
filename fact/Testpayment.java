package fact;
import java.util.*;
public class Testpayment {
    public static void main(String args[])
    {Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Payment p=Classify.getPayment(s);
        System.out.println(p);
       //deSystem.out.println(p.getMode());
    }
}
