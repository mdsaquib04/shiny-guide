import java.util.*;

class Greatest
{
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        System.out.println("Enter third number:");
        int c=sc.nextInt();
        
        compute(a,b,c);
    }
    void compute(int x,int y,int z)
    {
        if(x>y&&x>z){
            System.out.printf("Greatest = "+x);
        }
        else if(y>x&&y>z)
        {
            System.out.printf("Greatest = "+y);
        }
        else
        {
            System.out.printf("Greatest = "+z);
        }
    }
}


public class Main
{
	public static void main(String[] args) {
        Greatest g=new Greatest();
        g.input();
	}
}
