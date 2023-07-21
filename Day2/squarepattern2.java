import java.util.Scanner;

public class squarepattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and col");
		int row = sc.nextInt();
		int col = sc.nextInt();
		for (int i = 0; i <row; i++) {
			for (int j = 0; j < col; j++){
                if((i==j) || (j==col-1-i)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
			System.out.println();
		}
        sc.close();
    }
}

