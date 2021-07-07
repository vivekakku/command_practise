package eg1;
import java.util.Arrays;

public class duplicates {

	public static void main(String[] args) {
		int arr[]= {1,4,5,6,7,8,922,3,4,5,612,34,56,7890};
		Arrays.sort(arr);
		for (int k :arr)
			System.out.print(k+" ");
	
				int temp[]=new int[arr.length];
				int j=0;
		for(int i=0;i<arr.length-1;i++) 
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[arr.length-1];
		for(int i=0;i<j;i++) {
		System.out.print(temp[i]+" ");
	}

	}
}

