import java.util.Scanner;
public class pr0611_gradeexam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		Grade me = new Grade();
		me.math = sc1.nextInt();
		me.science = sc1.nextInt();
		me.english = sc1.nextInt();
		
		System.out.print("�����" + me.average());

	}
}

class Grade{
	int math;
	int science;
	int english;
	
	public int average() {
		return (math + science + english)/3;
	}
	
}
