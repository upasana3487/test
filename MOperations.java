package Operator;

public class MOperations {

	public static void main(String[] args) {
		
		int x=25; int y =25; int z =25;
		MultiOperator mopt = new Add();
		System.out.println(mopt.operation(x, y));	
		mopt = new Sub();
		System.out.println(mopt.operation(x, y));
		mopt=new Div();
		System.out.println(mopt.operation(x, y));
		mopt=new Mul();
		System.out.println(mopt.operation(x, y));
		mopt = new PostIncrement();
		System.out.println(mopt.incDec(z));
		mopt = new PreIncrement();
		System.out.println(mopt.incDec(z));
		mopt=new PostDecrement();
		System.out.println(mopt.incDec(z));
        mopt = new PreDecrement();
		System.out.println(mopt.incDec(z));


		
			}

}
