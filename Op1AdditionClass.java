package LabThree;

public class Op1AdditionClass {
	int a,b;
	public int getNum(int a,int b)
	{
		this.a=a;
		this.b=b;
		return (a+b);
	}
	/*
	 * Using getNum instead of Scan because we are not performing
	 * the operation here, we are only creating a class and method.
	 * In a separate class when we actually perform the arithmetic operation
	 * there we will scan input and assign the input to the same variables a and b
	 * so that the function (method) may be carried out.
	 * There we will have to import this class & package.
	 */
}
