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
	
	public void sing() {
		if(this.animal!=null)
		   animal.sing();
		else
			phone.sing();
	}
}
