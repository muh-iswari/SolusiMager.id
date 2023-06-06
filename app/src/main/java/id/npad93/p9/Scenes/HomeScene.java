package id.npad93.p9.Scenes;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
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
        stage.setTitle("SolusiMager.id");
    }

    public void show() {
        StackPane spLayout = new StackPane();
        Scene scene = new Scene(spLayout, 640, 480);
        scene.getStylesheets().add(getClass().getResource("/styles/home_style.css").toExternalForm());

        // Setting background
        ImageView ivBackground = new ImageView("/gambar/bg.png");
        ivBackground.setFitWidth(scene.getWidth());
        ivBackground.setFitHeight(scene.getHeight());
        spLayout.getChildren().add(ivBackground);

        // Text Title
        Text tLeft = new Text("Solusi");
        tLeft.getStyleClass().add("title-text-left");
        Text tRight = new Text("Mager.id");
        tRight.getStyleClass().add("title-text-right");
        TextFlow tfTitle = new TextFlow(tLeft, tRight);

        // Text Desc
        Label lblDesc = new Label(
        "Hai! Aku SolusiMager.id.\nSaya siap memudahkanmu dalam mencari kebutuhan sehari-hari.");
        lblDesc.setId("label-Text");
        lblDesc.getStyleClass().add("desc-text");
        lblDesc.setWrapText(true);
        lblDesc.setMaxWidth(355);

        // Button Explore
        Region space = new Region();
        space.setPrefHeight(12);
        Button btnExplore = new Button("Belanja di sini");
        btnExplore.getStyleClass().add("btn-explore");

        // VBOX layout
        VBox vtengah = new VBox(tfTitle, lblDesc, space);
        VBox vLayout = new VBox(40, vtengah, btnExplore);
        vtengah.setSpacing(10);
        VBox vbAll = new VBox(20,  vLayout);
        vbAll.setAlignment(Pos.CENTER);
        vbAll.setStyle("-fx-padding: 18px;");
        vbAll.setAlignment(Pos.TOP_RIGHT);
        spLayout.getChildren().add(vbAll);
        vLayout.setPadding(new Insets(53));
        vLayout.setAlignment(Pos.CENTER_LEFT);


        // actions
        btnExplore.setOnAction(v -> {
            Menu menu = new Menu(stage);
            menu.show();
            // MainScene mainScene = new MainScene(stage);
            // mainScene.show();
        });

        stage.setScene(scene);
    }
}


