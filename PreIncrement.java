package Operator;

public class PreIncrement implements MultiOperator {

	@Override
	public int operation(int x, int y) {
		return ++x;
	}

}
