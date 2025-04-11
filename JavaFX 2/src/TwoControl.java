import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

public class TwoControl{
    @FXML
    private AnchorPane anchorPane;
    Random rnd = new Random();
    public void randColor(){
        int r = rnd.nextInt(0, 255);
        int g = rnd.nextInt(0, 255);
        int b = rnd.nextInt(0, 255);
        anchorPane.setStyle("-fx-background-color: rgb(" + r + ", " + g + ", " + b + ")");
    }
}