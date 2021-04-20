package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage janela) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../telas/sample.fxml"));
        janela.setTitle("Banco");
        janela.setScene(new Scene(root, 800, 600));
        janela.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
