package view;

import controller.Operacoes;

public class Principal 
{

	public static void main(String[] args) 
	{
		Operacoes op = new Operacoes();
		
		int n=100;
		String num=op.converteBin(n);
		System.out.println(num);

	}

}
