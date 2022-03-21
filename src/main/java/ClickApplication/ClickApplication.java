package ClickApplication; 

import javafx.application.Application; 
import static javafx.application.Application.launch; 
import javafx.scene.Parent; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.layout.StackPane; 
import javafx.stage.Stage; 

/** 
 * @author Profesora 
 */ 
public class ClickApplication extends Application { 

    // application for acceptance tests. 
    @Override 
    public void start(Stage stage) { 
        Parent sceneRoot = new ClickPane(); 
        Scene scene = new Scene(sceneRoot, 200, 200); 
        stage.setTitle("DEMO TestFX"); 
        stage.setScene(scene); 
        stage.show(); 
    } 

    // scene object for unit tests 
    public static class ClickPane extends StackPane { 
        public ClickPane() { 
            super();
            Button button = new Button("click me!"); 
            button.setOnAction(actionEvent -> button.setText("clicked!")); 
            getChildren().add(button); 
        }
    }
}