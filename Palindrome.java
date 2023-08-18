import java.util.Scanner;
public class Me{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int n,s=0,i,r;
        n=a.nextInt();
        i=n;
        while(i!=0)
        {
            r=i%10;
            s=s*10+r;
            i=i/10;
        }
        if(s==n)
          System.out.print("Palindrome");
        else
          System.out.print("Not Palindrome");
          
    }
}