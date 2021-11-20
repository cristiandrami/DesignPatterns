package expression;

public class Sum implements AbstractExpression {

	private AbstractExpression x;
	private AbstractExpression y;
	public Sum(AbstractExpression x, AbstractExpression y) {
		this.x=x;
		this.y=y;
		
			
	}

	public int calculate(Values v) {
		return x.calculate(v)+y.calculate(v);
		
	}

}
