/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipod;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;


/**
 *
 * @author Henna
 */
public class iPod extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        
        Scene scene = new Scene(grid, 250, 400);
  
        Button playBtn = new Button("▶");
        Button pauseBtn = new Button("❚❚");
        Button stopBtn = new Button("◼");
        Button exitBtn = new Button("Exit");

        
        /*
        Image image = new Image("playButton.jpg");
        ImageView display = new ImageView();
        display.setImage(image);
        
        
        grid.add(display, 1, 1);
        */
       
        grid.add(playBtn, 3, 2);
        grid.add(pauseBtn,2,2);
        grid.add(stopBtn,4,2);
        grid.add(exitBtn,3,3);
        
        playBtn.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e){
                
                //START
                Runnable play = new MP3Class();
                Thread playThread = new Thread(play);
                playThread.start();
                
                
            }
        });
        
       exitBtn.setOnAction(new EventHandler <ActionEvent>(){
           

            @Override
            public void handle(ActionEvent event) {
                 Runnable killtask = new killClass();
                 Thread killThread = new Thread(killtask);
                 
                 //INSERTED PRIORITY 
                 killThread.setPriority(MIN_PRIORITY);
                 killThread.start();   
                 
            }
       });
       
       
       pauseBtn.setOnAction(new EventHandler <ActionEvent>(){

            @Override
            public void handle(ActionEvent event) {
                  
                 
            }
       });
        
        
        primaryStage.setTitle("My iPod");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public void playWait (){
        
    }
    
}
