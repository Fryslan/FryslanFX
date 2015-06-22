package com.fryslanfx.controls.date_picker;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.time.LocalDate;

/**
 * User: Fryslan
 */
public class DatePickerExample extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //Set the root and Scene.
        AnchorPane root = new AnchorPane();
        Scene scene = new Scene(root, 300, 300);

        //Create an Label to display the selected date.
        Label dateLabel = new Label("Please select an Date");
        dateLabel.setLayoutX(25);
        dateLabel.setLayoutY(25);
        root.getChildren().add(dateLabel);

        //Create an new DatePicker Object.
        DatePicker picker = new DatePicker();
        //Set the Location of the DatePicker.
        picker.setLayoutX(25);
        picker.setLayoutY(50);
        //Handle Clicks in the DatePicker.
        picker.setOnAction(event -> {
            //Get the Selected date and set the label to show the selected date.
            LocalDate selectedDate = picker.getValue();
            dateLabel.setText("You selected : " + selectedDate.toString());
        });
        root.getChildren().add(picker);


        //Set Scene to stage and show the stage
        stage.setScene(scene);
        stage.show();
    }
}
