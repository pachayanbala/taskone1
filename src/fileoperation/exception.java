package fileoperation;

public class exception {
	
	public static void main(String[] args) {
		
		System.out.println("string");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		try {
			System.out.println(40/0);
		try {
			String s = null;
			System.out.println(s.charAt(0));
		}catch(NullPointerException e) {
			System.out.println("inner catch");
		}finally {
			System.out.println("innar final");
		}
		}
		 catch (Throwable e){
			System.out.println("do not enter the zero");
		}finally {
			System.out.println("outer final");
		}
		System.out.println("4");
		System.out.println("5");
		System.out.println("end");
	}
	

}
