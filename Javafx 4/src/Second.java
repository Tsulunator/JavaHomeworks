import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.CheckBox;
import javafx.scene.paint.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Second{

    @FXML private CheckBox balloonCheck;
    @FXML private CheckBox heartCheck;
    @FXML private CheckBox starCheck;
    @FXML private Canvas canvas;

    private final Random random = new Random();

    @FXML
    private void generateCard(){
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        List<String> selectedShapes = new ArrayList<>();
        if (balloonCheck.isSelected()) selectedShapes.add("balloon");
        if (heartCheck.isSelected()) selectedShapes.add("heart");
        if (starCheck.isSelected()) selectedShapes.add("star");

        for (int i = 0; i < 30; i++) {
            String shape = selectedShapes.get(random.nextInt(selectedShapes.size()));
            double x = random.nextDouble() * (canvas.getWidth() - 30);
            double y = random.nextDouble() * (canvas.getHeight() - 30);

            switch (shape) {
                case "balloon" -> drawBalloon(gc, x, y);
                case "heart" -> drawHeart(gc, x, y);
                case "star" -> drawStar(gc, x, y);
            }
        }
    }

    private void drawBalloon(GraphicsContext gc, double x, double y){
        gc.setFill(Color.ORANGE);
        gc.fillOval(x, y, 20, 30);
        gc.setStroke(Color.BLACK);
        gc.strokeLine(x + 10, y + 30, x + 10, y + 40);
    }

    private void drawHeart(GraphicsContext gc, double x, double y) {
        gc.setFill(Color.RED);
        gc.fillOval(x, y, 10, 10);
        gc.fillOval(x + 10, y, 10, 10);
        gc.beginPath();
        gc.moveTo(x, y + 5);
        gc.lineTo(x + 10, y + 20);
        gc.lineTo(x + 20, y + 5);
        gc.closePath();
        gc.fill();
    }

    private void drawStar(GraphicsContext gc, double x, double y) {
        gc.setFill(Color.GOLD);
        gc.fillPolygon(
                new double[]{x, x + 5, x + 20, x + 10, x + 15, x, x - 15, x - 10, x - 20, x - 5},
                new double[]{y - 20, y - 5, y - 5, y + 5, y + 20, y + 10, y + 20, y + 5, y - 5, y - 5},
                10
        );
    }
}