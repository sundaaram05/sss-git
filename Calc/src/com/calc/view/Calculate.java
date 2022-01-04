package com.calc.view;

public class Calculate  {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String d=null;
		do{
		System.out.println("enter two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("enter any operator");
		char c = sc.next().charAt(0);
		switch(c)
		{
		case'+':
		{
		//method name
		break;
		}
		case'-':
		{
		//method name
		break;
		}
		case'*':
		{
			//method name
		break;
		}
		case'/':
		{
			//method name
		break;
		}
		case'%':
		{
			//method name
		break;
		}
		default:
		{
		System.out.println("invalid oprator\n");
		}
		}
		System.out.println("Do you want to continue press  Y or y");
		System.out.println("to exit press any key other than y");
				d =sc.next();
				}while(d.equals("y") || d.equals("Y"));
				System.out.println("Exited from application.");
				
		}

	}
