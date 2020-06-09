
public class pr0609_classexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student yee = new Student();
		Student lim = new Student();
		yee.name = "이민우";
		yee.grade = 2;
		
		lim.name = "임정운";
		lim.grade = 3;
		System.out.println("학생의 이름은 " + lim.name + "이고, " + lim.grade + "학년입니다.");
		System.out.println("학생의 이름은 " + yee.name + "이고, " + yee.grade + "학년입니다.");
		
		lim.floor();
		yee.floor();

	}

}

class Student{
	String name;
	int grade;
	
		public void floor() {
	
			if(grade ==3) {
				System.out.println(grade + "학년은 4층입니다.");
			}
			else if(grade == 2) {
				System.out.println(grade + "학년은 3층입니다.");
			}
	
			else if(grade == 1){
				System.out.println(grade + "학년은 2층입니다.");
			}
	}
}
