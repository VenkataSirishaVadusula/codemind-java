import java.util.Scanner;
public class Me{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a,b,c;
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if(a==b && b==c && c==a)
        System.out.println("Equilateral triangle");
        else if(a==b || b==c || c==a)
        System.out.println("Isosceles triangle");
        else 
        System.out.println("Scalene triangle");
        
    }
}