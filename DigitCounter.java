import java.util.Scanner;

public class DigitCounter {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("this program counts the number of digits"+"\n"+"in an integer entered by a user"+"\n"+"Enter -1 to exit"+"\n");
		int Number=0;
		do{
		System.out.print("Enter Number");
		Number=input.nextInt();
		
		if ( Number != -1){
			String s= Integer.toString(Number);
			int length= s.length();
			System.out.println(length);
			}
			else{
				System.out.print("program terminated");
			}
				
		}	
	while (Number != -1);
	}
}


