/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradleproject7;

import com.google.common.collect.ComparisonChain;
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author rizky
 */
public class jalankan extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/src/main/java/gradleproject7/home.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Google Drive Desktop");
        scene.setOnMouseClicked((MouseEvent event) -> {
            if (event.getClickCount() == 2) {
                stage.setFullScreen(true);
            }
        });
        stage.show();
    }

    public static void main(String[] args) throws IOException{
        launch(args);
    }
}