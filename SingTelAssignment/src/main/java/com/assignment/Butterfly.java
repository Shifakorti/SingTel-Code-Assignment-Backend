package com.assignment;

public class Butterfly implements Animal {
	
	boolean isCaterpillar;
	
	public Butterfly(){
	     isCaterpillar=false;
	}
	
	public Butterfly(boolean isCaterpillar){
		this.isCaterpillar=isCaterpillar;
	}
	
	
	public void setCaterpillar() {
		isCaterpillar=true;
	}
	
	public Boolean isCaterpillar() {
		return isCaterpillar;
	}
	

	@Override
	public boolean walk() {
		if(isCaterpillar)
		{
			System.out.println("I can Walk");
		return true;
		}
		else
		{
			System.out.println("I cannot Walk");
		return false;
		}
		
	}

	@Override
	public boolean fly() {
		if(isCaterpillar)
		{
			System.out.println("I cannot Fly");
			return false;
		}
		else
		{
			System.out.println("I can fly");
			return true;
		}
		
	}

	@Override
	public boolean sing() {
		if(isCaterpillar)
		{
			System.out.println("I can sing");
			return true;
		}
		else
		{
			System.out.println("I cannot sing");
			return false;
		}
		
	}

	@Override
	public boolean swim() {
		System.out.println("I cannot swim");
		return false;
		
	}

}
