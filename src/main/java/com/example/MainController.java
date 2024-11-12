/*
* File: MainController.java
* Author: Molnár Bence
* Copyright: 2024, Molnár Bence
* Group: Szoft II-1-N
* Date: 2024-11-12
* Github: https://github.com/bence12345/
* Licenc: GNU GPL
*/

package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;


public class MainController {

    @FXML
    private TextField AsideField;

    @FXML
    private TextField BsideField;

    @FXML
    private TextField CsideField;

    @FXML
    private TextField DsideField;

    @FXML
    private TextField areaField;

    @FXML
    void onClickAboutButton(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Névjegy");
        alert.setHeaderText("Trapter JavaFX program");
        alert.setContentText("Molnár Bence\nSZOFT II-1-N\n2024-11-12");
        alert.showAndWait();
    }

    @FXML
    void onClickCalcButton(ActionEvent event) {
        startCalc();
    }

    @FXML
    private void startCalc() {
        // String aStr = AsideField.getText();
        // String bStr = BsideField.getText();
        // String cStr = CsideField.getText();
        // String dStr = DsideField.getText();

        double a = Double.parseDouble(AsideField.getText());
        double b = Double.parseDouble(BsideField.getText());
        double c = Double.parseDouble(CsideField.getText());
        double d = Double.parseDouble(DsideField.getText());

        //Double are ( a + b) * h / 2;
        //Double area = (a + b + c + d) / 2;
        double numerator = (a + c);
        double denominator = 4 * (a - c);
        double sqrtPart = Math.sqrt((a + b - c + d) * (a - b - c + d) * (a + b - c - d) * (-a + b + c + d));

        double area = (numerator / denominator) * sqrtPart;

        System.out.println(numerator);
        System.out.println(denominator);
        System.out.println(sqrtPart);

        System.out.println("Működik!" + area);

        //areaField.setText(String.valueOf(area));
        areaField.setText(String.format("%.12f\00B2", area));

        
    }

}
