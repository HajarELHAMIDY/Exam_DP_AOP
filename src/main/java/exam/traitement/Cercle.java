package exam.traitement;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import exam.aop.MyLog;
import exam.aop.SecuredByAspect;
import exam.entities.Point;

@Component
public class Cercle extends Figure implements Serializable{
	
	private double rayon ; 
	
	
	@MyLog
	public Cercle(double rayon, Point p) {
		super(p);
		this.rayon = rayon;
	}

	
	@MyLog
	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return Math.PI*rayon*rayon;
	}

	@Override
	public double primetre() {
		// TODO Auto-generated method stub
		return 2*Math.PI*rayon;
	}
	
	@MyLog
	@SecuredByAspect(roles = {"ADMIN"})
	public void update(Observable observable) {

        System.out.println(" conteur :"+((Parametrage) observable).getConteur()+"  surface :"+((Parametrage) observable).getCouleur()+"Epaisseur Color"+
        ((Parametrage) observable).getEpaisseur());
		
	}

	@Override
	public void dessiner() {
        System.out.println("rayon :"+rayon + "Surface : "+surface()+"pirimetre :" +primetre());
		
	}
	
	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

}
