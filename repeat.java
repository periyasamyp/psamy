import java.util.HashSet;
import java.util.Scanner;

public class repeat {
              public static void main(String[] args)
              {
				Scanner sc=new Scanner(System.in);
				int count =1;
				int a[]=new int[10];
				for(int j=0;j<a.length;j++)
				{
					a[j]=sc.nextInt();
					
				}
				HashSet<Integer>hs=new HashSet<>();
				
					for (int i = 0; i < a.length; i++)
					{
						if(hs.contains(a[i]))
						{
							//System.out.println(a[i]);
							count++;
						}
						else{
							hs.add(a[i]);
						}
					}
			
			}
}
