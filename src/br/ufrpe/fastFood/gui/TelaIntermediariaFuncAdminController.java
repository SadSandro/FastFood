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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class TelaIntermediariaFuncAdminController implements Initializable {
	
	@FXML
	private ImageView imgFunc;
	
	@FXML
	private ImageView imgAdmin;
	
	@FXML
	private Button entrarFunc;
	
	@FXML
	private Button entrarAdmin;
	
	@FXML
	private Button voltar;
	
	@FXML
	private void entrarFuncAction(ActionEvent event){
		
		((Node) (event.getSource())).getScene().getWindow().hide();
		try{

			Parent root = FXMLLoader.load(getClass().getResource("LoginFuncionario.fxml"));
			Stage stage = new Stage();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.setTitle("Login");
			stage.show();			

		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	@FXML
	private void entrarAdminAction(ActionEvent event)
	{
				
		((Node) (event.getSource())).getScene().getWindow().hide();
		try{

			Parent root = FXMLLoader.load(getClass().getResource("LoginAdmin.fxml"));
			Stage stage = new Stage();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.setTitle("Login");
			stage.show();			

		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	@FXML
	private void sairAction(ActionEvent event)
	{
				
		((Node) (event.getSource())).getScene().getWindow().hide();
		try{

			Parent root = FXMLLoader.load(getClass().getResource("Tela Inicial.fxml"));
			Stage stage = new Stage();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.setTitle("Login");
			stage.show();			

		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
		

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Image img = new Image("br/ufrpe/fastFood/gui/admin.png");
		this.imgFunc.setImage(img);
		
		Image img2 = new Image("br/ufrpe/fastFood/gui/person_3_icon-icons.com_68899.png");
		this.imgAdmin.setImage(img2);
		
	}
	
	

}
