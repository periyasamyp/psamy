import java.util.Scanner;

public class firstdigit {
              public static void main(String[] args)
              {
				Scanner sc=new Scanner(System.in);
				int a[]=new int[10];
				int n=0;
				int temp=0;
				for (int i = 0; i < a.length; i++)
				{
					a[i]=sc.nextInt();
				}
				for (int i = 0; i < a.length; i++)
				{
					if(a[n]==a[i])
					{
						temp++;
						
					}
				}
				System.out.println(temp+" Times of "+a[n]);
			}
}
