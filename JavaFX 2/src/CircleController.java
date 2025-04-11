import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleController{
    @FXML
    private Circle Circle;

    public void Up() {
        Circle.setCenterY(Circle.getCenterY() - 10);
    }

    public void Down() {
        Circle.setCenterY(Circle.getCenterY() + 10);
    }

    public void Right() {
        Circle.setCenterX(Circle.getCenterX() + 10);
    }

    public void Left() {
        Circle.setCenterX(Circle.getCenterX() - 10);
    }

    public void RightDown() {
        Circle.setCenterX(Circle.getCenterX() - 10);
        Circle.setCenterY(Circle.getCenterY() + 10);
    }

    public void LeftDown() {
        Circle.setCenterX(Circle.getCenterX() - 10);
        Circle.setCenterY(Circle.getCenterY() - 10);
    }
    
    public void LeftUp() {
        Circle.setCenterX(Circle.getCenterX() + 10);
        Circle.setCenterY(Circle.getCenterY() - 10);
    }

    public void RightUp() {
        Circle.setCenterX(Circle.getCenterX() + 10);
        Circle.setCenterY(Circle.getCenterY() + 10);
    }

    public void Red() {
        Circle.setFill(Color.RED);
    }
}