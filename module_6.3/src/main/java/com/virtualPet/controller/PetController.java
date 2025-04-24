package com.virtualPet.controller;

import com.virtualPet.model.PetModel;
import javafx.scene.input.MouseEvent;

public class PetController {
    private final PetModel model;

    public PetController(PetModel model) {
        this.model = model;
    }

    public void onMouseMoved(MouseEvent event) {
        model.setTarget(event.getX(), event.getY());
    }

    public void onMouseExited(MouseEvent event) {
        model.stop();
    }

    public void update() {
        model.update();
    }
}
