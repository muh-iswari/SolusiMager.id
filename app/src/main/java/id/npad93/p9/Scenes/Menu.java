package id.npad93.p9.Scenes;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Menu extends Application {

    private Stage stage;

    public Menu(Stage stage) {
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
        ImageView ivlogo = new ImageView("/gambar/logo.png");
        ivlogo.setFitHeight(40);
        ivlogo.setFitWidth(40);

        // Membuat tombol sign in
        Button btnLogIn = new Button("Log In");
        btnLogIn.setOnAction(v -> {
            LoginScene loginScene = new LoginScene(stage);
            loginScene.show();
        });

        // Membuat HBox atas
        HBox atas = new HBox(150, btnLogIn, labelWarungku, ivlogo);
        atas.setAlignment(Pos.TOP_CENTER);
        atas.setMaxSize(640, 20);
        atas.setId("atas");
        atas.setStyle("-fx-padding: 4px;");

        // Membuat VBox vbKategori
        Text pilihan = new Text("Pilih Kategori");
        Button btn1 = new Button("Sembako");
        btn1.setOnAction(v -> {
            MenuSembako menuSembako = new MenuSembako(stage);
            menuSembako.kategori();
        });
        Button btn2 = new Button("Perawatan Tubuh");
        btn2.setOnAction(v -> {
            MenuPerawatanTubuh menuPerawatanTubuh = new MenuPerawatanTubuh(stage);
            menuPerawatanTubuh.kategori();
        });
        Button btn3 = new Button("Makanan Instan");
        Button btn4 = new Button("Bumbu Masak");
        Button btn5 = new Button("Makanan Ringan");
        VBox vbKategori = new VBox(10, btn1, btn2, btn3, btn4, btn5);
        vbKategori.setAlignment(Pos.CENTER);

        // Membuat VBox vbPilihan
        VBox vbPilihan = new VBox(30, pilihan, vbKategori);
        vbPilihan.setAlignment(Pos.CENTER);

        // Membuat VBox all
        VBox all = new VBox(100, atas, vbPilihan);

        Scene scene = new Scene(all, 640, 480);
        scene.getStylesheets().add(getClass().getResource("/styles/main_style.css").toExternalForm());

        stage.setScene(scene);
    }

    @Override
    public void start(Stage stage) {
        this.stage = stage;
        show();
        stage.show();
    }
}

abstract class PilihanMenu {
    Stage stage;

    abstract public void kategori();
}

class MenuSembako extends PilihanMenu {
    public MenuSembako(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void kategori() {
        HomeScene homeScene = new HomeScene(stage);
        homeScene.show();
    }
}
    
class MenuPerawatanTubuh extends PilihanMenu {
    public MenuPerawatanTubuh(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void kategori() {
        HomeScene homeScene = new HomeScene(stage);
        homeScene.show();
    }


}

