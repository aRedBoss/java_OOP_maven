package com.CurrencyConverter.view;

import com.CurrencyConverter.controller.CurrencyConverterController;
import com.CurrencyConverter.model.Currency;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CurrencyConverterView extends Application {

    private final CurrencyConverterController controller = new CurrencyConverterController();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Currency Converter");

        Label instructions = new Label("Enter an amount, choose source and target currency, then click Convert.");

        Label amountLabel = new Label("Amount:");
        TextField amountField = new TextField();

        Label fromLabel = new Label("From Currency:");
        ComboBox<Currency> fromComboBox = new ComboBox<>();
        fromComboBox.getItems().addAll(controller.getModel().getCurrencies().values());

        Label toLabel = new Label("To Currency:");
        ComboBox<Currency> toComboBox = new ComboBox<>();
        toComboBox.getItems().addAll(controller.getModel().getCurrencies().values());

        Button convertButton = new Button("Convert");
        Label resultLabel = new Label("Converted Amount:");
        TextField resultField = new TextField();
        resultField.setEditable(false);

        convertButton.setOnAction(e -> {
            try {
                double amount = Double.parseDouble(amountField.getText());
                Currency from = fromComboBox.getValue();
                Currency to = toComboBox.getValue();
                if (from == null || to == null) {
                    showAlert("Please select both currencies.");
                    return;
                }
                double result = controller.convert(amount, from, to);
                resultField.setText(String.format("%.2f", result));
            } catch (NumberFormatException ex) {
                showAlert("Invalid amount. Please enter a numeric value.");
            }
        });

        VBox layout = new VBox(10,
                instructions,
                amountLabel, amountField,
                fromLabel, fromComboBox,
                toLabel, toComboBox,
                convertButton,
                resultLabel, resultField);
        layout.setPadding(new Insets(20));

        Scene scene = new Scene(layout, 400, 400);
        scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR, message, ButtonType.OK);
        alert.showAndWait();
    }
}
