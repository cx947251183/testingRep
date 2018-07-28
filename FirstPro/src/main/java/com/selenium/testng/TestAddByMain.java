package com.selenium.testng;

public class TestAddByMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//测试加法 测试用例数据1+2
		Calculator Calculator=new Calculator();
		Calculator.clear();//清零
		Calculator.add(1);
		Calculator.add(2);
		int result=Calculator.getResult();
		if(result==3) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");}

	}

}
