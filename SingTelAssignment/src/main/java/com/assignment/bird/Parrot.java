package com.assignment.bird;

import com.assignment.Animal;

import com.assignment.Phone;

public class Parrot extends Bird {
	
	Animal animal;
	Phone phone;

	public Parrot(Animal animal){
		this.animal=animal;
	}
	public Parrot(Phone phone){
		this.phone=phone;
	}
	public Parrot(){
		
	}
	 

	public void livingWith(Animal animal) {
		
		this.animal=animal;
	}
	
	public void livingWith(Phone phone){
		this.phone=phone;
	}
	
	public boolean sing() {
		if(this.animal!=null)
		{
		   return animal.sing();
		}
		else if(this.phone!=null)
		{
			return phone.sing();
		}
		else
			return true;
	}
}
