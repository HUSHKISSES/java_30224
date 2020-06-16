
public class pr0616_triangleexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tri me = new tri(10.2, 17.3);
		System.out.print("»ï°¢ÇüÀÇ ³ÐÀÌ_" + me.cal());
		me.setsize(7.5, 9.2);
		System.out.print("»ï°¢ÇüÀÇ ³ÐÀÌ_" + me.cal());
		

	}
}

class tri{
	double ver;
	double hor;
	
	public tri(double v, double h) {
		ver = v;
		hor = h;
	}
	
	public void setsize(double v, double h) {
		ver = v;
		hor = h;
	}
	
	
	public double cal(){
		return ver*hor/2;
	}
}
