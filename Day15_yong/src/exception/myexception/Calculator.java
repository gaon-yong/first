package exception.myexception;

public class Calculator {

	public int left;
	public int right;
	
	public void setOperand (int left, int right) {
		this.right = right;
		this.left = left;
	}
	
	public void divid() throws DivideException{
		if(this.right == 0) {
			throw new DivideException("0으로 나누면 어떡해요!" , 10);
		}
		System.out.println(this.left / this.right);
	}
	
	
	
}
