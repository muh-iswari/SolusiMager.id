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
        stage.setTitle("firt-stage");
    }

    public void show() {
        StackPane spLayout = new StackPane();
        Scene scene = new Scene(spLayout, 640, 480);
        scene.getStylesheets().add(getClass().getResource("/styles/home_style.css").toExternalForm());

        // Setting background
        ImageView ivBackground = new ImageView("/gambar/Background.png");
        ivBackground.setFitWidth(scene.getWidth());
        ivBackground.setFitHeight(scene.getHeight());
        spLayout.getChildren().add(ivBackground);

        // Text Title
        Text tLeft = new Text("Solusi");
        tLeft.getStyleClass().add("title-text-left");
        Text tRight = new Text("Mager.id");
        tRight.getStyleClass().add("title-text-right");
        TextFlow tfTitle = new TextFlow(tLeft, tRight);

        // Top Logo
        ImageView ivLogo = new ImageView("/gambar/logo.png");
        ivLogo.setFitHeight(60);
        ivLogo.setFitWidth(60);

        // Text Desc
        Label lblDesc = new Label(
        "Hai! Aku SolusiMager.id. Saya siap memudahkanmu dalam mencari kebutuhan sehari-hari.");
        lblDesc.getStyleClass().add("desc-text");
        lblDesc.setWrapText(true);
        lblDesc.setMaxWidth(355);

        // Membuat tombol sign in
        Button btnLogIn = new Button("Log In");
        btnLogIn.setOnAction(v -> {
            LoginScene loginScene = new LoginScene(stage);
            loginScene.show();
        });
        btnLogIn.setId("tombol_logIn");

        // Button Explore
        Region space = new Region();
        space.setPrefHeight(12);
        Button btnExplore = new Button("Belanja");
        btnExplore.getStyleClass().add("btn-explore");

        // VBOX layout
        VBox vLayout = new VBox(ivLogo, tfTitle, lblDesc, space, btnExplore);
        vLayout.setSpacing(8);
        VBox vbAll = new VBox(30, btnLogIn, vLayout);
        vbAll.setStyle("-fx-padding: 18px;");

        vbAll.setAlignment(Pos.TOP_RIGHT);
        spLayout.getChildren().add(vbAll);
        vLayout.setPadding(new Insets(53));
        vLayout.setAlignment(Pos.CENTER_LEFT);


        // actions
        btnExplore.setOnAction(v -> {
            MainScene mainScene = new MainScene(stage);
            mainScene.show();
        });

        stage.setScene(scene);
    }
}


