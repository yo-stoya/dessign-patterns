package structural.facade;

public class RAM {
    private long capacity;

    public RAM(long capacity) {
        this.capacity = capacity;
    }

    public void load(){
        System.out.println("RAM is loading");
    }
}
