package main;

import expression.AbstractExpression;
import expression.Difference;
import expression.Multiplication;
import expression.Sum;
import expression.Values;
import expression.X;
import expression.Y;

public class Main {
	public static void main(String[] args) {
		
		AbstractExpression x=new X();
		AbstractExpression y= new Y();
		Values values= new Values();
		values.addValue(x, 2);
		values.addValue(y, 3);
		AbstractExpression expression= new Sum(new Difference(x, y), new Multiplication(x, new Sum(x,y)));
		System.out.println(expression.calculate(values));
	}

}
