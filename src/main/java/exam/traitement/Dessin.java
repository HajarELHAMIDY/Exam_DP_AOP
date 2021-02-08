package exam.traitement;

import java.util.ArrayList;
import java.util.List;

import exam.aop.SecuredByAspect;

public class Dessin {
	List<Figure> figures;
	private InterfaceTraitement interfaceTraitement; 
	
	public Dessin(InterfaceTraitement iT) {
		super();
		interfaceTraitement = iT; 
		figures = new ArrayList<Figure>(); 
	} 
	public void traiter() {
		interfaceTraitement.traiter(); 
	}
	
	public void remove(Figure f) {
		figures.remove(f); 
	}
	public void add(Figure f) {
		figures.add(f); 
	}
	public void afficherDessin() {
		for(Figure  f : figures) {
			f.dessiner();
		}
	}
    public void serailiser() {
    	System.out.println("les donnees est serialisables");
    	
    }
	
	

}
