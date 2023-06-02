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

public class SembakoScene {
    private Stage stage;
    private int uang;

    public SembakoScene(Stage stage) {
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
        HBox atas = new HBox(150, ivlogo, labelWarungku, btnLogIn);
        atas.setAlignment(Pos.CENTER);
        atas.setLayoutX(100);
        atas.setId("atas");
        atas.setStyle("-fx-padding: 30px;");
        // atas.setStyle("-fx-background-color: orange");
        // atas.setStyle("-fx-background-radius: 42px;");


        // // Membuat Menu
        // Label lbMenu = new Label("Menu");
        // lbMenu.setAlignment(Pos.CENTER);
        // lbMenu.setStyle("-fx-font-size: 15px");
        // HBox hbLabelMenu = new HBox(lbMenu);
        // hbLabelMenu.setMaxSize(120, 30);
        // hbLabelMenu.setAlignment(Pos.CENTER);
        // hbLabelMenu.setId("hbox-label");

        // Label lBelanja = new Label("Belanja");
        // lBelanja.setAlignment(Pos.CENTER);
        // Image imgBelanja = new Image("/gambar/produck.jpg");
        // ImageView ivBelanja= new ImageView(imgBelanja);
        // ivBelanja.setFitHeight(30);
        // ivBelanja.setFitWidth(30);
        // HBox hbBelanja = new HBox(3, ivBelanja, lBelanja);
        // hbBelanja.setAlignment(Pos.CENTER);
        // hbBelanja.setStyle("-fx-background-color: orange");
        // hbBelanja.setMaxSize(120, 35);
        // hbBelanja.setMinSize(120, 35);
        // hbBelanja.setId("lebel");

        // Label lTroli = new Label("Troli");
        // lTroli.setAlignment(Pos.CENTER);
        // Image imgTroli = new Image("/gambar/produck.jpg");
        // ImageView ivTroli= new ImageView(imgTroli);
        // ivTroli.setFitHeight(30);
        // ivTroli.setFitWidth(30);
        // HBox hbTroli = new HBox(3, ivTroli, lTroli);
        // hbTroli.setAlignment(Pos.CENTER);
        // hbTroli.setStyle("-fx-background-color: orange");
        // hbTroli.setMaxSize(120, 35);
        // hbTroli.setMinSize(120, 35);
        // hbTroli.setId("lebel");

        // Label lRiwayat = new Label("Riwayat");
        // lRiwayat.setAlignment(Pos.CENTER);
        // Image imgRiwayat = new Image("/gambar/produck.jpg");
        // ImageView ivRiwayat= new ImageView(imgRiwayat);
        // ivRiwayat.setFitHeight(30);
        // ivRiwayat.setFitWidth(30);
        // HBox hbRiwayat = new HBox(3, ivRiwayat, lRiwayat);
        // hbRiwayat.setAlignment(Pos.CENTER);
        // hbRiwayat.setStyle("-fx-background-color: orange");
        // hbRiwayat.setMaxSize(120, 35);
        // hbRiwayat.setMinSize(120, 35);
        // hbRiwayat.setId("lebel");

        // Label lWarungku = new Label("Warungku");
        // lWarungku.setAlignment(Pos.CENTER);
        // Image imgWarungku = new Image("/gambar/produck.jpg");
        // ImageView ivWarungku= new ImageView(imgWarungku);
        // ivWarungku.setFitHeight(30);
        // ivWarungku.setFitWidth(30);
        // HBox hbWarungku = new HBox(3, ivWarungku, lWarungku);
        // hbWarungku.setAlignment(Pos.CENTER);
        // hbWarungku.setStyle("-fx-background-color: orange");
        // hbWarungku.setMaxSize(120, 35);
        // hbWarungku.setMinSize(120, 35);
        // hbWarungku.setId("lebel");
        // hbWarungku.setOnMouseClicked(v->{
        //     MainScene mainScene = new MainScene(stage);
        //     mainScene.show();
        // });


        // Membuat produck 
        // Membuat Beras 
        int hargaBeras = 10000;
        int stokBeras = 34;
        ImageView ivBeras = new ImageView("/gambar/beras.jpg");
        ivBeras.setFitHeight(150);
        ivBeras.setFitWidth(150);
        Label lbBeras = new Label("Beras 5 kg Beraskita ");
        lbBeras.setStyle("-fx-font-weight: bold;");
        // Label labelHargaBeras = new Label("Rp" + hargaBeras);
        lbBeras.getStyleClass().add("desc-text");
        Label lbHargaBeras = new Label("Harga : " + Integer.toString(hargaBeras));
        Label lbStokBeras = new Label("Stok : " + Integer.toString(stokBeras));
        lbBeras.setWrapText(true);
        lbBeras.setMaxWidth(355);
        Button beliBeras = new Button("Beli");
        // Gabungkan kedlam VBox
        VBox vbBeras = new VBox(10, lbBeras, lbStokBeras, lbHargaBeras, beliBeras);
        HBox hbBeras = new HBox(7, ivBeras, vbBeras);
        // hbBeras.setStyle("-fx-background-colour: red");

        int hargaMinyak = 18000;
        int stokMinyak;
        stokMinyak = 23;
        ImageView ivMinyak = new ImageView("/gambar/tropical.jpg");
        ivMinyak.setFitHeight(150);
        ivMinyak.setFitWidth(150);
        Label lbMinyak = new Label("Minyak tropical 1 Liter");
        // Label labelHargaMinyak = new Label("Rp" + hargaMinyak);
        lbMinyak.getStyleClass().add("desc-text");
        Label lbHargaMinyak = new Label("Harga : " + Integer.toString(hargaMinyak));
        Label lbStokMinyak = new Label("Stok : Rp. " + Integer.toString(stokMinyak));
        lbMinyak.setWrapText(true);
        lbMinyak.setMaxWidth(355);
        Button beliMinyak = new Button("Beli");
        beliMinyak.setOnAction(event -> {
            if (uang >= hargaMinyak) {
                if (stokMinyak > 0) {
                    // stokMinyak -= 1;
                    uang -= hargaMinyak;
                    // updateStockLabel();
                    System.out.println("Item purchased!");
                } else {
                    System.out.println("Out of stock!");
                }
            } else {
                System.out.println("Not enough money!");
            }
        });
        // Gabungkan kedlam VBox
        VBox vbMinyak = new VBox(10, lbMinyak, lbStokMinyak, lbHargaMinyak, beliMinyak);
        HBox hbMinyak = new HBox(7, ivMinyak, vbMinyak);
        // hbMinyak.setStyle("-fx-background-colour: red");


        // Membuat Hboxnya
        HBox hbMenu = new HBox(25, hbBeras, hbMinyak);
        hbMenu.setAlignment(Pos.CENTER);

        // Membuat Beras 
        int hargaTerigu = 10000;
        int stokTerigu = 34;
        ImageView ivTerigu = new ImageView("/gambar/Terigu.jpg");
        ivTerigu.setFitHeight(150);
        ivTerigu.setFitWidth(150);
        Label lbTerigu = new Label("Terigu 5 kg Terigukita ");
        lbTerigu.setStyle("-fx-font-weight: bold;");
        // Label labelHargaTerigu = new Label("Rp" + hargaTerigu);
        lbTerigu.getStyleClass().add("desc-text");
        Label lbHargaTerigu = new Label("Harga : " + Integer.toString(hargaTerigu));
        Label lbStokTerigu = new Label("Stok : " + Integer.toString(stokTerigu));
        lbTerigu.setWrapText(true);
        lbTerigu.setMaxWidth(355);
        Button beliTerigu = new Button("Beli");
        // Gabungkan kedlam VBox
        VBox vbTerigu = new VBox(10, lbTerigu, lbStokTerigu, lbHargaTerigu, beliTerigu);
        HBox hbTerigu = new HBox(7, ivTerigu, vbTerigu);
        // hbTerigu.setStyle("-fx-background-colour: red");

        int hargaSampo = 18000;
        int stokSampo = 20;
        ImageView ivSampo = new ImageView("/gambar/Sampo.jpg");
        ivSampo.setFitHeight(150);
        ivSampo.setFitWidth(150);
        Label lbSampo = new Label("Sampo tropical 1 Liter");
        // Label labelHargaSampo = new Label("Rp" + hargaSampo);
        lbSampo.getStyleClass().add("desc-text");
        Label lbHargaSampo = new Label("Harga : Rp. " + Integer.toString(hargaSampo));
        Label lbStokSampo = new Label("Stok : " + Integer.toString(stokSampo));
        lbSampo.setWrapText(true);
        lbSampo.setMaxWidth(355);
        Button beliSampo = new Button("Beli");
        // Gabungkan kedlam VBox
        VBox vbSampo = new VBox(10, lbSampo, lbStokSampo, lbHargaSampo, beliSampo);
        HBox hbSampo = new HBox(7, ivSampo, vbSampo);
        // hbMinyak.setStyle("-fx-background-colour: red");

        // Membuat Hboxnya
        HBox hbMenu2 = new HBox(25, hbTerigu, hbSampo);
        hbMenu2.setAlignment(Pos.CENTER);


        VBox vbMenu = new VBox(7, hbMenu, hbMenu2);
        // VBox vbMenu = new VBox(7,hbLabelMenu, hbMenu);


        // Membuat VBox
        VBox susun = new VBox(15, atas, vbMenu);
        // susun.setAlignment(Pos.TOP_CENTER);


        Scene scene = new Scene(susun, 640, 480);
        scene.getStylesheets().add(getClass().getResource("/styles/main_style.css").toExternalForm());


        stage.setScene(scene);
    } 
}



