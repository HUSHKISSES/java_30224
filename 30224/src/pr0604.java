import java.util.Scanner;

public class pr0604 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("아동 수:");
		a = sc1.nextInt();
		System.out.println("성인 수:");
		b = sc2.nextInt();
		
		System.out.println("총 수량:"+(a+b));
		System.out.println("금액"+(6000*a+8000*b));

	}

}
