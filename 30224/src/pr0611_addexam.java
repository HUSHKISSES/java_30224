import java.util.Scanner;

public class pr0611_addexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		
		int snum = 0;
		int lnum = 0;
		int a = 0;
		
		System.out.print("���� ����:");
		snum = sc1.nextInt();
		System.out.print("������ ����:");
		lnum = sc1.nextInt();
		
		for(int i = snum; i <= lnum; i++) {
			a += i;
		}
		
		System.out.println(snum + "���� " + lnum + "������ ����" + a);

	}

}
