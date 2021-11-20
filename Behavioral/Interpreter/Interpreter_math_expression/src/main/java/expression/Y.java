package expression;

public class Y implements AbstractExpression {

	public int calculate(Values v) {
		return v.getValue(this);
	}

}
