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

public class HomeScene {
    private Stage stage;

    public HomeScene(Stage stage) {
        this.stage = stage;
    }

    public void show() {
        // Membuat label
        Label labelWarungku = new Label("WarungKu");
        labelWarungku.setAlignment(Pos.TOP_LEFT);
        labelWarungku.setStyle("-fx-padding: 10px;");

        // Membuat logo
        ImageView ivlogo = new ImageView("/gambar/logo.png");
        ivlogo.setFitHeight(40);
        ivlogo.setFitWidth(40);

        // Membuat label
        Label lebelHome = new Label("ini adalah aplikasi yang sangat baik untuk mengatur keuangan warung anda wahai pemilik warung");
        lebelHome.getStyleClass().add("desc-text");
        lebelHome.setWrapText(true);
        lebelHome.setMaxWidth(355);

        // Membuat tombol sign in
        Button btnLogIn = new Button("Log In");
        btnLogIn.setOnAction(v -> {
            LoginScene loginScene = new LoginScene(stage);
            loginScene.show();
        });
        btnLogIn.setAlignment(Pos.TOP_RIGHT);

        // Membuat tombol warungKu
        

        // Membuat HBox
        HBox atas = new HBox(180, ivlogo, labelWarungku, btnLogIn);
        atas.setAlignment(Pos.TOP_CENTER);
        atas.setStyle("-fx-padding: 10px;");

        // Membuat VBox
        VBox susun = new VBox(100, atas,lebelHome);
        // susun.setAlignment(Pos.TOP_CENTER);


        Scene scene = new Scene(susun, 640, 480);
        // scene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());



        stage.setScene(scene);
    }
}

