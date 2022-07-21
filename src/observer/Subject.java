package observer;

public interface Subject { //truu tuong

    //publisher

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObserver();

    
    
}
