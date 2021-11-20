package expression;

public class X implements AbstractExpression {

	public int calculate(Values v) {
		return v.getValue(this);
	}

}
