package DAY2TNSF;

public class Nestedif {
public static void main(String[] args) {
		
		int a=15, b= 20, c=3;
		
		if(a>b)
		{
		//System.out.println("A is grater than B");
			if(a>c)
			{
				System.out.println("A is greater number");
			}
		}
		
		else if(b>c)
		{
			System.out.println("B is greater number");
		}

		else 
		{
			System.out.println("C is greater number");
		}
	}

}
