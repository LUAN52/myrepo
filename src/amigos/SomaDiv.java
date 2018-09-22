package amigos;

public  class  SomaDiv {
	
	public int n1;
	public int n2;
	int cont=0;
	
	
	public SomaDiv(int num1,int num2)
	{
		this.n1=num1;
		this.n2=num2;
		
	}
	
	public int  soma(int num)
	{	
		cont =0;
		for (int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				cont+=i;
			}
		}
		return cont;
	}
	
	
	public boolean resultado()
	{
		int tot1=soma(n1);
		System.out.println(tot1);
		int tot2=soma(n2);
		System.out.println(tot2);
		
		if((tot1==n2)&&(tot2==n1))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
