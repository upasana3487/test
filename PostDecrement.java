package Operator;

public class PostDecrement implements MultiOperator {

	@Override
	public int operation(int x, int y) {
		return y--;
	}

}
