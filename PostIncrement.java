package Operator;

public class PostIncrement implements MultiOperator {

	@Override
	public int operation(int x, int y) {
		return x++;
	}

}
