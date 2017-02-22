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
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;



public class LoginFuncionarioController implements Initializable {

	@FXML
	private JFXTextField txtLoginF;

	@FXML
	private JFXPasswordField txtSenhaF;

	@FXML
	private Hyperlink esqueceuSenhaF;

	@FXML
	private JFXButton botaoEntrarF;

	@FXML
	private JFXButton botaoSairF;

	@FXML
	private Label avisoF;

	@FXML
	private ImageView imagemF;

	@FXML
	private void botaoEntrarActionF(ActionEvent event) throws ONFException, WPException{
		
		if (!(txtLoginF.getText().equals("") || !txtSenhaF.getText().equals(""))) {

			String login, senha;

			login = txtLoginF.getText();
			senha = txtSenhaF.getText();

			try{
				
				if(Fachada.getInstancia().loginFuncionario(login, senha)){
					
					try{
						((Node) (event.getSource())).getScene().getWindow().hide();

						Parent root = FXMLLoader.load(getClass().getResource("AdicionarCarrinhoComboProduto.fxml"));
						Scene scene = new Scene(root);
						Stage stage = new Stage();
						stage.setScene(scene);
						stage.setTitle("Novo Pedido");
						stage.setResizable(false);
						stage.show();

					}catch(IOException e){
						e.getMessage();
					}

				}else{
					avisoF.setText("Login ou Senha inv�lido ");
				}

			}catch(ONFException e){
				System.out.println(e.getMessage());
				avisoF.setText("Usu�rio n�o encontrado");
			}

		}else{
			avisoF.setText("Preencha os campos");
		}

	}

	@FXML
	private void botaoSairActionF(ActionEvent event){

		((Node) (event.getSource())).getScene().getWindow().hide();	
		try{
			Parent root = FXMLLoader.load(getClass().getResource("Tela Incial.fxml"));
			Scene scene = new Scene(root);
			Stage primaryStage = new Stage();
			primaryStage.setScene(scene);
			primaryStage.setTitle("Tela Incial");
			primaryStage.show();			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}


	}



	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Image img = new Image("br/ufrpe/fastFood/gui/LOGO_PROJETO.png");
		this.imagemF.setImage(img);

	}

}
