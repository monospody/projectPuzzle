package sample;

public class Tile {
    private boolean empty = false;
    private int id = 0;

    public boolean isEmpty() {
        return empty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tile(){
    }

}
