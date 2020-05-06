package pobj.expr;

public class Mult extends BinOp implements Expression{
	
	public Mult(Expression left, Expression right) {
		super(left, right);
	}
	
	@Override
	public String toString() {
		return getLeft().toString() + " * " + getRight().toString();
	}
	@Override
	public int eval() {
		// TODO Auto-generated method stub
		return getLeft().eval() * getRight().eval();
	}

	@Override
	public <T> T accept(IVisitor<T> visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}
}
