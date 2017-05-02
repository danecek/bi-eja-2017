/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.jfxsemaphor.controller;

import java.util.Observable;
import java.util.logging.Logger;


public class SemaphorController extends Observable {

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State newState) {
        this.currentState = newState;
        update();
    }
    
    public void nextState() {
        currentState.exit(this);
        LOG.info(currentState.toString());        
    }
    
    private void update() {
        this.setChanged();
        this.notifyObservers();
    }
    
    private static final Logger LOG = Logger.getLogger(SemaphorController.class.getName());
    
    private State currentState = RedState.instance;
    
    
    
}
