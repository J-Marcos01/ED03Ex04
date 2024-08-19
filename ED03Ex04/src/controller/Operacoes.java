package controller;

public class Operacoes 
{
	public Operacoes() 
	{
	super();
		
	}
	public String converteBin(int n)
	{
		
		if(n<1)     //condição de parada é quando o número chega em 0 
		{
			return String.valueOf(n);
		}
		else
		{
			int resto=(n%2);
			return converteBin(n/2)+String.valueOf(resto);//invertendo a concatenação já se obtem número inverso .
		}
	}
	
	
}
