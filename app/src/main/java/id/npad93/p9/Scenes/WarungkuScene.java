package id.npad93.p9.Scenes;

import javax.security.auth.login.LoginContext;
import javax.swing.Icon;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class WarungkuScene {
    private Stage stage;

    public WarungkuScene(Stage stage) {
        this.stage = stage;
    }

    public void show() {
        ImageView iv1 = new ImageView("/gambar/logo.png");
        HBox hb1 = new HBox(iv1);
        hb1.setAlignment(Pos.CENTER);
        VBox vb1 = new VBox(hb1);
        vb1.setAlignment(Pos.CENTER);
        hb1.setStyle("-fx-background-color: blue;");
        vb1.setStyle("-fx-background-color: red;");
        hb1.setMaxSize(10, 4);
        hb1.setAlignment(Pos.CENTER);
        vb1.setMaxSize(640, 480);
        vb1.setMinSize(640, 480);
        

        
        // VBox susun = new VBox(10, ivlogo,textHome,lebelHome, btnLogIn);
        // susun.setAlignment(Pos.CENTER);


        Scene scene = new Scene(vb1, 640, 480);
        // scene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());



        stage.setScene(scene);
    } 
}
