package pobj.expr;

public class VisitorSimplify implements IVisitor<Expression> {

	@Override
	public Expression visit(Constant c) {
		// TODO Auto-generated method stub
		return c;
	}

	@Override
	public Expression visit(Add e) {
		// TODO Auto-generated method stub
		if (e.accept(new VisitorConstant())) {
			return new Constant(e.eval());

		}
		if (e.getLeft().accept(new VisitorConstant())) {
			if (e.getLeft().eval() == 0)
				return e.getRight();
		}
		if (e.getRight().accept(new VisitorConstant())) {
			if (e.getRight().eval() == 0)
				return e.getLeft();
		}

		return e;
	}

	@Override
	public Expression visit(Mult e) {
		// TODO Auto-generated method stub
		if (e.accept(new VisitorConstant())) {
			return new Constant(e.eval());

		}
		if (e.getLeft().accept(new VisitorConstant())) {
			if (e.getLeft().eval() == 1)
				return e.getRight();
			else if (e.getLeft().eval() == 0)
				return new Constant(0);

		}
		if (e.getRight().accept(new VisitorConstant())) {
			if (e.getRight().eval() == 1)
				return e.getLeft();
			else if (e.getRight().eval() == 0)
				return new Constant(0);
		}

		return e;
	}

	@Override
	public Expression visit(Var v) {
		// TODO Auto-generated method stub
		return v;
	}

}
