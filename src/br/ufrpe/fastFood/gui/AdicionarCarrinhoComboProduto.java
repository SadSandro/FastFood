package br.ufrpe.fastFood.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AdicionarCarrinhoComboProduto extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		try
		{
			Parent root = FXMLLoader.load(getClass().getResource("AdicionarCarrinhoComboProduto.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Adicionar Carrinho /  Produto");
			primaryStage.show();
		}
		catch(Exception e)
		{
			System.out.println("Erro!");
			System.out.println(e.getMessage());
		}
		
	}
	

}
