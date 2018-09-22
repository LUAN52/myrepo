package amigos;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		Scanner sr=new Scanner(System.in);
		
		
		
		System.out.println("digite dois numeros");
		int n1=sr.nextInt();
		int n2=sr.nextInt();
		
		SomaDiv novo=new SomaDiv(n1,n2);
		
		boolean res=novo.resultado();
		
		System.out.println(res);
		
		if(res==true)
		{
			System.out.println("numeros amigos");
		}
		else
		{
			System.out.println("numeros nao amigos");
		}
		
		sr.close();
		

	}

}
