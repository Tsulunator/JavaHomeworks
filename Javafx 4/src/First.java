import javafx.fxml.FXML;
import javafx.scene.control.*;

public class First{

    @FXML private RadioButton catRadio;
    @FXML private RadioButton dogRadio;
    @FXML private RadioButton rabbitRadio;
    @FXML private RadioButton birdRadio;
    @FXML private TextField nameField;
    @FXML private Label resultLabel;
    private final ToggleGroup petToggleGroup = new ToggleGroup();

    @FXML
    private void initialize() {
        catRadio.setToggleGroup(petToggleGroup);
        dogRadio.setToggleGroup(petToggleGroup);
        rabbitRadio.setToggleGroup(petToggleGroup);
        birdRadio.setToggleGroup(petToggleGroup);
    }

    @FXML
    private void handlePetChoice() {
        RadioButton selected = (RadioButton) petToggleGroup.getSelectedToggle();
        String pet = selected != null ? selected.getText() : "Unknown";
        String name = nameField.getText().trim();
        if (name.isEmpty()) {
            resultLabel.setText("Please enter a pet name.");
        } else {
            resultLabel.setText("You have chosen " + pet + " as " + name);
        }
    }
}