package sample;

import static sample.State.RUNNING;

public class Game {
        private Field field;
        private State state;

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Game() {
        state=RUNNING;
    }
    public void startGame(){
            field = new Field();
            field.shuffle();
    }

}
