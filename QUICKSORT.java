package CS211;
import java.util.*;
public class QuicksortEdit {

	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		String ar[] =  new String [n];
		sc.nextLine();
		for(int i = 0; i < n; i++)
		{
			ar[i] = sc.nextLine();
		}
		
		sort(ar, 0, n-1);
		
		for(int i = 0; i < n; i++)
		{
		System.out.print(ar[i] + " ");
		}
	}
	
	public static void sort (String[] ar, int low, int high)
	{
		if(low < high)
		{
			int pi = partition(ar, low, high);
			sort(ar, low, pi-1);
			sort(ar,pi+1, high);
		}
	}
	
	public static int partition (String [] ar, int low, int high)
	{
		String pivot = ar[high];
		int i = (low - 1);
		
		for(int j = low; j < high; j++)
		{
			if(compare(ar[j],pivot) == true)
			{
				i++;
				//swap
				String temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;
			}
		}
		
		//swap pivot
		String temp = ar[i+1];
		ar[i+1] = ar[high];
		ar[high] = temp;
		
		return i+1;
	}
	
	public static boolean compare (String a, String b)
	{
		char maxA = maxChar(a);
		char maxB = maxChar(b);
		
		if (maxA == maxB)
		{
			if(a.compareTo(b) < 0)
			{
				return true;
			}
			
			else 
			{
				return false;
			}
		}
		
		return (maxA<=maxB);

	}
	
	public static char maxChar (String a)
	{
		char max = 'A';
		for(int i = 0; i < a.length(); i++)
		{
			if(a.charAt(i) > max)
			{
				max = a.charAt(i);
			}
		}
		return max;
	}
}
