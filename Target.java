import java.util.Scanner;
public class Target{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int p1,p2,p3,p4;
        p1=s.nextInt();
        p2=s.nextInt();
        p3=s.nextInt();
        p4=s.nextInt();
        if(p1>=10 && p2>=10 && p3>=10 && p4>=10){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        s.close();
    }
}