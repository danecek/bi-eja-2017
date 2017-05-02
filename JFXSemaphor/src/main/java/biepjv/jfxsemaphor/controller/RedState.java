/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.jfxsemaphor.controller;

import javafx.scene.paint.Color;


public class RedState extends State {
    
    public static final RedState instance = new RedState();

    public RedState() {
        super(Color.RED);
    }

    @Override
    void exit(SemaphorController sc) {
        sc.setCurrentState(RedYellowState.instance);
    }
    
}
