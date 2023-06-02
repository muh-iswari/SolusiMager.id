package id.npad93.p9.models;

import id.npad93.p9.Scenes.LoginScene;

class Login {
    private String username, password;

    public Login() {
    }

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void getValue(){
    }


}

public class LoginModel {

    public static void main(String[] args) {
        Login login = new Login();
        // login.setUsername(LoginScene.);
    }

    public void list() {
        
    }

}
