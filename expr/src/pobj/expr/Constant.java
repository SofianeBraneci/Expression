package pobj.expr;


public class Constant implements Expression{
	private int value;
	
	public Constant(int value) {
		this.value = value;
	}
	
	public Constant() {
		value = 0;
	}
	
	public int getValue() {
		return value;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return value + "";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == this) {
			return true;
		}
		if(!(obj instanceof Constant )) return false;
		Constant cst = (Constant) obj;
		return cst.value == this.value;
	}
	@Override
	public int eval() {
		// TODO Auto-generated method stub
		return value;
	}
	
	@Override
	public <T> T accept(IVisitor<T> visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}

}
