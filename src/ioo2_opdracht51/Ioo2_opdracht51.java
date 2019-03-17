/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import domain.Hart;
import domain.Lamp;
import proces.ChirurgPresenter;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author H.M
 */
public class Ioo2_opdracht51 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Hart hart = new Hart();
        Lamp lamp = new Lamp();
        ChirurgPresenter operatiekamer = new ChirurgPresenter (hart, lamp);
        
        System.out.println("----------------------------------------");
        operatiekamer.cmdConnect();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
