module com.tqh.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.tqh.quizapp to javafx.fxml;
    exports com.tqh.quizapp;
}
