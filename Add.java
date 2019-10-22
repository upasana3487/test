package Operator;

public class Add implements MultiOperator {

	@Override
	public int operation(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int incDec(int z) {
		// TODO Auto-generated method stub
		return 0;
	}

}