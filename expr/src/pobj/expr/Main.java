package pobj.expr;

public class Main {

	public static void main(String[] args) {
		Expression e1 =  new Add(new Constant(2), new Constant(2));
		Expression expression = e1.accept(new VisitorSimplify());
		System.out.println(expression.toString());
		//System.out.println(e1.eval());
	}
}
