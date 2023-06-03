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
    private int uang = 100000;
    int stokBeras = 34;
    int stokMinyak = 20;
    int stokTerigu = 34;
    int stokSampo = 20;
    VBox vbBeras;
    Label label;

    public SembakoScene(Stage stage) {
        this.stage = stage;
    }

    public void show() {
       // Membuat label
       Label labelWarungku = new Label("SolusiMager.id");
       labelWarungku.setId("text");
       labelWarungku.setAlignment(Pos.CENTER);
       labelWarungku.setStyle("-fx-padding: 6px;");
       labelWarungku.setId("judul");

       // Membuat logo
       Button btnLogout = new Button("Log Out");
       btnLogout.setId("Logout-button");
       btnLogout.setOnAction(v -> {
           HomeScene homeScene = new HomeScene(stage);
           homeScene.show();
       });

       // Membuat tombol Kembali
       Button btnBack = new Button("Back");
       btnBack.setId("back-button");
       btnBack.setOnAction(v -> {
           Menu menu = new Menu(stage);
           menu.show();
       });

       // Membuat HBox atas
       HBox atas = new HBox(150, btnBack, labelWarungku, btnLogout);
       atas.setAlignment(Pos.TOP_CENTER);
       atas.setMaxSize(640, 20);
       atas.setId("atas");
       atas.setStyle("-fx-padding: 4px;");


        // Membuat produck 
        // Membuat Beras 
        int hargaBeras = 10000;
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
        beliBeras.setOnAction(event -> {
            if (uang >= hargaBeras && stokBeras > 0) {
                uang -= hargaBeras;
                stokBeras-=1;
                lbStokBeras.setText("Stok : " + stokBeras);
            } else {
                if (!lbStokBeras.getStyle().equals("-fx-text-fill: red;")) {
                    lbStokBeras.setText("Maaf, saldo anda  tidak mencukupi");
                    lbStokBeras.setWrapText(true);
                    lbStokBeras.setMaxWidth(100);
                    lbStokBeras.setStyle("-fx-text-fill: red;");
                }
            }
        });


        // Gabungkan kedlam VBox
        vbBeras = new VBox(10, lbBeras, lbStokBeras, lbHargaBeras, beliBeras);
        HBox hbBeras = new HBox(7, ivBeras, vbBeras);
        // hbBeras.setStyle("-fx-background-colour: red");

        int hargaMinyak = 18000;
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
        // Tombol Beli Minyak
        beliMinyak.setOnAction(event -> {
            if (uang >= hargaMinyak && stokMinyak > 0) {
                uang -= hargaMinyak;
                stokMinyak-=1;
                lbStokMinyak.setText("Stok : " + stokMinyak);
            } else {
                if (!lbStokMinyak.getStyle().equals("-fx-text-fill: red;")) {
                    lbStokMinyak.setText("Maaf, saldo anda  tidak mencukupi");
                    lbStokMinyak.setWrapText(true);
                    lbStokMinyak.setMaxWidth(100);
                    lbStokMinyak.setStyle("-fx-text-fill: red;");
                }
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
        // Tombol Beli Terigu
        beliTerigu.setOnAction(event -> {
            if (uang >= hargaTerigu && stokTerigu > 0) {
                uang -= hargaTerigu;
                stokTerigu-=1;
                lbStokTerigu.setText("Stok : " + stokTerigu);
            } else {
                if (!lbStokTerigu.getStyle().equals("-fx-text-fill: red;")) {
                    lbStokTerigu.setText("Maaf, saldo anda  tidak mencukupi");
                    lbStokTerigu.setWrapText(true);
                    lbStokTerigu.setMaxWidth(100);
                    lbStokTerigu.setStyle("-fx-text-fill: red;");
                }
            }
        });


        // Gabungkan kedlam VBox
        VBox vbTerigu = new VBox(10, lbTerigu, lbStokTerigu, lbHargaTerigu, beliTerigu);
        HBox hbTerigu = new HBox(7, ivTerigu, vbTerigu);
        // hbTerigu.setStyle("-fx-background-colour: red");

        int hargaSampo = 18000;
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
        // Tombol Beli Sampo
        beliSampo.setOnAction(event -> {
            if (uang >= hargaSampo && stokSampo > 0) {
                uang -= hargaSampo;
                stokSampo-=1;
                lbStokSampo.setText("Stok : " + stokSampo);
            } else {
                if (!lbStokSampo.getStyle().equals("-fx-text-fill: red;")) {
                    lbStokSampo.setText("Maaf, saldo anda  tidak mencukupi");
                    lbStokSampo.setWrapText(true);
                    lbStokSampo.setMaxWidth(100);
                    lbStokSampo.setStyle("-fx-text-fill: red;");
                }
            }
        });
        


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


