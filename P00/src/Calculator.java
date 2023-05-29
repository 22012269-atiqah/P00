
public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a-b;
	}
	
	public int multiple (int a, int b) {
		 return a * b;
		}
	
	public int divide (int a, int b) {
		 return a/b;
		}
	
	public Integer divide_error (int a, int b) {
			 
		if (b == 0) {
			return null;
		}
		else {
			return a/b;
		}
	}
}
