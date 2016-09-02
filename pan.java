import java.util.Scanner;

public class pan {
              public static void main(String[] args)
              {
				Scanner sc=new Scanner(System.in);
				String s=sc.nextLine();
				int a=s.length();
				
				String s1="abcdefghijklmnopqrstuvwxyz";
				int r=s1.length();
				
				int temp=0;
				for (int i = 0; i < a; i++)
				{
					for(int j=0;j<r;j++)
					{
						if(s.charAt(i)==s.charAt(j))
						{
						temp++;
						}
					}
				}
				if(temp==r)
				{
					System.out.println("It is a pangram");
				}
				else
				{
					{
						System.out.println("It is not a pangram");
					}
				}
			}
}
