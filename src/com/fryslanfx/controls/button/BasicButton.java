package com.fryslanfx.controls.button;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * User: Fryslan
 */

public class BasicButton extends Application {
    /**
     * Launch the Application
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        //Create the root in the form of an AnchorPane object.
        AnchorPane root = new AnchorPane();
        //Create an Scene object using the root.
        Scene scene = new Scene(root,100,100);

        //Create an Button and set the Text to 'Click me!'.
        Button basic = new Button("Click Me!");

        //Set the X and Y location of the button.
        basic.setLayoutX(30);
        basic.setLayoutY(30);

        //Handle Button clicking.

        //  ---> Using Lambda.
        //       basic.setOnAction(event -> System.out.println("You just clicked the button!"));

        //  ---> Without Lambda.
        basic.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("You just clicked the button!");
            }
        });

        //Add the Button to the root/AnchorPane.
        root.getChildren().add(basic);

        //Add the scene to the stage.
        stage.setScene(scene);
        //show the stage.
        stage.show();
    }
}
