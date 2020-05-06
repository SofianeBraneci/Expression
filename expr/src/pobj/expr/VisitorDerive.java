package pobj.expr;

public class VisitorDerive implements IVisitor<Expression> {
	private Var var;

	public VisitorDerive(Var var) {
		this.var = var;
	}

	@Override
	public Expression visit(Constant c) {
		// TODO Auto-generated method stub
		return new Constant(0);
	}

	@Override
	public Expression visit(Add e) {

		return new Add(e.getLeft().accept(this), e.getRight().accept(this));
	}

	@Override
	public Expression visit(Mult e) {

		Expression v1 = e.getLeft();
		Expression v2 = e.getRight();
		Expression c1 = (e.getLeft().accept(this));
		Expression c2 = (e.getRight().accept(this));
		return new Add(new Mult(v1, c2), new Mult(v2, c1));
	}

	@Override
	public Expression visit(Var v) {
		// TODO Auto-generated method stub
		if (var.equals(v))
			return new Constant(1);
		return new Constant();
	}

}
