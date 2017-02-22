package br.ufrpe.fastFood.gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class InserirCartaoController implements Initializable{
	
	@FXML
	private Button confirmar;
	
	@FXML
	private void BotaoConfirmar(ActionEvent event)
	{
		
		((Node) (event.getSource())).getScene().getWindow().hide();	
		
		try
		{
			Parent root = FXMLLoader.load(getClass().getResource("Pagamento Aprovado.fxml"));
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.setTitle("Login");
			stage.show();
		}
		catch(Exception e)
		{
			System.out.println("Erro!");
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
