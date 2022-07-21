package observer;

public class SimpleObserver implements Observer{ //ben nhieu se nhan bao moi ben 1 se hien thi len
    // nhieu-mot/asociation

    private int value;
    private Subject a;

    public SimpleObserver(Subject simpleSubject){
       this.a = simpleSubject;
       this. a.registerObserver(this);
    }

    @Override
    public void update(int value) {
        this.value = value;

        display();
        
    }
    public void display(){
        System.out.println("Value" +value);

    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        // TODO Auto-generated method stub
        
    }

    
    
}
