package pobj.expr;

public interface Expression {
    // initialement vide
	public int eval();
	public <T> T accept(IVisitor<T> visitor);
}
