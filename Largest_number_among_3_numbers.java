import java.util.Scanner;
public class Me{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a,b,c;
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if(a>c && a>b)
        System.out.printf("%d",a);
        else
        System.out.printf("%d",c);
        s.close();
    }
}