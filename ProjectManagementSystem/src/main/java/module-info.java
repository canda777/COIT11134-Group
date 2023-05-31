module managementsystempackage {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    
    opens managementsystempackage to javafx.fxml;
    opens managementsystempackage.controller to javafx.fxml;
  //  opens managementsystempackage.model to javafx.base;
    exports managementsystempackage;
}
