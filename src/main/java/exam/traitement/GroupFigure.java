package exam.traitement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import exam.aop.MyLog;
import exam.entities.Point;

@Component
public class GroupFigure extends Figure implements Serializable{
	 
	List<Figure> listeFigure ; 
	@MyLog
	public GroupFigure(Point point) {
		super(point);
		listeFigure = new ArrayList<Figure>(); 
	}
	
	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	 @Override
	    public void update(Observable o) {
	        for(Figure f : listeFigure){
	            f.update(o);
	        }
	    }
	@Override
	public void dessiner() {
		 for (Figure f: listeFigure){
	            f.dessiner();
	           System.err.println("\n");
	        }
		
	}
    
	@Override
	public double primetre() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
