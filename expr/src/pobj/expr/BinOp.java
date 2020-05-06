package pobj.expr;

public class BinOp {
	private final Expression left;
	private final Expression right;
	
	public BinOp(Expression left, Expression right) {
		this.right = right;
		this.left = left;
	}
	
	public Expression getRight() {
		return right;
	}
	public Expression getLeft() {
		return left;
	}

}
