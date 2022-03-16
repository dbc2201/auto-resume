module io.github.dbc.autoresume {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.github.dbc.autoresume to javafx.fxml;
    exports io.github.dbc.autoresume;
}