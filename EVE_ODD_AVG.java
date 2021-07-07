package eg1;

public class EVE_ODD_AVG {

	public static void main(String[] args) {
			int ar[]= {9,7,5,3,1,2,4,6,8},i=0,s=0,t=0,u=0,v=0,k;
			if(ar[i]%2==0)
			{
				s+=ar[i];
				t++;
			}
			else
			{
				u+=ar[i];
				v++;
			}
			k=(s+u)/(t+v);
			System.out.println(k);

	}

}
