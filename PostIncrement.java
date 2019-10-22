package Operator;

public class PostIncrement implements MultiOperator {

	@Override
	public int operation(int x, int y) {
		return 0;
	}

	@Override
	public int incDec(int z) {
		return z++;
	}

}
