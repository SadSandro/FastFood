package br.ufrpe.fastFood.gui;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class FazerPedidoFuncController implements Initializable {
	
	@FXML
	private JFXButton botaoPedido;
	
	@FXML
	private JFXButton botãoVoltar;
	
	@FXML
	private ImageView imgPedido;
	
	@FXML
	private void botaoPedidoAction(ActionEvent event){
		
		
	}
	
	@FXML
	private void botaoVoltarAction(ActionEvent event){
		
		((Node)(event).getSource()).getScene().getWindow().hide();
		try{
			Parent root =  FXMLLoader.load(getClass().getResource("LoginFuncionario.fxml"));
			Scene scene = new Scene(root);
			Stage stage =  new Stage();
			stage.setScene(scene);
			stage.setTitle("Login");
			stage.show();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Image img =  new Image("br/ufrpe/fastFood/gui/icon-produto.png");
		this.imgPedido.setImage(img);
		
	}

}
