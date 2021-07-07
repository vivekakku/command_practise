package eg1;

public class prime_char_uppercase {
	public static void main(String args [])
	{
		
		String s="hellobae";
		char c1[]=s.toCharArray();
		for(int i=0;i<s.length();i++) 
		{
			if(i==2 || i==3 ||i==5 ||i==7 || i==11 || i==13)
			{
				c1[i]=Character.toUpperCase(c1[i]);
				
				
			}

		}
		System.out.println(c1);
	}
}

