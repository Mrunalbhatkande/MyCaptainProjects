package Project1;

public class Project1 {
static int min = 3456789;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int yr = min/525600;
		int dy = (min/1440)%365;
		System.out.println(min+" minutes is approximately "+yr+" years and "+dy+" days.");
	}

}
