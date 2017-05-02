/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.jfxsemaphor.controller;

import java.util.Set;
import javafx.scene.paint.Color;


public abstract class State {

    /**
     * @return the colors
     */
    public Color[] getColors() {
        return colors;
    }
    
    abstract void exit(SemaphorController sc);
    
    private Color[] colors;

    public State(Color ... colors) {
        this.colors = colors;
    }    
    
    
}
