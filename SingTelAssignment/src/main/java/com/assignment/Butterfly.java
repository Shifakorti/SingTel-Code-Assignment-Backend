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
	public void walk() {
		if(isCaterpillar)
			System.out.println("I can Walk");
		else
			System.out.println("I cannot Walk");
		
	}

	@Override
	public void fly() {
		if(isCaterpillar)
			System.out.println("I cannot Fly");
		else
			System.out.println("I can fly");
		
	}

	@Override
	public void sing() {
		if(isCaterpillar)
			System.out.println("I can sing");
		else
			System.out.println("I cannot sing");
		
	}

	@Override
	public void swim() {
		System.out.println("I cannot swim");
		
	}

}
