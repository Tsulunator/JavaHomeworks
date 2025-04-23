import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.HashMap;
import java.util.Map;

public class CurrencyController{
    @FXML private ChoiceBox<String> fromChoice;
    @FXML private ChoiceBox<String> toChoice;
    @FXML private Spinner<Double> amountSpinner;
    @FXML private Label resultLabel;
    private final Map<String, Double> rates = new HashMap<>();
    @FXML
    private void initialize(){
        rates.put("Lari", 1.0);
        rates.put("USD", 0.37);
        rates.put("GBP", 0.29);
        rates.put("Euro", 0.34);
        fromChoice.getItems().addAll("Lari", "USD", "GBP", "Euro");
        toChoice.getItems().addAll("Lari", "USD", "GBP", "Euro");
        fromChoice.setValue("Lari");
        toChoice.setValue("USD");
        SpinnerValueFactory<Double> valueFactory = new SpinnerValueFactory.DoubleSpinnerValueFactory(0, 100000, 1, 0.5);
        amountSpinner.setValueFactory(valueFactory);
        amountSpinner.valueProperty().addListener((obs, oldVal, newVal) -> updateResult());
        fromChoice.valueProperty().addListener((obs, oldVal, newVal) -> updateResult());
        toChoice.valueProperty().addListener((obs, oldVal, newVal) -> updateResult());
        updateResult();
    }

    private void updateResult() {
        String from = fromChoice.getValue();
        String to = toChoice.getValue();
        Double amount = amountSpinner.getValue();
        if (from == null || to == null || amount == null || !rates.containsKey(from) || !rates.containsKey(to)) {
            resultLabel.setText("Error");
            return;
        }
        double rateFrom = rates.get(from);
        double rateTo = rates.get(to);
        double converted = (amount / rateFrom) * rateTo;
        resultLabel.setText(String.format("%.2f %s", converted, to));
    }
}