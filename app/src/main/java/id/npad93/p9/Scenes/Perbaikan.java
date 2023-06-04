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

public class Perbaikan {
    private Stage stage;
    private int bantu = 0;
    private int uang = 100000;
    private int hargaChocolatosKeju = 1000;
    private int hargaGoodtime = 5000;
    private int hargaChocolatos = 500;
    private int hargaRoma = 8000;
    private int hargaTehPucuk = 4000;
    private int hargaYakult = 2000;
    // Menambahkan stock
    private int stockChocolatosKeju = 19;
    private int stockGoodtime = 31;
    private int stockChocolatos = 42;
    private int stockRoma = 14;
    private int stockTehPucuk = 17;
    private int stockYakult = 50;
    String[] listImagePath = {"/gambar/foto produk/chocolatos-keju.jpg", "/gambar/foto produk/goodtime.jpg", "/gambar/foto produk/chocolatos.jpg", "/gambar/foto produk/roma.jpg", "/gambar/foto produk/teh-pucuk.jpg", "/gambar/foto produk/yakult.jpg" };
    String[] nama = {"Chocolatos Keju 1 Box", "Goodtime 1 box isi 12 pcs", "Chocolatos 1 box", "Roma Kelapa", "Teh pucuk harum", "Yakult"};
    int[] stock = {stockChocolatosKeju, stockGoodtime, stockChocolatos, stockRoma, stockTehPucuk, stockYakult};
    int[] harga = {hargaChocolatosKeju, hargaGoodtime, hargaChocolatos, hargaRoma, hargaTehPucuk, hargaYakult};


    VBox vbMakananRingan;


    public Stage getStage() {
        return stage;
    }


    public void setStage(Stage stage) {
        this.stage = stage;
    }


    public int getUang() {
        return uang;
    }


    public void setUang(int uang) {
        this.uang = uang;
    }


    public int getHargaChocolatosKeju() {
        return hargaChocolatosKeju;
    }


    public void setHargaChocolatosKeju(int hargaChocolatosKeju) {
        this.hargaChocolatosKeju = hargaChocolatosKeju;
    }


    public int getHargaGoodtime() {
        return hargaGoodtime;
    }


    public void setHargaGoodtime(int hargaGoodtime) {
        this.hargaGoodtime = hargaGoodtime;
    }


    public int getHargaChocolatos() {
        return hargaChocolatos;
    }


    public void setHargaChocolatos(int hargaChocolatos) {
        this.hargaChocolatos = hargaChocolatos;
    }


    public int getHargaRoma() {
        return hargaRoma;
    }


    public void setHargaRoma(int hargaRoma) {
        this.hargaRoma = hargaRoma;
    }


    public int getHargaTehPucuk() {
        return hargaTehPucuk;
    }


    public void setHargaTehPucuk(int hargaTehPucuk) {
        this.hargaTehPucuk = hargaTehPucuk;
    }


    public int getHargaYakult() {
        return hargaYakult;
    }


    public void setHargaYakult(int hargaYakult) {
        this.hargaYakult = hargaYakult;
    }






    public Perbaikan(Stage stage) {
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


        Label labelMenu = new Label("Perawatan Tubuh");
        labelMenu.setId("text");
        labelMenu.setStyle("-fx-font-size: 16; -fx-font-weight: bold;");
        // labelMenu.setAlignment(Pos.CENTER);       

        // Membuat produck 
        // Membuat Citra 
        

        // Membuat MakananRingan 
        // VBox vbMenu = new VBox(7,hbLabelMenu, hbMenu);

        HBox hbMenu = new HBox(MembuatTampilan(0));
        HBox hbMenu2 = new HBox(MembuatTampilan(2));
        HBox hbMenu3 = new HBox(MembuatTampilan(4));
        
        VBox vbMenu = new VBox(7, hbMenu ,hbMenu2, hbMenu3);
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

    private void konfirmasiPembelian(int i,  Label lbStok) {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Konfirmasi Pembelian");

        Label lbKonfirmasi = new Label("Apakah anda yakin ingin membeli " + nama + " seharga "  + harga[i] + " ?");
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
        Scene scene = new Scene(vbKonfirmasi, 400, 100);
        stage.setScene(scene);
        stage.showAndWait();
    }


    public HBox MembuatTampilan(int a) {
        bantu += a;
        // Produk sebelah kanan
        ImageView ivProduck = new ImageView(listImagePath[a]);
        ivProduck.setFitHeight(150);
        ivProduck.setFitWidth(150);
        Label lbProduck = new Label(nama[a]);
        lbProduck.setWrapText(true);
        lbProduck.setMaxWidth(150);
        lbProduck.setStyle("-fx-font-weight: bold;");
        lbProduck.getStyleClass().add("desc-text");
        Label lbHarga = new Label("Harga : " + Integer.toString(harga[a]));
        Label lbStok = new Label("Stok : " + Integer.toString(stock[a]));
        Button beliProduck = new Button("Beli"); 
        // Tombol Beli Produck
        beliProduck.setOnAction(event -> {konfirmasiPembelian(1, lbStok);});

        // Gabungkan kedlam VBox
        VBox vbProduck = new VBox(10, lbProduck, lbStok, lbHarga, beliProduck);
        HBox hbProduck = new HBox(7, ivProduck, vbProduck);
        hbProduck.setMaxWidth(280);
        hbProduck.setMinWidth(280);


        // Produk sebelah kiri
        ImageView ivProduck2 = new ImageView(listImagePath[a+1]);
        ivProduck2.setFitHeight(150);
        ivProduck2.setFitWidth(150);
        Label lbProduck2 = new Label(nama[a=1]);
        // Label labelHargaProduck2 = new Label("Rp" + hargaProduck2);
        lbProduck2.getStyleClass().add("desc-text");
        lbProduck2.setWrapText(true);
        lbProduck2.setMaxWidth(150);
        Label lbHarga2 = new Label("Harga : Rp. " + Integer.toString(harga[a+1]));
        Label lbStok2 = new Label("Stok : " + Integer.toString(stock[a+1]));
        Button beliProduck2 = new Button("Beli"); 
        // Tombol Beli Produck2
        beliProduck2.setOnAction(event -> {konfirmasiPembelian(bantu+1, lbStok2);});

        // Gabungkan kedlam VBox
        VBox vbProduck2 = new VBox(10, lbProduck2, lbStok2, lbHarga2, beliProduck2);
        HBox hbProduck2 = new HBox(7, ivProduck2, vbProduck2);
        hbProduck2.setMaxWidth(280);
        hbProduck2.setMinWidth(280);
        // hbCuciMuka.setStyle("-fx-background-colour: red");

        // Membuat Hboxnya
        HBox hbMenu2 = new HBox(25, hbProduck, hbProduck2);
        hbMenu2.setMaxWidth(640);
        hbMenu2.setAlignment(Pos.CENTER);
        hbMenu2.setId("produck");

        // bantu-=a;
        return hbMenu2;


    }
}





