package com.cg.calculate.service;

public class MathservicesImpl implements MathServices
{

	@Override
	public int add(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1+n2;
	}

	@Override
	public int sub(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1-n2;
	}

	@Override
	public int mul(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1*n2;
	}

	@Override
	public int div(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1%n2;
	}
	public void serviceStatus() {
		System.out.println("servics done");
	}
	

}
