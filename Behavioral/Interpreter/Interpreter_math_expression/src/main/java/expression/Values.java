package expression;

import java.util.HashMap;

public class Values {

	//classe che si occupa di memorizzare il contesto delle mie incognite
	private HashMap<AbstractExpression, Integer> values = new HashMap<AbstractExpression, Integer>();

	public int getValue(AbstractExpression e) {
		return values.get(e);
	}
	public void addValue(AbstractExpression e, Integer value)
	{
		values.put(e, value);
	}


	
	
	
}
