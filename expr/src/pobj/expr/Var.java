package pobj.expr;

public class Var implements Expression{
	private final String name;
	
	public Var(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj ==this) return true;
		if(!(obj instanceof Var)) return false;
		Var var = (Var) obj;
		return name.equals(var.name);
	}
	@Override
	public int eval() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
	
	@Override
	public <T> T accept(IVisitor<T> visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}
}
