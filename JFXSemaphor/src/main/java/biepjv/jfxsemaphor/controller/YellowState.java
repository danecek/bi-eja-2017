/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.jfxsemaphor.controller;

import javafx.scene.paint.Color;


public class YellowState extends State {
    
    public static final YellowState instance = new YellowState();

    public YellowState() {
        super(Color.YELLOW);
    }

    @Override
    void exit(SemaphorController sc) {
        sc.setCurrentState(RedState.instance);
    }
    
}
