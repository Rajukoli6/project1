package ControlStatements;

public class example_Nested_if 

{
	public static void main(String[]args)
	{
		int PEM=290;
		int MEM=200;
		
	if ( PEM>=300)
		{
			System.out.println("eligible for mains");
			
			if(MEM>=850)
			{
				System.out.println("Selected for mains");
			}
			else
			{
				System.out.println("not selected for mains");
			}
			
		}
		else
		{
			System.out.println("not eligible for the mains");
		}
	}

	
}
