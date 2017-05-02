/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.jfxsemaphor;

import biepjv.jfxsemaphor.controller.SemaphorController;
import biepjv.jfxsemaphor.view.SemaphorPane;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Semaphor extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        SemaphorController sc = new SemaphorController();
        SemaphorPane sp = new SemaphorPane(sc, 50, Color.RED, Color.YELLOW, Color.GREEN);
        Button nextButton = new Button("Next");
        Button startButton = new Button("Start");
        Button stopButton = new Button("Stop");
        nextButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                sc.nextState();
            }
        });
        HBox buttonBox = new HBox(nextButton, startButton, stopButton);
        Scene s = new Scene(new VBox(sp, buttonBox));
        primaryStage.setScene(s);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

}
