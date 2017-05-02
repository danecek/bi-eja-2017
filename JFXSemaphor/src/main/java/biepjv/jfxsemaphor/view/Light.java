/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.jfxsemaphor.view;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Light extends StackPane {

    public void setOn(boolean on) {
        this.on = on;
        c.setFill(on ? color : Color.DARKGREY);
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isOn() {
        return on;
    }
    
    private Color color;
    private boolean on;
    Circle c;

    public Light(Color color, int size) {
        this.color = color;
        this.getChildren().add(c = new Circle(size, color));        
    }

    
}
