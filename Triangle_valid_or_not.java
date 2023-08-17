import java.util.Scanner;
public class Me{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a,b,c;
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if(a+b>c && a+c>b && b+c>a)
        System.out.println("Valid triangle");
        else
        System.out.println("Invalid triangle");
        s.close();
    }
}