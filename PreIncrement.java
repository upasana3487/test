package Operator;

public class PreIncrement implements MultiOperator {

	@Override
	public int operation(int x, int y) {
		return 0;
	}

	@Override
	public int incDec(int z) {
		// TODO Auto-generated method stub
		return ++z;
	}

}
