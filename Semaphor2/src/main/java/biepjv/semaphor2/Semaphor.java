/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.semaphor2;

import biepjv.semaphor2.view.Light;
import biepjv.semaphor2.view.SemaphorPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Semaphor extends Application {    
    
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
      Scene  s = new Scene(new SemaphorPane(50, Color.RED, Color.YELLOW, Color.GREEN));
      primaryStage.setScene(s);
      primaryStage.centerOnScreen();
      primaryStage.show();
    }
    
}
