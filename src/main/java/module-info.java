module br.senai.sp.jandira.tabuadafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.senai.sp.jandira.tabuadafx to javafx.fxml;
    exports br.senai.sp.jandira.tabuadafx;
}