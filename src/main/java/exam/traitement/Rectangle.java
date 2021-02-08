package exam.traitement;

import java.io.Serializable;

import exam.entities.Point;

public class Rectangle extends Figure implements Serializable {
	
	private double H; 
	private double L ;
	
	public Rectangle(double h, double l, Point p) {
		super(p);
		H = h;
		L = l;
	}
	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return L*H;
	}


	@Override
	public double primetre() {
		// TODO Auto-generated method stub
		return (L+H)*2;
	}
	@Override
	public void dessiner() {
		 System.out.println("Je sui un rectangle avec ==> L : "+L+"H :"+H+"piremiter :"+primetre()+"surface :"+surface());
		
	}
public void update(Observable observable) {
	  System.out.println(" conteur :"+((Parametrage) observable).getConteur()+"  surface :"+((Parametrage) observable).getCouleur()+"Epaisseur Color"+
		        ((Parametrage) observable).getEpaisseur());
		
	}

	
	public double getH() {
		return H;
	}
	public void setH(double h) {
		H = h;
	}
	public double getL() {
		return L;
	}
	public void setL(double l) {
		L = l;
	}
	
	

	

}
