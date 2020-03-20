package sample;

import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Controller {

    public ImageView btn16, btn1, btn2, btn3;
    public ImageView btn4, btn5, btn6, btn7;
    public ImageView btn8, btn9, btn10, btn11;
    public ImageView btn12, btn13, btn14, btn15;
    private Game game;

    public Controller() {
        game=new Game();
        game.startGame();
    }
    public void clickBtn(MouseEvent mouseEvent) {
        Tile[][] arr=game.getField().getArr();

        System.out.println(((ImageView)mouseEvent.getSource()).getImage().getUrl());
        int code = Integer.parseInt(((ImageView) mouseEvent.getSource()).getId().substring(3));
        code--;
        int x=code%4;
        int y=code/4;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++) {
                if(!(x==i && y==j) && Math.abs(x-i)<=1 && Math.abs(y-j)<=1 && Math.abs(x-i)+Math.abs(y-j)!=2){
                    if (arr[i][j].getId() == 0){
                        int temp = arr[x][y].getId();
                        arr[x][y].setId(arr[i][j].getId());
                        arr[i][j].setId(temp);
                    }
                }
            }
        }

        rePaint();
    }

    public void rePaint() {
        Tile[][] arr=game.getField().getArr();
       btn1.setImage(new Image("file:/C:/Users/monos/Desktop/projectPuzzle/out/production/projectPuzzle/sample/"+arr[0][0].getId()+".jpg"));
        btn2.setImage(new Image("file:/C:/Users/monos/Desktop/projectPuzzle/out/production/projectPuzzle/sample/"+arr[1][0].getId()+".jpg"));
        btn3.setImage(new Image("file:/C:/Users/monos/Desktop/projectPuzzle/out/production/projectPuzzle/sample/"+arr[2][0].getId()+".jpg"));
        btn4.setImage(new Image("file:/C:/Users/monos/Desktop/projectPuzzle/out/production/projectPuzzle/sample/"+arr[3][0].getId()+".jpg"));

        btn5.setImage(new Image("file:/C:/Users/monos/Desktop/projectPuzzle/out/production/projectPuzzle/sample/"+arr[0][1].getId()+".jpg"));
        btn6.setImage(new Image("file:/C:/Users/monos/Desktop/projectPuzzle/out/production/projectPuzzle/sample/"+arr[1][1].getId()+".jpg"));
        btn7.setImage(new Image("file:/C:/Users/monos/Desktop/projectPuzzle/out/production/projectPuzzle/sample/"+arr[2][1].getId()+".jpg"));
        btn8.setImage(new Image("file:/C:/Users/monos/Desktop/projectPuzzle/out/production/projectPuzzle/sample/"+arr[3][1].getId()+".jpg"));

        btn9.setImage(new Image("file:/C:/Users/monos/Desktop/projectPuzzle/out/production/projectPuzzle/sample/"+arr[0][2].getId()+".jpg"));
        btn10.setImage(new Image("file:/C:/Users/monos/Desktop/projectPuzzle/out/production/projectPuzzle/sample/"+arr[1][2].getId()+".jpg"));
        btn11.setImage(new Image("file:/C:/Users/monos/Desktop/projectPuzzle/out/production/projectPuzzle/sample/"+arr[2][2].getId()+".jpg"));
        btn12.setImage(new Image("file:/C:/Users/monos/Desktop/projectPuzzle/out/production/projectPuzzle/sample/"+arr[3][2].getId()+".jpg"));

        btn13.setImage(new Image("file:/C:/Users/monos/Desktop/projectPuzzle/out/production/projectPuzzle/sample/"+arr[0][3].getId()+".jpg"));
        btn14.setImage(new Image("file:/C:/Users/monos/Desktop/projectPuzzle/out/production/projectPuzzle/sample/"+arr[1][3].getId()+".jpg"));
        btn15.setImage(new Image("file:/C:/Users/monos/Desktop/projectPuzzle/out/production/projectPuzzle/sample/"+arr[2][3].getId()+".jpg"));
        btn16.setImage(new Image("file:/C:/Users/monos/Desktop/projectPuzzle/out/production/projectPuzzle/sample/"+arr[3][3].getId()+".jpg"));

    }

    public void shuffleButton(ActionEvent actionEvent) {
            game.getField().shuffle();
            rePaint();
    }

}
