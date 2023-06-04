package id.npad93.p9.Scenes;


import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class BumbuScene {
    private Stage stage;
    private int uang = 100000;
    String[] listImagePath = {"/gambar/royco.jpg", "/gambar/ladaku.jpg", 
    "/gambar/saus tomat.jpg", "/gambar/kecap.jpg", "/gambar/sambal.jpg"};
    String[] nama = {"Royco 460g", "Ladaku Sachet", "ABC Saus Tomat 275ml", 
    "ABC Kecap Pedas Manis 135ml", "Uleg Sambal Bawang 1pack"};
    int[] stock = {19, 12, 32, 10, 5, 8};
    int[] harga = {65000, 8000, 5000, 30000, 21000, 5000};

    public Stage getStage() {
        return stage;
    }


    public BumbuScene (Stage stage) {
        this.stage = stage;
    }
    

    public void show() {
        // Menambahkan nilai ke list

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


        Label labelMenu = new Label("Makanan Instan");
        labelMenu.setId("text");
        labelMenu.setStyle("-fx-font-size: 16; -fx-font-weight: bold;");
        
        VBox vbMenu = new VBox(MembuatTampilan());
        vbMenu.setAlignment(Pos.CENTER);
        ScrollPane scrollPane = new ScrollPane(vbMenu);
        VBox vbTampilan = new VBox(10, labelMenu, scrollPane);
        vbTampilan.setAlignment(Pos.CENTER);



         // Membuat VBox
         VBox susun = new VBox(15, atas, vbTampilan);
         // susun.setAlignment(Pos.TOP_CENTER);
 
 
         Scene scene = new Scene(susun, 640, 480);
         scene.getStylesheets().add(getClass().getResource("/styles/main_style.css").toExternalForm());
 
 
         stage.setScene(scene);



    } 

    private void konfirmasiPembelian(int i, Label lbStok) {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Konfirmasi Pembelian");

        Label lbKonfirmasi = new Label("Apakah anda yakin ingin membeli " + nama[i] + " seharga " + harga[i] + " ?");
        lbKonfirmasi.setAlignment(Pos.CENTER);
        lbKonfirmasi.setWrapText(true);
        // lbKonfirmasi.setMaxWidth(280);
        Button btnBeli = new Button("Beli");
        Button btnBatal = new Button("Batal");
        btnBeli.setAlignment(Pos.CENTER);
        btnBatal.setAlignment(Pos.CENTER);

        btnBeli.setOnAction(e -> {
            if (stock[i] > 0 && uang >= harga[i]) {
                stock[i]--;
                uang -= harga[i];
                lbStok.setText("Stok: " + stock[i]);
            } else if (stock[i] == 0) {
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
        Scene scene = new Scene(vbKonfirmasi, 450, 100);
        stage.setScene(scene);
        stage.showAndWait();
    }


    public VBox MembuatTampilan() {
        // Membuat Produck 1 dan 2
        // Produk sebelah kanan
        ImageView ivProduck = new ImageView(listImagePath[0]);
        ivProduck.setFitHeight(150);
        ivProduck.setFitWidth(150);
        Label lbProduck = new Label(nama[0]);
        lbProduck.setWrapText(true);
        lbProduck.setMaxWidth(150);
        lbProduck.setStyle("-fx-font-weight: bold;");
        lbProduck.getStyleClass().add("desc-text");
        Label lbHarga = new Label("Harga : " + Integer.toString(harga[0]));
        Label lbStok = new Label("Stok : " + Integer.toString(stock[0]));
        Button beliProduck = new Button("Beli"); 
        // Tombol Beli Produck
        beliProduck.setOnAction(event -> {konfirmasiPembelian(0, lbStok);});

        // Gabungkan kedlam VBox
        VBox vbProduck = new VBox(10, lbProduck, lbStok, lbHarga, beliProduck);
        HBox hbProduck = new HBox(7, ivProduck, vbProduck);
        hbProduck.setMaxWidth(280);
        hbProduck.setMinWidth(280);


        // Produk sebelah kiri
        ImageView ivProduck2 = new ImageView(listImagePath[1]);
        ivProduck2.setFitHeight(150);
        ivProduck2.setFitWidth(150);
        Label lbProduck2 = new Label(nama[1]);
        // Label labelHargaProduck2 = new Label("Rp" + hargaProduck2);
        lbProduck2.getStyleClass().add("desc-text");
        lbProduck2.setWrapText(true);
        lbProduck2.setMaxWidth(150);
        lbProduck2.setStyle("-fx-font-weight: bold;");
        Label lbHarga2 = new Label("Harga : Rp. " + Integer.toString(harga[2]));
        Label lbStok2 = new Label("Stok : " + Integer.toString(stock[1]));
        Button beliProduck2 = new Button("Beli"); 
        // Tombol Beli Produck2
        beliProduck2.setOnAction(event -> {konfirmasiPembelian(1, lbStok2);});

        // Gabungkan kedlam VBox
        VBox vbProduck2 = new VBox(10, lbProduck2, lbStok2, lbHarga2, beliProduck2);
        HBox hbProduck2 = new HBox(7, ivProduck2, vbProduck2);
        hbProduck2.setMaxWidth(280);
        hbProduck2.setMinWidth(280);
        // hbCuciMuka.setStyle("-fx-background-colour: red");

        // Membuat Hboxnya
        HBox hbMenu = new HBox(20, hbProduck, hbProduck2);
        hbMenu.setMaxWidth(640);
        hbMenu.setAlignment(Pos.CENTER);
        hbMenu.setId("produck");


        

        // Membuat Produck 3 dan 4
        // Produk sebelah kanan
        ImageView ivProduck3 = new ImageView(listImagePath[2]);
        ivProduck3.setFitHeight(150);
        ivProduck3.setFitWidth(150);
        Label lbProduck3 = new Label(nama[2]);
        lbProduck3.setWrapText(true);
        lbProduck3.setMaxWidth(150);
        lbProduck3.setStyle("-fx-font-weight: bold;");
        lbProduck3.getStyleClass().add("desc-text");
        Label lbHarga3 = new Label("Harga : " + Integer.toString(harga[2]));
        Label lbStok3 = new Label("Stok : " + Integer.toString(stock[2]));
        Button beliProduck3 = new Button("Beli"); 
        // Tombol Beli Produck3
        beliProduck3.setOnAction(event -> {konfirmasiPembelian(2, lbStok3);});

        // Gabungkan kedlam VBox
        VBox vbProduck3 = new VBox(10, lbProduck3, lbStok3, lbHarga3, beliProduck3);
        HBox hbProduck3 = new HBox(7, ivProduck3, vbProduck3);
        hbProduck3.setMaxWidth(280);
        hbProduck3.setMinWidth(280);


        // Produk sebelah kiri
        ImageView ivProduck4 = new ImageView(listImagePath[3]);
        ivProduck4.setFitHeight(150);
        ivProduck4.setFitWidth(150);
        Label lbPProduck4 = new Label(nama[3]);
        // Label labelHargaPProduck4 = new Label("Rp" + hargaPProduck4);
        lbPProduck4.getStyleClass().add("desc-text");
        lbPProduck4.setWrapText(true);
        lbPProduck4.setMaxWidth(150);
        lbPProduck4.setStyle("-fx-font-weight: bold;");
        Label lbHarga4 = new Label("Harga : Rp. " + Integer.toString(harga[3]));
        Label lbStok4 = new Label("Stok : " + Integer.toString(stock[3]));
        Button beliPProduck4 = new Button("Beli"); 
        // Tombol Beli PProduck4
        beliPProduck4.setOnAction(event -> {konfirmasiPembelian(3, lbStok4);});

        // Gabungkan kedlam VBox
        VBox vbPProduck4 = new VBox(10, lbPProduck4, lbStok4, lbHarga4, beliPProduck4);
        HBox hbPProduck4 = new HBox(7, ivProduck4, vbPProduck4);
        hbPProduck4.setMaxWidth(280);
        hbPProduck4.setMinWidth(280);
        // hbCuciMuka.setStyle("-fx-background-colour: red");

        // Membuat Hboxnya
        HBox hbMenu2 = new HBox(20, hbProduck3, hbPProduck4);
        hbMenu2.setMaxWidth(640);
        hbMenu2.setAlignment(Pos.CENTER);
        hbMenu2.setId("produck");



        // Membuat Produck 5 dan 6
        // Produk sebelah kanan
        ImageView ivProduck5 = new ImageView(listImagePath[4]);
        ivProduck5.setFitHeight(150);
        ivProduck5.setFitWidth(150);
        Label lbProduck5 = new Label(nama[4]);
        lbProduck5.setWrapText(true);
        lbProduck5.setMaxWidth(150);
        lbProduck5.setStyle("-fx-font-weight: bold;");
        lbProduck5.getStyleClass().add("desc-text");
        Label lbHarga5 = new Label("Harga : " + Integer.toString(harga[4]));
        Label lbStok5 = new Label("Stok : " + Integer.toString(stock[4]));
        Button beliProduck5 = new Button("Beli"); 
        // Tombol Beli Produck5
        beliProduck5.setOnAction(event -> {konfirmasiPembelian(4, lbStok5);});

        // Gabungkan kedlam VBox
        VBox vbProduck5 = new VBox(10, lbProduck5, lbStok5, lbHarga5, beliProduck5);
        HBox hbProduck5 = new HBox(7, ivProduck5, vbProduck5);
        hbProduck5.setMaxWidth(280);
        hbProduck5.setMinWidth(280);


        // Produk sebelah kiri
        ImageView ivProduck6 = new ImageView(listImagePath[5]);
        ivProduck6.setFitHeight(150);
        ivProduck6.setFitWidth(150);
        Label lbPProduck6 = new Label(nama[5]);
        // Label labelHargaPProduck6 = new Label("Rp" + hargaPProduck6);
        lbPProduck6.getStyleClass().add("desc-text");
        lbPProduck6.setWrapText(true);
        lbPProduck6.setMaxWidth(150);
        lbPProduck6.setStyle("-fx-font-weight: bold;");
        Label lbHarga6 = new Label("Harga : Rp. " + Integer.toString(harga[5]));
        Label lbStok6 = new Label("Stok : " + Integer.toString(stock[5]));
        Button beliPProduck6 = new Button("Beli"); 
        // Tombol Beli PProduck6
        beliPProduck6.setOnAction(event -> {konfirmasiPembelian(5, lbStok6);});

        // Gabungkan kedlam VBox
        VBox vbPProduck6 = new VBox(10, lbPProduck6, lbStok6, lbHarga6, beliPProduck6);
        HBox hbPProduck6 = new HBox(7, ivProduck6, vbPProduck6);
        hbPProduck6.setMaxWidth(280);
        hbPProduck6.setMinWidth(280);
        // hbCuciMuka.setStyle("-fx-background-colour: red");

        // Membuat Hboxnya
        HBox hbMenu3 = new HBox(20, hbProduck5, hbPProduck6);
        hbMenu3.setMaxWidth(640);
        hbMenu3.setAlignment(Pos.CENTER);
        hbMenu3.setId("produck");


        VBox vbAll = new VBox(7, hbMenu, hbMenu2, hbMenu3);
        return vbAll;

    }
}




