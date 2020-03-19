package sample;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Field {
    private Tile[][] arr;

    public Tile[][] getArr() {
        return arr;
    }

    public void setArr(Tile[][] arr) {
        this.arr = arr;
    }

    public Field (){
        initGame();
    }

    private void initGame() {
        arr= new Tile[4][4];
        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++)
                arr[i][j]=new Tile();
    }
    public void shuffle() {
        Random rnd = new Random();
        List<Integer> numbers = new ArrayList<Integer>();
        for (int x = 0; x < 16; x++) {
            numbers.add(x);
        }
        Collections.shuffle(numbers);
        int count = 0;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++) {
                        arr[i][j].setId(numbers.get(count));
                        count++;
                }
            }
        }





}

