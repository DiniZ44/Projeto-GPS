/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gps.app;

import br.com.gps.exceptions.FXMLExcepton;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.stage.Modality;
import javafx.stage.WindowEvent;

/**
 *
 * @author santo
 */
public class App extends Application {
    
    public static Stage STAGE = new Stage();
    public static Stage STAGE_DASHBOARD = new Stage();
    
    @Override
    public void start(Stage primayStage) throws FXMLExcepton, IOException{
        STAGE.initOwner(STAGE_DASHBOARD);
        STAGE.initModality(Modality.WINDOW_MODAL);
        
//        stageLogin().show();

    }
    
//    public static Stage stageLogin() throws IOException{
//        STAGE.setScene(new Scene(FXMLLoader.load(App.class.getResource(Tela_Login))));
//        STAGE.setResizable(false);
//        STAGE.setOnCloseRequest(new EventHandler<WindowEvent>() {
//            public void handle(WindowEvent event) { STAGE.close();
//                
//            }
//        });
//        return STAGE;
//    }
//    
//    public static Stage stageDashboard() throws IOException{
//        STAGE_DASHBOARD.setScene(new Scene(FXMLLoader.load(App.class.getResource(Tela_Principal))));
//        STAGE.setOnCloseRequest(new EventHandler<WindowEvent>() {
//            public void handle(WindowEvent event) { System.exit(0);
//                
//            }
//        });
//        return STAGE_DASHBOARD;
//    }
//    
//       public static Stage stageGenerica(String caminho) throws IOException{
//        STAGE.setScene(new Scene(FXMLLoader.load(App.class.getResource(caminho))));
//        STAGE.setOnCloseRequest(new EventHandler<WindowEvent>() {
//            public void handle(WindowEvent event) { STAGE.close();
//                
//            }
//        });
//        return STAGE;
//    }
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        
        launch(args);
       
    }
    
}
