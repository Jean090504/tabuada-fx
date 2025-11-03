package br.senai.sp.jandira.tabuadafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //Definir tamanho da tela (stage)
        stage.setWidth(600);
        stage.setHeight(700);

        //Componente principal
        VBox root = new VBox();
        Scene scene = new Scene(root);

        //Criando Header
        VBox header = new VBox();
        header.setStyle("-fx-padding: 10; -fx-background-color: #027fff");
        root.getChildren().addAll(header);


        Label labelTitulo = new Label("Tabuada");
        labelTitulo.setStyle("-fx-text-fill: #fafafa; -fx-font-size: 24px; -fx-font-weight: Bold ");
        Label labelSubtitulo = new Label("Construa tabudas sem limites!");
        labelSubtitulo.setStyle("-fx-text-fill: #fafafa; -fx-font-size: 14px;");

        header.getChildren().add(labelTitulo);
        header.getChildren().add(labelSubtitulo);

        //Criar Multiplicando
        HBox multiplicandoBox = new HBox();
        multiplicandoBox.setStyle("-fx-padding: 10");
        Label labelMultiplicando = new Label("Multiplicando");
        labelMultiplicando.setStyle("-fx-text-fill: #000000; -fx-font-size: 14px;");
        TextField textFieldfMultiplicando = new TextField();

        multiplicandoBox.getChildren().add(labelMultiplicando);
        multiplicandoBox.getChildren().add(textFieldfMultiplicando);
        root.getChildren().add(multiplicandoBox);


        stage.setScene(scene);
        stage.setTitle("Tabuada");
        stage.show();



    }
}
