import java.util.Scanner;
public class Me{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        if(n%2!=0)
        System.out.println("weird");
        else if(n%2==0)
        System.out.println("not weird");
        s.close();
    }
}