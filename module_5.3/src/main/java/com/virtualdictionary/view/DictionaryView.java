package com.virtualdictionary.view;

import com.virtualdictionary.controller.DictionaryController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class DictionaryView extends Application {

    private DictionaryController controller = new DictionaryController();

    public void start(Stage stage) {
        TextField inputField = new TextField();
        Button searchButton = new Button("Search");
        Label resultLabel = new Label();
        resultLabel.setWrapText(true);
        resultLabel.setMinWidth(250);

        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setAlignment(Pos.CENTER);

        pane.getChildren().addAll(inputField, searchButton, resultLabel);

        searchButton.setOnAction(event -> {
            String word = inputField.getText();
            String meaning = controller.getMeaning(word);
            resultLabel.setText(meaning);
        });

        Scene scene = new Scene(pane, 400, 150);
        stage.setTitle("Virtual Dictionary");
        stage.setScene(scene);
        stage.show();
    }
}

