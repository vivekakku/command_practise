package eg1;

public class prime_number {

	public static void main(String[] args) {
		
		        int ar[]={2,3,4,5,19,33,91,97};
		        for(int i=0;i<ar.length;i++)
		        {
		        	prime(ar[i]);
		        }
		    }
		


		public static void prime(int p){
			boolean flag=true;
			for (int i=2; i<=p/2;i++)
			{
				if(p%i==0)
				{
					flag=false;
					break;
				}
				
		    }
			if(!flag)
				System.out.println(p+" is not a prime");
			else
				System.out.println(p+" is a prime");
		}

	}


