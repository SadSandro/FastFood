package br.ufrpe.fastFood.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import br.ufrpe.fastFood.beans.Admin;
import br.ufrpe.fastFood.exceptions.ONFException;
import br.ufrpe.fastFood.exceptions.WPException;
import br.ufrpe.fastFood.negocios.Fachada;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class LoginAdminController implements  Initializable{
	
	@FXML
	private JFXTextField txtLogin;

	@FXML
	private JFXPasswordField txtSenha;

	@FXML
	private JFXButton botaoEntrar;

	@FXML
	private JFXButton botaoSair;

	@FXML
	private Label aviso;

	@FXML
	private ImageView imagem;

	@FXML
	private void botaoEntrarAction(ActionEvent event) throws ONFException, WPException{
		

		if (!(txtLogin.getText().equals("") && !txtSenha.getText().equals(""))) {

			String login, senha;

			login = txtLogin.getText();
			senha = txtSenha.getText();

			try{
				
				if(Fachada.getInstancia().loginFuncionario(login, senha)){
					
					try{
						((Node) (event.getSource())).getScene().getWindow().hide();

						Parent root = FXMLLoader.load(getClass().getResource("TelaAdmin.fxml"));
						Scene scene = new Scene(root);
						Stage stage = new Stage();
						stage.setScene(scene);
						stage.setTitle("Tela Administrador");
						stage.setResizable(false);
						stage.show();

					}catch(IOException e){
						e.getMessage();
						aviso.setText("Login ou Senha inválido");
					}

				}else{
					aviso.setText("Login ou Senha inválido ");
				}

			}catch(ONFException e){
				System.out.println(e.getMessage());
				aviso.setText("Usuário não encontrado");
			}

		}else{
			aviso.setText("Preencha os campos");
		}

	}

	@FXML
	private void botaoSairAction(ActionEvent event){

		((Node) (event.getSource())).getScene().getWindow().hide();	
		try{
			Parent root = FXMLLoader.load(getClass().getResource("FuncionarioAdmin.fxml"));
			Scene scene = new Scene(root);
			Stage primaryStage = new Stage();
			primaryStage.setScene(scene);
			primaryStage.setTitle("Escolha o tipo");
			primaryStage.show();			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}


	}



	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Image img = new Image("br/ufrpe/fastFood/gui/LOGO_PROJETO.png");
		this.imagem.setImage(img);

	}

	

}
