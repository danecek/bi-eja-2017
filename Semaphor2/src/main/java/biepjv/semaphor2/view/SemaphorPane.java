/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.semaphor2.view;

import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class SemaphorPane extends VBox {

    public SemaphorPane(int size, Color ... cols) {
        setSpacing(10);
        setPadding(new Insets(10));
        for (Color col : cols) {
            getChildren().add(new Light(col, size));
        }
        
    }
    
}
