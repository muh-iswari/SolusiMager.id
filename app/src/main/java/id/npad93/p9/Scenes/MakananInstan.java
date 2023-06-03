package id.npad93.p9.Scenes;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MakananInstan {
    private Stage stage;

    public MakananInstan(Stage stage){
        this.stage = stage;
    }

    public void show(){
        Label label = new Label("Makanan Instan");
        Scene scene = new Scene(label, 640, 480);
        stage.setScene(scene);
        stage.show();
    }
}
