package pobj.expr;

import java.util.Map;

public class VisitorEvalVar implements IVisitor<Integer>{
	private Map<String, Integer> env;
	public VisitorEvalVar(Map<String, Integer> env) {
		this.env = env;
		
	}

	@Override
	public Integer visit(Constant c) {
		// TODO Auto-generated method stub
		return c.getValue();
	}

	@Override
	public Integer visit(Add e) {
		// TODO Auto-generated method stub
		int v1 = e.getLeft().accept(this);
		int v2 = e.getRight().accept(this);
		return v1 + v2;
	}

	@Override
	public Integer visit(Mult e) {
		// TODO Auto-generated method stub
		int v1 = e.getLeft().accept(this);
		int v2 = e.getRight().accept(this);
		return v1 * v2;
	}

	@Override
	public Integer visit(Var v) {
		// TODO Auto-generated method stub
		return env.get(v.getName());
	}
	

}
