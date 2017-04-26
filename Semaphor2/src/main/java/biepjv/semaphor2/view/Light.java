/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.semaphor2.view;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Light extends StackPane {
    
    Color color;
    boolean on;

    public Light(Color color, int size) {
        this.color = color;
        this.getChildren().add(new Circle(size, color));        
    }
    
    
}
