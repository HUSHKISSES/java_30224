import java.util.Scanner;
public class pr0611_gradeexam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		Grade me = new Grade();
		me.math = sc1.nextInt();
		me.science = sc1.nextInt();
		me.english = sc1.nextInt();
		
		System.out.print("평균은" + me.average());

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
