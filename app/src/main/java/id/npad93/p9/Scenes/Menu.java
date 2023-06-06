package id.npad93.p9.Scenes;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
            HomeScene homeScene = new HomeScene(stage);
            homeScene.show();
        });

        // Membuat HBox atas
        HBox atas = new HBox(150, btnBack, labelWarungku, btnLogout);
        atas.setAlignment(Pos.TOP_CENTER);
        atas.setMaxSize(640, 20);
        atas.setId("atas");
        atas.setStyle("-fx-padding: 4px;");

        // Membuat VBox vbKategori
        Text pilihan = new Text("Pilih Kategori");
        pilihan.setId("judul");
        Button btn1 = new Button("Sembako");
        btn1.setId("tombol");
        btn1.setOnAction(v -> {
            MenuSembako menuSembako = new MenuSembako(stage);
            menuSembako.kategori();
        });

        Button btn2 = new Button("Perawatan Tubuh");
        btn2.setId("tombol");
        btn2.setOnAction(v -> {
            MenuPerawatanTubuh menuPerawatanTubuh = new MenuPerawatanTubuh(stage);
            menuPerawatanTubuh.kategori();
        });

        Button btn3 = new Button("Makanan Instan");
        btn3.setId("tombol");
        btn3.setOnAction(v -> {
            MenuMakananInstan menuMakananInstan = new MenuMakananInstan(stage);
            menuMakananInstan.kategori();
        });

        Button btn4 = new Button("Bumbu Masak");
        btn4.setId("tombol");
        btn4.setOnAction(v -> {
            MenuBumbuMasak menuBumbuMasak = new MenuBumbuMasak(stage);
            menuBumbuMasak.kategori();
        });
        
        Button btn5 = new Button("Makanan Ringan");
        btn5.setId("tombol");
        btn5.setOnAction(v -> {
            MenuMakananRingan menuMakananRingan = new MenuMakananRingan(stage);
            menuMakananRingan.kategori();
        });

        VBox vbKategori = new VBox(10, btn1, btn2, btn3, btn4, btn5);
        vbKategori.setAlignment(Pos.CENTER);

        // Membuat VBox vbPilihan
        VBox vbPilihan = new VBox(30, pilihan, vbKategori);
        vbPilihan.setAlignment(Pos.CENTER);

        // Membuat VBox all
        VBox all = new VBox(50, atas, vbPilihan);


        Scene scene = new Scene(all, 640, 480);
        scene.getStylesheets().add(getClass().getResource("/styles/menu_style.css").toExternalForm());

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
        SembakoScene sembakoScene = new SembakoScene(stage);
        sembakoScene.show();
    }
}
    
class MenuPerawatanTubuh extends PilihanMenu {
    public MenuPerawatanTubuh(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void kategori() {
        PTubuhScene pTubuhScene = new PTubuhScene(stage);
        pTubuhScene.show();
    }
}

class MenuBumbuMasak extends PilihanMenu {
    public MenuBumbuMasak(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void kategori() {
        BumbuScene bumbuScene = new BumbuScene(stage);
        bumbuScene.show();
    }
}

class MenuMakananInstan extends PilihanMenu {
    public MenuMakananInstan(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void kategori() {
        MakananInstan makananInstan = new MakananInstan(stage);
        makananInstan.show();
    }
}
    
class MenuMakananRingan extends PilihanMenu {
    public MenuMakananRingan(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void kategori() {
        MakananRinganScene makananRinganScene = new MakananRinganScene(stage);
        makananRinganScene.show();
    }

}




