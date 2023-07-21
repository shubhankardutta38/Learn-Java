import java.util.Scanner;

public class Palindrome
{
	public static void main(String[] args) {
	    int num,reversedNum=0,remainder;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number :");
		num = sc.nextInt(); // if the num = 3553
		int originalNum=num; // originalNum =3553
	    while(num!=0) // 3553!=0 true  
	    {
	        remainder=num%10; // 3553%10=3
	        reversedNum=reversedNum*10 + remainder; // reservedNum=0*10+3=3
	        num/=10;//num=num/10=3553/10=355
	        
	    }       
	    if(originalNum == reversedNum){
		System.out.println(originalNum +"is palindrome");
	}
	else{
	    System.out.println(originalNum +" is not a palindrome");
	}
	sc.close();
}
}
