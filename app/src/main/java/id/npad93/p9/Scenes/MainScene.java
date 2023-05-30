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
import javafx.stage.Stage;

public class MainScene {
    private Stage stage;

    public MainScene(Stage stage) {
        this.stage = stage;
    }

    public void show() {
        // Text teksTitle = new Text("SolusiMager.id");
        // StackPane sp1 = new StackPane(teksTitle);
        // sp1.setStyle("-fx-background-color: red");
        // sp1.setMaxSize(100, 40);
        // sp1.
        TextField tfpencarian = new TextField();
        tfpencarian.setPromptText("Pencarian");
        tfpencarian.setMaxSize(400, 25);
        tfpencarian.setMinSize(400, 25);
        // tfpencarian.setAlignment(Pos.CENTER_LEFT);
        ImageView ivPencarian = new ImageView("/gambar/pencarian.png");
        ivPencarian.setFitHeight(30);
        ivPencarian.setFitWidth(30);
        HBox hbPencarian = new HBox(ivPencarian, tfpencarian);
        hbPencarian.setMaxSize(455, 40);
        hbPencarian.setMinSize(455, 40);
        hbPencarian.setStyle("-fx-background-color: white; -fx-padding: 10px;");
        hbPencarian.setAlignment(Pos.CENTER_LEFT);


        ImageView ivAkun = new ImageView("/gambar/akun.png");
        ivAkun.setFitHeight(35);
        ivAkun.setFitWidth(35);

        HBox hbAkun = new HBox(ivAkun);
        hbAkun.setMaxSize(20, 20);
        // hbAkun.setMinSize(30, 30);
        hbAkun.setStyle("-fx-background-color: red; -fx-padding: 10px;");
        
        HBox hbAtas = new HBox(30,hbPencarian, hbAkun);
        hbAtas.setMaxSize(640, 60);
        hbAtas.setMinSize(640, 60);
        hbAtas.setStyle("-fx-background-color: red; -fx-padding: 10px;");
        hbAtas.setAlignment(Pos.CENTER_LEFT);

        // Membuat background
        ImageView ivBackground = new ImageView("/gambar/background.png");
        ivBackground.setFitHeight(120);

        // Membuat Tampilan pilihan
        Label labelKategori = new Label("Kategori");
        labelKategori.setStyle("-fx-padding: 10px;");
        ImageView ivSembako = new ImageView("/gambar/sembako.png");
        ivSembako.setFitWidth(100);
        ivSembako.setFitHeight(150);
        ImageView ivPerawatanTubuh = new ImageView("/gambar/sembako.png");
        ivPerawatanTubuh.setFitWidth(100);
        ivPerawatanTubuh.setFitHeight(150);
        ImageView ivSarapan = new ImageView("/gambar/sembako.png");
        ivSarapan.setFitWidth(100);
        ivSarapan.setFitHeight(150);
        ImageView ivMakananInstan = new ImageView("/gambar/sembako.png");
        ivMakananInstan.setFitWidth(100);
        ivMakananInstan.setFitHeight(150);
        ImageView ivCemilan = new ImageView("/gambar/sembako.png");
        ivCemilan.setFitWidth(100);
        ivCemilan.setFitHeight(150);
        
        HBox hbKategori = new HBox(8, ivSembako, ivCemilan, ivMakananInstan, ivPerawatanTubuh, ivSarapan);
        hbKategori.setStyle("-fx-padding: 10px;");
        

        // Membuat scrollpane
        ScrollPane scrollPane = new ScrollPane(hbKategori);
        scrollPane.setFitToHeight(true);
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
  
        
        // Membuat lihat semua produk
        Label labelLihatProduck = new Label("Lihat Semua Produk");
        HBox hbLihat = new HBox(labelLihatProduck);
        hbLihat.setAlignment(Pos.CENTER);
        hbLihat.setStyle("-fx-background-color: white;");
        hbLihat.setOnMouseClicked(v->{
            // TODO
        });
        
        
        // Membuat bagian bawah
        // Home
        Label labelHome = new Label("Home");
        ImageView ivHome = new ImageView("/gambar/home.png");
        ivHome.setFitHeight(25);
        ivHome.setFitWidth(25);
        VBox vbHome = new VBox(3, ivHome, labelHome);
        vbHome.setAlignment(Pos.CENTER);

        // Menu keranjang
        Label labelTroli = new Label("Troli");
        labelTroli.setMaxSize(200, 30);
        labelTroli.setMaxSize(200, 30);
        ImageView ivTroli = new ImageView("/gambar/home.png");
        ivTroli.setFitHeight(25);
        ivTroli.setFitWidth(25);
        VBox vbTroli = new VBox(3, ivTroli, labelTroli);
        // vbTroli.setStyle("-fx-background-color: white;");
        // vbTroli.setMaxSize(100, 5);
        // vbTroli.setMaxSize(100, 5);
        vbTroli.setStyle("-fx-background-color: white; -fx-min-width: 50px; -fx-min-height: 20px; -fx-max-width: 100px; -fx-max-height: 40px;");
        // vbTroli.setAlignment(Pos.CENTER);
        // Menu Riwayat
        Label labelRiwayat = new Label("Riwayat");
        ImageView ivRiwayat = new ImageView("/gambar/home.png");
        ivRiwayat.setFitHeight(25);
        ivRiwayat.setFitWidth(25);
        VBox vbRiwayat = new VBox(3, ivRiwayat, labelRiwayat);
        // vbTroli.setAlignment(Pos.CENTER);
        HBox hbBawah = new HBox(vbHome ,vbTroli, vbRiwayat);
        // hbBawah.setAlignment(Pos.CENTER);
        // hbBawah.setStyle("-fx-background-color: yellow;");
        // hbBawah.setMaxSize(640, 35);
        // hbBawah.setMinSize(640, 35);






        VBox vdAll = new VBox(5, hbAtas, ivBackground,labelKategori,scrollPane, hbLihat, hbBawah);
        // vdAll.setMaxSize(640, 480);
        // vdAll.setMinSize(600, 400);
        vdAll.setStyle("-fx-background-color: blue;");
        // HboxPencarian.setStyle("-fx-background-color: blue");
        // StackPane spAll = new StackPane(vdAll, hbBawah);

        // VBox vbAll = new VBox(10, vdAll, hbBawah);


        Scene scene = new Scene(vdAll, 600, 480);
        // scene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm()

        stage.setScene(scene);
    }


    // public void show() {
    //     // Membuat label
    //     Label labelWarungku = new Label("WarungKu");
    //     labelWarungku.setAlignment(Pos.TOP_LEFT);
    //     labelWarungku.setStyle("-fx-padding: 10px;");

    //     // Membuat logo
    //     ImageView ivlogo = new ImageView("/gambar/logo.png");
    //     ivlogo.setFitHeight(40);
    //     ivlogo.setFitWidth(40);

    //     // Membuat label
    //     Label lebelHome = new Label("ini adalah aplikasi yang sangat baik untuk mengatur keuangan warung anda wahai pemilik warung");
    //     lebelHome.getStyleClass().add("desc-text");
    //     lebelHome.setWrapText(true);
    //     lebelHome.setMaxWidth(355);

    //     // Membuat tombol sign in
    //     Button btnLogIn = new Button("Log In");
    //     btnLogIn.setOnAction(v -> {
    //         LoginScene loginScene = new LoginScene(stage);
    //         loginScene.show();
    //     });
    //     btnLogIn.setAlignment(Pos.TOP_RIGHT);

    //     // Iv tombol
    //     ImageView ivWarung = new ImageView("/gambar/warung.png");
    //     ivWarung.setFitHeight(20);
    //     ivWarung.setFitWidth(20);
    //     ImageView ivProduck = new ImageView("/gambar/produck.jpg");
    //     ivProduck.setFitHeight(20);
    //     ivProduck.setFitWidth(20);
    //     ImageView ivRiwayat = new ImageView("/gambar/pencarian.png");
    //     ivRiwayat.setFitHeight(20);
    //     ivRiwayat.setFitWidth(20);
    //     ImageView ivBack = new ImageView("/gambar/pencarian.png");
    //     ivBack.setFitHeight(20);
    //     ivBack.setFitWidth(20);


    //     // Membuat tombol warungKu
    //     Button btnWarungku = new Button("WarungKu");
    //     btnWarungku.setGraphic(ivWarung);
    //     btnWarungku.setMaxHeight(80);
    //     btnWarungku.setMaxWidth(200);
    //     Button btnProdukKu = new Button("ProdukKu");
    //     btnProdukKu.setGraphic(ivProduck);
    //     btnProdukKu.setMaxHeight(80);
    //     btnProdukKu.setMaxWidth(200);
    //     Button btnRiwayat = new Button("Riwayat");
    //     btnRiwayat.setGraphic(ivRiwayat);
    //     btnRiwayat.setMaxHeight(80);
    //     btnRiwayat.setMaxWidth(200);
    //     Button btnBack = new Button("Back to Home");
    //     btnBack.setGraphic(ivBack);
    //     btnBack.setOnAction(v -> {

    //     });
    //     // btnBack.setAlignment(Pos.BOTTOM_LEFT);
    //     btnBack.setMaxHeight(80);
    //     btnBack.setMaxWidth(200);

    //     // Membuat vbox
    //     VBox root = new VBox();
    //     root.getChildren().addAll(btnWarungku, btnProdukKu, btnRiwayat);
    //     VBox kesamping = new VBox(5, root);

    //     // Membuat HBox
    //     HBox atas = new HBox(180, ivlogo, labelWarungku, btnLogIn);
    //     atas.setAlignment(Pos.TOP_CENTER);
    //     atas.setStyle("-fx-padding: 10px;");   

    //     // Membuat Vbox
    //     VBox atas2 = new VBox(20, atas, kesamping);
    //     // atas.setAlignment(Pos.TOP_CENTER);
    //     atas.setStyle("-fx-padding: 10px;");

    //     VBox bawah = new VBox(atas2, btnBack);

    //     // Membuat VBox
    //     VBox susun = new VBox(100, bawah, lebelHome);
    //     // susun.setAlignment(Pos.TOP_CENTER);


    //     Scene scene = new Scene(susun, 640, 480);
    //     // scene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());



    //     stage.setScene(scene);
    // }

    
}

