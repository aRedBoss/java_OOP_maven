package com.virtualPet.model;

public class PetModel {
    private double x = 400, y = 300;
    private double targetX = 400, targetY = 300;
    private boolean moving = false;

    public double getX() { return x; }
    public double getY() { return y; }
    public void setTarget(double x, double y) {
        this.targetX = x;
        this.targetY = y;
        this.moving = true;
    }
    public void stop() { this.moving = false; }
    public boolean isMoving() { return moving; }

    public void update() {
        if (!moving) return;

        double dx = targetX - x;
        double dy = targetY - y;
        double distance = Math.sqrt(dx * dx + dy * dy);

        if (distance < 2) {
            x = targetX;
            y = targetY;
            moving = false;
        } else {
            double speed = 3;
            x += speed * dx / distance;
            y += speed * dy / distance;
        }
    }
}
