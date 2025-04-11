import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.Random;

public class ThreeControl{
    @FXML
    private Button button;
    Random rnd = new Random();
    public void randomPosition() {
        button.setLayoutX(rnd.nextInt(0, 500));
        button.setLayoutY(rnd.nextInt(0, 500));
    }
}