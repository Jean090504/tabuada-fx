package br.senai.sp.jandira.tabuadafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
    TextField textFieldfMultiplicando;
    TextField textFieldfMenorMultiplicador;
    TextField textFieldfMaiorMultiplicador;
    ListView listaTabuada;

    @Override
    public void start(Stage stage) throws IOException {

        //Definir tamanho da tela (stage)
        stage.setWidth(600);
        stage.setHeight(700);

        //Componente principal
        VBox root = new VBox();
        Scene scene = new Scene(root);
        stage.setTitle("Tabuada");

        stage.setScene(scene);
        stage.show();


        //Criando Header
        VBox header = new VBox();
        header.setStyle("-fx-padding: 10; -fx-background-color: #2d5d9a");



        Label labelTitulo = new Label("Tabuada");
        labelTitulo.setStyle("-fx-text-fill: #fafafa; -fx-font-size: 24px; -fx-font-weight: Bold ");
        Label labelSubtitulo = new Label("Construa tabuadas sem limites!");
        labelSubtitulo.setStyle("-fx-text-fill: #fafafa; -fx-font-size: 14px;");

        header.getChildren().add(labelTitulo);
        header.getChildren().add(labelSubtitulo);

        //Criar Multiplicando
        GridPane gridFormulario = new GridPane();
        gridFormulario.setStyle("-fx-padding: 10px; -fx-background-color: #add5fa;");
        Label labelMultiplicando = new Label("Multiplicando");
        labelMultiplicando.setStyle("-fx-text-fill: #000000; -fx-font-size: 14px; -fx-label-padding: 10px");
        textFieldfMultiplicando = new TextField();

        Label labelMenorMultiplicador = new Label("Menor Multiplicador");
        textFieldfMenorMultiplicador = new TextField();
        labelMenorMultiplicador.setStyle("-fx-text-fill: #000000; -fx-font-size: 14px; -fx-label-padding: 10px");

        Label labelMaiorMultiplicador = new Label("Maior Multiplicador");
        textFieldfMaiorMultiplicador = new TextField();
        labelMaiorMultiplicador.setStyle("-fx-text-fill: #000000; -fx-font-size: 14px; -fx-label-padding: 10px");

        gridFormulario.add(labelMultiplicando, 0, 0);
        gridFormulario.add(textFieldfMultiplicando, 1, 0);
        gridFormulario.add(labelMenorMultiplicador, 0, 1);
        gridFormulario.add(textFieldfMenorMultiplicador, 1, 1);
        gridFormulario.add(labelMaiorMultiplicador, 0, 2);
        gridFormulario.add(textFieldfMaiorMultiplicador, 1, 2);

        //Criar o componente de botões
        HBox boxBotoes = new HBox();

        Button btnCalcular = new Button("Calcular");
        btnCalcular.setStyle("");
        btnCalcular.setOnAction(e -> {
            calcularTabuada();
        });

        Button btnLimpar = new Button("Limpar");
        btnLimpar.setStyle("");
        btnLimpar.setOnAction(e -> {

        });

        Button btnSair = new Button("Sair");
        btnSair.setStyle("");
        btnSair.setOnAction(e -> {

        });

        //Adicionar os botões ba boxBotões
        boxBotoes.getChildren().addAll(btnCalcular, btnLimpar, btnSair);

        //Adicionando Lista
        VBox boxResultado = new VBox();
        Label labelResultado = new Label("Resultados:");
        labelResultado.setStyle("-fx-text-fill: #1c0808; -fx-font-size: 18px; -fx-font-weight: bold");

        //Adicionar o listView
        listaTabuada = new ListView();

        //Adiciona o Label ao boxResultado
        boxResultado.getChildren().add(labelResultado);

        //adicionar componentes ao root
        root.getChildren().addAll(header);
        root.getChildren().add(gridFormulario);
        root.getChildren().addAll(boxBotoes);
        root.getChildren().add(boxResultado);
        root.getChildren().addAll(listaTabuada);

    }

    public void calcularTabuada() {
        int multiplicando = Integer.parseInt(textFieldfMultiplicando.getText());
        int menorMultiplicador = Integer.parseInt(textFieldfMenorMultiplicador.getText());
        int maiorMultiplicador = Integer.parseInt(textFieldfMaiorMultiplicador.getText());

        int tamanho = (maiorMultiplicador - menorMultiplicador) + 1;

        String[] tabuada = new String[tamanho];

        int contador = 0;
        while (contador < tabuada.length) {
            int produto = multiplicando * menorMultiplicador;

            tabuada[contador] = multiplicando + " x " + menorMultiplicador + " = " + produto;

            contador++;
            menorMultiplicador++;
        }

        listaTabuada.getItems().addAll(tabuada);

    }
}
