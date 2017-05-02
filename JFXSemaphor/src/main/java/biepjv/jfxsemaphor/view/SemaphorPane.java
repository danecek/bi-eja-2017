/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.jfxsemaphor.view;

import biepjv.jfxsemaphor.controller.SemaphorController;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class SemaphorPane extends VBox implements Observer {

    public SemaphorPane(Observable observable, int size, Color... cols) {
        observable.addObserver(this);
        setSpacing(10);
        setPadding(new Insets(10));
        for (Color col : cols) {
            getChildren().add(new Light(col, size));
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        SemaphorController sc = (SemaphorController) o;
        Set<Color> onColors
                = new HashSet<>(Arrays.asList(sc.getCurrentState().getColors()));
        for (Node e : this.getChildren()) {
            Light l = (Light) e;
            l.setOn(onColors.contains(l.getColor()));
        }

    }

}
