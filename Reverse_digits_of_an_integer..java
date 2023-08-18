import java.util.Scanner;
public class Me{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int rev=0,rem,n;
        n=s.nextInt();
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.printf("%d",rev);
        
    }
}