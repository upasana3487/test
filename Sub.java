package Operator;

public class Sub implements MultiOperator{

	@Override
	public int operation(int x, int y) {
		
		return x-y;
	}

	@Override
	public int incDec(int z) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
