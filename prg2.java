package jayasree_java;
import java.util.Scanner;
public class prg2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean b=false;
		for(int i=0;i<n;i++) {
			if(sc.nextInt()==1) {
				b=true;
			}
		}
		System.out.println(b?-1:1);
}
}
