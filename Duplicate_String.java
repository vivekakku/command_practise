package eg1;
import java.util.Arrays;


public class Duplicate_String {

		public static void main(String[] args) {
			String s = "this is me";
			StringBuilder sb=new StringBuilder();
			s=s.replaceAll(" ", "");
			char[] arr = s.toCharArray();
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
			for (int i = 0; i < arr.length-1; i++) {

				if(arr[i]!=arr[i+1])
				{
					sb.append(arr[i]);
				}
			}
			sb.append(arr[arr.length-1]);
			System.out.println(sb);
		}

	}

