package com.virtualPet.view;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class PetView {
    private final Canvas canvas;
    private final GraphicsContext gc;
    private final Image petImage;

    public PetView() {
        this.canvas = new Canvas(800, 600);
        this.gc = canvas.getGraphicsContext2D();
        this.petImage = new Image("petImage.png");
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void render(double x, double y) {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc.drawImage(petImage, x - petImage.getWidth() / 2, y - petImage.getHeight() / 2);
    }
}
