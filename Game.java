package sample;

public class Game {
        private Field field;

    public Field getField() {
        return field;
    }
    public void startGame(){
            field = new Field();
            field.shuffle();
    }

}
