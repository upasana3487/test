package Operator;

public class PreDecrement implements MultiOperator {

	@Override
	public int operation(int x, int y) {
		return --y;
	}

}
