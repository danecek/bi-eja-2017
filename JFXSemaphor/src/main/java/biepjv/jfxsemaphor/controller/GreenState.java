/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.jfxsemaphor.controller;

import javafx.scene.paint.Color;


public class GreenState extends State {
    
    public static final GreenState instance = new GreenState();

    public GreenState() {
        super(Color.GREEN);
    }

    @Override
    void exit(SemaphorController sc) {
        sc.setCurrentState(YellowState.instance);
    }
    
}
