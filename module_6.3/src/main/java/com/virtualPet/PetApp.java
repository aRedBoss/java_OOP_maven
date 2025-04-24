package com.virtualPet;

import com.virtualPet.controller.PetController;
import com.virtualPet.model.PetModel;
import com.virtualPet.view.PetView;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PetApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        PetModel model = new PetModel();
        PetView view = new PetView();
        PetController controller = new PetController(model);

        view.getCanvas().setOnMouseMoved(controller::onMouseMoved);
        view.getCanvas().setOnMouseExited(controller::onMouseExited);

        new AnimationTimer() {
            @Override
            public void handle(long now) {
                controller.update();
                view.render(model.getX(), model.getY());
            }
        }.start();

        primaryStage.setScene(new Scene(new javafx.scene.Group(view.getCanvas())));
        primaryStage.setTitle("Virtual Pet");
        primaryStage.show();
    }
}
