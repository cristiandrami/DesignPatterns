package expression;

public class Difference implements AbstractExpression {

	private AbstractExpression x;
	private AbstractExpression y;
	public Difference(AbstractExpression x, AbstractExpression y) {
		this.x=x;
		this.y=y;
		
			
	}

	public int calculate(Values v) {
		return x.calculate(v)-y.calculate(v);
		
	}

}
