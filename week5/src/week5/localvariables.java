package week5;
public class localvariables {
	int fish = 5;
	static int banana = 2;
	final int cake = 3;
	public static void main(String[]args) {
		localvariables chiken = new localvariables();
			chiken.show();
			chiken.display();
	}
	public void show () {
		String chiken1 ="LUCA eat a fish = " + fish +" and eat = " + banana + "and eat = " + cake ;
			System.out.println("Inside show methods chiken1 = " + chiken1);
	}
	public void display() {
		String chiken2 ="VIVO";
			System.out.println(chiken2);
	}
}