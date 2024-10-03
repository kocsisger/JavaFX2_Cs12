module hu.unideb.inf.sfm {
    requires javafx.controls;
    requires javafx.fxml;

    opens hu.unideb.inf.sfm to javafx.fxml;
    exports hu.unideb.inf.sfm;
}
