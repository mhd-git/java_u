public class Test {
	public int x;

	public Test(int a) {
		this.x = a;
	}

	public static void main(String [] args) {
		Test t = new Test(5);
		System.out.println(t.x); 
	}
}
