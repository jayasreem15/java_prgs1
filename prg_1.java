package jayasree_java;
import java.util.Scanner;
public class prg_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=1;
		for(int i=5;i>0;i--) {
			for(int j=1;j<=(i*2)-1;j++) {
				if(k==j||k<j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			k++;
			System.out.println();
		}
	}
}
