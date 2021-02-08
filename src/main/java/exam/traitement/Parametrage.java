package exam.traitement;

import java.util.ArrayList;
import java.util.List;

public class Parametrage implements Observable {
	
	private  int conteur; 
	private int couleur; 
	private int epaisseur; 
	List<Observer> observers = new ArrayList<Observer>(); 
	
	
	

	public Parametrage(int conteur, int couleur, int epaisseur, List<Observer> observers) {
		super();
		this.conteur = conteur;
		this.couleur = couleur;
		this.epaisseur = epaisseur;
		this.observers = observers;
	}

	public void add(Figure f) {
		observers.add(f);
	}

	public void remove(Figure f ) {
		// TODO Auto-generated method stub
		observers.remove(f);
		
	}
	
	public void notifyAllFigure() {
		for(Observer o : observers)
			o.update(this);
		
	}

	public int getConteur() {
		return conteur;
	}

	public void setConteur(int conteur) {
		this.conteur = conteur;
	}

	public int getCouleur() {
		return couleur;
	}

	public void setCouleur(int couleur) {
		this.couleur = couleur;
	}

	public int getEpaisseur() {
		return epaisseur;
	}

	public void setEpaisseur(int epaisseur) {
		this.epaisseur = epaisseur;
	}
	

}
