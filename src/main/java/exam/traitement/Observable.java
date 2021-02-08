package exam.traitement;

public interface Observable {
    public void add(Figure f); 
    public void remove(Figure f); 
    public void notifyAllFigure(); 
}
