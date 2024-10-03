package hu.unideb.inf.sfm;

import hu.unideb.inf.sfm.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class StudentsSceneController {

    private Model model = new Model();

    @FXML
    private Label colorLabel;

    @FXML
    private Label creditsLabel;

    @FXML
    private Label dateOfBirthLabel;

    @FXML
    private Label nameLabel;


    @FXML
    void changeColor(ActionEvent event) {
        if (colorLabel.getText().equals("Black"))
            colorLabel.setText("White");
        else colorLabel.setText("Black");
    }

   /* private void refreshName(){
        nameLabel.setText(model.getStudent().getName());
    }*/

    @FXML
    void changeData(ActionEvent event) {
        model.getStudent().setName("Tom Smith");
        //refreshName();
    }

    @FXML
    void loadData(ActionEvent event) {
    //    refreshName();
        nameLabel.textProperty().bind(model.getStudent().nameProperty());
        creditsLabel.setText("" + model.getStudent().getCredits());
        dateOfBirthLabel.setText(model.getStudent().getDateOfBirth().toString());
    }
}
