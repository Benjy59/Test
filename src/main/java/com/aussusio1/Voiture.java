package com.aussusio1;

public class Voiture extends Vehicule {
	boolean tatouageVitre ;
	
	public Voiture(){
		tatouageVitre = true;
			
	}
	
	public void tatouerVitre(){
		tatouageVitre=true;
	}
	
	public void detatouerVitre(){
		tatouageVitre=false;
	}
}
