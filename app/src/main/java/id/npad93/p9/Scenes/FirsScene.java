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

public class FirsScene {
    private Stage stage;

    public FirsScene(Stage stage) {
        this.stage = stage;
    }

    public void show() {
        // Membuat Teks 
        Text textHome = new Text("halo bang welcome to my apk");
        // textHome.setP

        // Membuat logo
        ImageView ivlogo = new ImageView("/gambar/logo.png");
        ivlogo.setFitHeight(70);
        ivlogo.setFitWidth(70);
        

        // Membuat label 
        Label lebelHome = new Label("ini adalah aplikasi yang sangat baik untuk mengatur keuangan warung anda wahai pemilik warung");
        lebelHome.getStyleClass().add("desc-text");
        lebelHome.setWrapText(true);
        lebelHome.setMaxWidth(355);
        // lebelHome.setAlignment(Pos.CENTER_LEFT);

        // Membuat botton
        Button btnLogIn = new Button("Mulai");
        btnLogIn.setOnAction(v -> {
            HomeScene homeScene = new HomeScene(stage);
            homeScene.show();
        });
        // btnLogIn.setAlignment(Pos.BASELINE_LEFT);

        
        VBox susun = new VBox(10, ivlogo,textHome,lebelHome, btnLogIn);
        susun.setAlignment(Pos.CENTER);


        Scene scene = new Scene(susun, 640, 480);
        // scene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());



        stage.setScene(scene);
    }
}


