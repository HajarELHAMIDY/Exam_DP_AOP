package exam.traitement;

import java.io.Serializable;

import exam.entities.Point;

public abstract class Figure implements Observer, Serializable {
	protected Point point; 
	
	public Figure(Point point) {
		super();
		this.point = point;
	}

	public abstract double surface(); 
	public abstract double primetre(); 
	public abstract void dessiner() ; 
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}
	

}
