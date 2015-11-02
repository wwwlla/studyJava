package service.person;

import service.axe.Axe;

public class Person {
	private Axe axe;
	
	
	
	public void setAxe(Axe axe) {
		this.axe = axe;
	}



	public void shop(){
		System.out.println(this.getClass().toString() + " use " + axe.showAxe());
	}

}
