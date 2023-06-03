package id.npad93.p9.Scenes;

import javax.security.auth.login.LoginContext;
import javax.swing.Icon;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
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
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PTubuhScene {
    private Stage stage;
    private int uang = 100000;
    int stokCitra = 7;
    int stokCuciMuka = 10;
    int stokSabun = 34;
    int stokSampo = 20;
    int stokLulur = 34;
    int stokRexona = 34;
    VBox vbBeras;
    Label label;
    int[] stok = new int[6];

    public PTubuhScene(Stage stage) {
        this.stage = stage;
    }
    

    public void show() {
        stok[0] = stokCitra;
        stok[1] = stokCuciMuka;
        stok[2] = stokSabun;
        stok[3] = stokSampo;
        stok[4] = stokLulur;
        stok[5] = stokRexona;

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


        Label labelMenu = new Label("Perawatan Tubuh");
        labelMenu.setId("text");
        labelMenu.setStyle("-fx-font-size: 16; -fx-font-weight: bold;");
        // labelMenu.setAlignment(Pos.CENTER);       

        // Membuat produck 
        // Membuat Citra 
        int hargaCitra = 18000;
        ImageView ivCitra = new ImageView("/gambar/citra.jpg");
        ivCitra.setFitHeight(150);
        ivCitra.setFitWidth(150);
        Label lbCitra = new Label("Citra 5 kg Citra");
        lbCitra.setStyle("-fx-font-weight: bold;");
        lbCitra.setWrapText(true);
        lbCitra.setMaxWidth(150);
        // Label labelHargaCitra = new Label("Rp" + hargaCitra);
        lbCitra.getStyleClass().add("desc-text");
        Label lbHargaCitra = new Label("Harga : " + Integer.toString(hargaCitra));
        Label lbStokCitra = new Label("Stok : " + Integer.toString(stokCitra));
        Button beliCitra = new Button("Beli");
        beliCitra.setOnAction(event -> {
            if (uang >= hargaCitra && stokCitra > 0) {
                uang -= hargaCitra;
                stokCitra-=1;
                lbStokCitra.setText("Stok : " + stokCitra);
            } else {
                if (!lbStokCitra.getStyle().equals("-fx-text-fill: red;")) {
                    lbStokCitra.setText("Maaf, saldo anda  tidak mencukupi");
                    lbStokCitra.setWrapText(true);
                    lbStokCitra.setMaxWidth(100);
                    lbStokCitra.setStyle("-fx-text-fill: red;");
                }
            }
        });


        // Gabungkan kedlam VBox
        vbBeras = new VBox(10, lbCitra, lbStokCitra, lbHargaCitra, beliCitra);
        HBox hbCitra = new HBox(7, ivCitra, vbBeras);
        hbCitra.setMaxWidth(280);
        hbCitra.setMinWidth(280);
        // hbBeras.setStyle("-fx-background-colour: red");

        int hargaCuciMuka = 18000;
        ImageView ivCuciMuka = new ImageView("/gambar/cuciMuka.jpg");
        ivCuciMuka.setFitHeight(150);
        ivCuciMuka.setFitWidth(150);
        Label lbCuciMuka = new Label("CuciMuka tropical 1 Liter");
        lbCuciMuka.setWrapText(true);
        lbCuciMuka.setMaxWidth(150);
        // Label labelHargaCuciMuka = new Label("Rp" + hargaCuciMuka);
        lbCuciMuka.getStyleClass().add("desc-text");
        Label lbHargaCuciMuka = new Label("Harga : " + Integer.toString(hargaCuciMuka));
        Label lbStokCuciMuka = new Label("Stok : Rp. " + Integer.toString(stokCuciMuka));
        Button beliCuciMuka = new Button("Beli"); 
        // Tombol Beli CuciMuka
        beliCuciMuka.setOnAction(event -> {
            if (uang >= hargaCuciMuka && stokCuciMuka > 0) {
                uang -= hargaCuciMuka;
                stokCuciMuka-=1;
                lbStokCuciMuka.setText("Stok : " + stokCuciMuka);
            } else {
                if (!lbStokCuciMuka.getStyle().equals("-fx-text-fill: red;")) {
                    lbStokCuciMuka.setText("Maaf, saldo anda  tidak mencukupi");
                    lbStokCuciMuka.setWrapText(true);
                    lbStokCuciMuka.setMaxWidth(100);
                    lbStokCuciMuka.setStyle("-fx-text-fill: red;");
                }
            }
        });


        // Gabungkan kedlam VBox
        VBox vbCuciMuka = new VBox(10, lbCuciMuka, lbStokCuciMuka, lbHargaCuciMuka, beliCuciMuka);
        HBox hbCuciMuka = new HBox(7, ivCuciMuka, vbCuciMuka);
        hbCuciMuka.setMaxWidth(280);
        hbCuciMuka.setMinWidth(280);
        // hbCuciMuka.setStyle("-fx-background-colour: red");


        // Membuat Hboxnya
        HBox hbMenu = new HBox(25, hbCitra, hbCuciMuka);
        hbMenu.setMaxWidth(640);
        hbMenu.setAlignment(Pos.CENTER);

        // Membuat Beras 
        int hargaSabun = 5000;
        ImageView ivSabun = new ImageView("/gambar/sabun.jpg");
        ivSabun.setFitHeight(150);
        ivSabun.setFitWidth(150);
        Label lbSabun = new Label("Sabun 5 kg Sabun");
        lbSabun.setWrapText(true);
        lbSabun.setMaxWidth(150);
        lbSabun.setStyle("-fx-font-weight: bold;");
        // Label labelHargaSabun = new Label("Rp" + hargaSabun);
        lbSabun.getStyleClass().add("desc-text");
        Label lbHargaSabun = new Label("Harga : " + Integer.toString(hargaSabun));
        Label lbStokSabun = new Label("Stok : " + Integer.toString(stokSabun));
        Button beliSabun = new Button("Beli"); 
        // Tombol Beli Sabun
        beliSabun.setOnAction(event -> {konfirmasiPembelian(2,"Beras", 10000, lbStokSabun);});


        // Gabungkan kedlam VBox
        VBox vbSabun = new VBox(10, lbSabun, lbStokSabun, lbHargaSabun, beliSabun);
        HBox hbSabun = new HBox(7, ivSabun, vbSabun);
        hbSabun.setMaxWidth(280);
        hbSabun.setMinWidth(280);
        // hbSabun.setStyle("-fx-background-colour: red");

        int hargaSampo = 18000;
        ImageView ivSampo = new ImageView("/gambar/Sampo.jpg");
        ivSampo.setFitHeight(150);
        ivSampo.setFitWidth(150);
        Label lbSampo = new Label("Sampo tropical 1 Liter");
        // Label labelHargaSampo = new Label("Rp" + hargaSampo);
        lbSampo.getStyleClass().add("desc-text");
        lbSampo.setWrapText(true);
        lbSampo.setMaxWidth(150);
        Label lbHargaSampo = new Label("Harga : Rp. " + Integer.toString(hargaSampo));
        Label lbStokSampo = new Label("Stok : " + Integer.toString(stokSampo));
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
        hbSampo.setMaxWidth(280);
        hbSampo.setMinWidth(280);
        // hbCuciMuka.setStyle("-fx-background-colour: red");

        // Membuat Hboxnya
        HBox hbMenu2 = new HBox(25, hbSabun, hbSampo);
        hbMenu2.setMaxWidth(640);
        hbMenu2.setAlignment(Pos.CENTER);
        hbMenu2.setId("produck");

        

        // Membuat Beras 
        int hargaLulur = 11000;
        ImageView ivLulur = new ImageView("/gambar/lulur.jpeg");
        ivLulur.setFitHeight(150);
        ivLulur.setFitWidth(150);
        Label lbLulur = new Label("Lulur 5 kg Lulur");
        lbLulur.setWrapText(true);
        lbLulur.setMaxWidth(150);
        lbLulur.setStyle("-fx-font-weight: bold;");
        // Label labelHargaLulur = new Label("Rp" + hargaLulur);
        lbLulur.getStyleClass().add("desc-text");
        Label lbHargaLulur = new Label("Harga : " + Integer.toString(hargaLulur));
        Label lbStokLulur = new Label("Stok : " + Integer.toString(stokLulur));
        Button beliLulur = new Button("Beli"); 
        // Tombol Beli Lulur
        beliLulur.setOnAction(event -> {
            if (uang >= hargaLulur && stokLulur > 0) {
                uang -= hargaLulur;
                stokLulur-=1;
                lbStokLulur.setText("Stok : " + stokLulur);
            } else {
                if (!lbStokLulur.getStyle().equals("-fx-text-fill: red;")) {
                    lbStokLulur.setText("Maaf, saldo anda  tidak mencukupi");
                    lbStokLulur.setWrapText(true);
                    lbStokLulur.setMaxWidth(100);
                    lbStokLulur.setStyle("-fx-text-fill: red;");
                }
            }
        });


        // Gabungkan kedlam VBox
        VBox vbLulur = new VBox(10, lbLulur, lbStokLulur, lbHargaLulur, beliLulur);
        HBox hbLulur = new HBox(7, ivLulur, vbLulur);
        hbLulur.setMaxWidth(280);
        hbLulur.setMinWidth(280);
        // hbLulur.setStyle("-fx-background-colour: red");

        int hargaRexona = 18000;
        ImageView ivRexona = new ImageView("/gambar/Rexona.jpg");
        ivRexona.setFitHeight(150);
        ivRexona.setFitWidth(150);
        Label lbRexona = new Label("Rexona tropical 1 Liter");
        // Label labelHargaRexona = new Label("Rp" + hargaRexona);
        lbRexona.getStyleClass().add("desc-text");
        lbRexona.setWrapText(true);
        lbRexona.setMaxWidth(150);
        Label lbHargaRexona = new Label("Harga : Rp. " + Integer.toString(hargaRexona));
        Label lbStokRexona = new Label("Stok : " + Integer.toString(stokRexona));
        Button beliRexona = new Button("Beli"); 
        // Tombol Beli Rexona
        beliRexona.setOnAction(event -> {
            if (uang >= hargaRexona && stokRexona > 0) {
                uang -= hargaRexona;
                stokRexona-=1;
                lbStokRexona.setText("Stok : " + stokRexona);
            } else {
                if (!lbStokRexona.getStyle().equals("-fx-text-fill: red;")) {
                    lbStokRexona.setText("Maaf, saldo anda  tidak mencukupi");
                    lbStokRexona.setWrapText(true);
                    lbStokRexona.setMaxWidth(100);
                    lbStokRexona.setStyle("-fx-text-fill: red;");
                }
            }
        });



        // Gabungkan kedlam VBox
        VBox vbRexona = new VBox(10, lbRexona, lbStokRexona, lbHargaRexona, beliRexona);
        HBox hbRexona = new HBox(7, ivRexona, vbRexona);
        hbRexona.setMaxWidth(280);
        hbRexona.setMinWidth(280);
        // hbCuciMuka.setStyle("-fx-background-colour: red");

        // Membuat Hboxnya
        HBox hbMenu3 = new HBox(25, hbLulur, hbRexona);
        hbMenu2.setMaxWidth(640);
        hbMenu2.setAlignment(Pos.CENTER);
        hbMenu2.setId("produck");


        VBox vbMenu = new VBox(7, hbMenu, hbMenu2, hbMenu3);
        vbMenu.setAlignment(Pos.CENTER);
        ScrollPane scrollPane = new ScrollPane(vbMenu);
        VBox vbTampilan = new VBox(10, labelMenu, scrollPane);
        vbTampilan.setAlignment(Pos.CENTER);
        // VBox vbMenu = new VBox(7,hbLabelMenu, hbMenu);


        // Membuat VBox
        VBox susun = new VBox(15, atas, vbTampilan);
        // susun.setAlignment(Pos.TOP_CENTER);


        Scene scene = new Scene(susun, 640, 480);
        scene.getStylesheets().add(getClass().getResource("/styles/main_style.css").toExternalForm());


        stage.setScene(scene);
    } 

    private void konfirmasiPembelian(int i, String produk, int harga, Label lbStok) {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Konfirmasi Pembelian");

        Label lbKonfirmasi = new Label("Apakah anda yakin ingin membeli " + produk + " seharga " + harga + " ?");
        lbKonfirmasi.setAlignment(Pos.CENTER);
        lbKonfirmasi.setWrapText(true);
        // lbKonfirmasi.setMaxWidth(280);
        Button btnBeli = new Button("Beli");
        Button btnBatal = new Button("Batal");
        btnBeli.setAlignment(Pos.CENTER);
        btnBatal.setAlignment(Pos.CENTER);

        btnBeli.setOnAction(e -> {
            if (stok[i] > 0 && uang >= harga) {
                stok[i]--;
                uang -= harga;
                lbStok.setText("Stok: " + stok[i]);
            } else if (stok[i] == 0) {
                lbStok.setText("Stok: Habis");
            } else {
                lbStok.setText("Maaf, Saldo tidak mencukupi");
                lbStok.setWrapText(true);
                lbStok.setMaxWidth(100);
                lbStok.setStyle("-fx-text-fill: red;");
            }
            stage.close();
        });

        btnBatal.setOnAction(e -> stage.close());

        HBox hbKonfirmasi = new HBox(10);
        hbKonfirmasi.setAlignment(Pos.CENTER);
        hbKonfirmasi.getChildren().addAll(btnBeli, btnBatal);

        VBox vbKonfirmasi = new VBox(20, lbKonfirmasi, hbKonfirmasi);
        vbKonfirmasi.setAlignment(Pos.CENTER);
        vbKonfirmasi.setStyle("-fx-alignment: center;");
        Scene scene = new Scene(vbKonfirmasi, 400, 100);
        stage.setScene(scene);
        stage.showAndWait();
    }
}



