/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradleproject7;

import com.google.api.client.http.AbstractInputStreamContent;
import com.google.api.client.http.ByteArrayContent;
import com.google.api.client.http.FileContent;
import com.google.api.client.http.InputStreamContent;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.model.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javax.swing.JFileChooser;

/**
 *
 * @author rizky
 */
public class homeController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
 
    // PRIVATE!
    
 public void uoload(){
        String filename = null;
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        java.io.File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
     }
  private void openFiles(ActionEvent event) {
        FileChooser fc = new FileChooser();
        List<java.io.File> f = fc.showOpenMultipleDialog(null);
        
  }
}

