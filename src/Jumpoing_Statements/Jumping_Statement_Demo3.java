package Jumpoing_Statements;

public class Jumping_Statement_Demo3 {

	public static void main(String[] args) {
		
		for (int a=1; a<=10; a++)
		{
			if(a==1 ||a==3 || a==5 || a==7 || a==9)
			{
				continue;
			}
			System.out.println(a);
		}
		
	}

}
