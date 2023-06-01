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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class MainScene {
    private Stage stage;

    public MainScene(Stage stage) {
        this.stage = stage;
    }

    public void show() {
        // Membuat label
        Label labelWarungku = new Label("SolusiMager.id");
        labelWarungku.setAlignment(Pos.TOP_LEFT);
        labelWarungku.setStyle("-fx-padding: 6px;");
        // labelWarungku.setStyle("-fx-fill: orange;");
        labelWarungku.setId("judul");

        // Membuat logo
        ImageView ivlogo = new ImageView("/gambar/logo.png");
        ivlogo.setFitHeight(40);
        ivlogo.setFitWidth(40);


        // Membuat tombol sign in
        Button btnLogIn = new Button("Log In");
        btnLogIn.setOnAction(v -> {
            LoginScene loginScene = new LoginScene(stage);
            loginScene.show();
        });
        // btnLogIn.setAlignment(Pos.CENTER_RIGHT);
        btnLogIn.setId("tombol_logIn");

        // Membuat tombol warungKu
        
        // Membuat HBox
        HBox atas = new HBox(170, ivlogo, labelWarungku, btnLogIn);
        atas.setAlignment(Pos.CENTER);
        atas.setLayoutX(100);
        atas.setId("atas");
        atas.setStyle("-fx-padding: 30px;");
        // atas.setStyle("-fx-background-color: orange");
        // atas.setStyle("-fx-background-radius: 42px;");


        // Membuat Menu
        Label lbMenu = new Label("Menu");
        lbMenu.setAlignment(Pos.CENTER);
        lbMenu.setStyle("-fx-font-size: 15px");
        HBox hbLabelMenu = new HBox(lbMenu);
        hbLabelMenu.setMaxSize(120, 30);
        hbLabelMenu.setAlignment(Pos.CENTER);
        hbLabelMenu.setId("hbox-label");

        Label lBelanja = new Label("Belanja");
        lBelanja.setAlignment(Pos.CENTER);
        Image imgBelanja = new Image("/gambar/produck.jpg");
        ImageView ivBelanja= new ImageView(imgBelanja);
        ivBelanja.setFitHeight(30);
        ivBelanja.setFitWidth(30);
        HBox hbBelanja = new HBox(3, ivBelanja, lBelanja);
        hbBelanja.setAlignment(Pos.CENTER);
        hbBelanja.setStyle("-fx-background-color: orange");
        hbBelanja.setMaxSize(120, 35);
        hbBelanja.setMinSize(120, 35);
        hbBelanja.setId("lebel");

        Label lTroli = new Label("Troli");
        lTroli.setAlignment(Pos.CENTER);
        Image imgTroli = new Image("/gambar/produck.jpg");
        ImageView ivTroli= new ImageView(imgTroli);
        ivTroli.setFitHeight(30);
        ivTroli.setFitWidth(30);
        HBox hbTroli = new HBox(3, ivTroli, lTroli);
        hbTroli.setAlignment(Pos.CENTER);
        hbTroli.setStyle("-fx-background-color: orange");
        hbTroli.setMaxSize(120, 35);
        hbTroli.setMinSize(120, 35);
        hbTroli.setId("lebel");

        Label lRiwayat = new Label("Riwayat");
        lRiwayat.setAlignment(Pos.CENTER);
        Image imgRiwayat = new Image("/gambar/produck.jpg");
        ImageView ivRiwayat= new ImageView(imgRiwayat);
        ivRiwayat.setFitHeight(30);
        ivRiwayat.setFitWidth(30);
        HBox hbRiwayat = new HBox(3, ivRiwayat, lRiwayat);
        hbRiwayat.setAlignment(Pos.CENTER);
        hbRiwayat.setStyle("-fx-background-color: orange");
        hbRiwayat.setMaxSize(120, 35);
        hbRiwayat.setMinSize(120, 35);
        hbRiwayat.setId("lebel");

        Label lWarungku = new Label("Warungku");
        lWarungku.setAlignment(Pos.CENTER);
        Image imgWarungku = new Image("/gambar/produck.jpg");
        ImageView ivWarungku= new ImageView(imgWarungku);
        ivWarungku.setFitHeight(30);
        ivWarungku.setFitWidth(30);
        HBox hbWarungku = new HBox(3, ivWarungku, lWarungku);
        hbWarungku.setAlignment(Pos.CENTER);
        hbWarungku.setStyle("-fx-background-color: orange");
        hbWarungku.setMaxSize(120, 35);
        hbWarungku.setMinSize(120, 35);
        hbWarungku.setId("lebel");
        hbWarungku.setOnMouseClicked(v->{
            MainScene mainScene = new MainScene(stage);
            mainScene.show();
        });

        

        // ?
        // Membuat bagian Rekomendasi Hari Ini

        // Membuat Hboxnya
        HBox hbMenu = new HBox(25, hbBelanja, hbRiwayat, hbTroli ,hbWarungku);
        hbMenu.setAlignment(Pos.TOP_CENTER);

        VBox vbMenu = new VBox(7,hbLabelMenu, hbMenu);


        // Membuat VBox
        VBox susun = new VBox(15, atas, vbMenu);
        // susun.setAlignment(Pos.TOP_CENTER);


        Scene scene = new Scene(susun, 640, 480);
        scene.getStylesheets().add(getClass().getResource("/styles/main_style.css").toExternalForm());


        stage.setScene(scene);
    } 
}


