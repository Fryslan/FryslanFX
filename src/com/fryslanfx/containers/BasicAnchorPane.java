package com.fryslanfx.containers;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * User: Fryslan
 */
public class BasicAnchorPane extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        AnchorPane root = new AnchorPane();
        Scene scene = new Scene(root,400,400);
        stage.setScene(scene);
        stage.show();
    }
}
