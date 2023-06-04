package id.npad93.p9.Scenes;

import javax.security.auth.callback.LanguageCallback;
// import id.npad93.p9.models.LoginModel;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.HLineTo;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class LoginScene {
    private Stage stage;
    private TextField tfName = new TextField();
    private TextField tfPass = new TextField();
    

    public LoginScene() {
    }

    public LoginScene(TextField tfName, TextField tfPass) {
        this.tfName = tfName;
        this.tfPass = tfPass;
    }

    public LoginScene(Stage stage) {
        this.stage = stage;
    }

    public void show() {
        Text textHome = new Text("Log In");
        // Label lebelHome = new Label("ini adalah aplikasi yang sangat baik untuk mengatur keuangan warung anda wahai pemilik warung");
        // lebelHome.getStyleClass().add("desc-text");
        // lebelHome.setWrapText(true);
        // lebelHome.setMaxWidth(355);
        tfName.setPromptText("nama");
        tfPass.setPromptText("password");
        VBox vbInput = new VBox(6, tfName, tfPass);
        vbInput.setAlignment(Pos.CENTER);
        Button btnLogIn = new Button("Log In");
 
        btnLogIn.setOnAction(v -> {
            Menu menu = new Menu(stage);
            menu.show();
        });

        VBox susun = new VBox(5, textHome,vbInput ,btnLogIn);
        susun.setAlignment(Pos.CENTER);


        Scene scene = new Scene(susun, 640, 480);
        scene.getStylesheets().add(getClass().getResource("/styles/login_style.css").toExternalForm());
        // ImageView ivBackground = new ImageView("/gambar/bg.png");
        // ivBackground.setFitWidth(scene.getWidth());
        // ivBackground.setFitHeight(scene.getHeight());
        // susun.getChildren().add(ivBackground);

        stage.setScene(scene);

    }


    public static void main(String[] args) {
        // Login login = new Login();
        // login.setUsername(LoginScene.);
    }


}


