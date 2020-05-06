package pobj.expr;

public class Add extends BinOp implements Expression{
	
	public Add(Expression left, Expression right) {
		super(left, right);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "( " + getLeft().toString() + " + "+ getRight().toString() +" )";
	}
	@Override
	public int eval() {
		// TODO Auto-generated method stub
		return (getLeft().eval() + getRight().eval());
	}
	@Override
	public <T> T accept(IVisitor<T> visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}

}
