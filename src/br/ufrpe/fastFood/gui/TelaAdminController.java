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

public class TelaAdminController implements Initializable{

	@FXML
	private JFXButton funcionarios;
	
	@FXML
	private JFXButton clientes;
	
	@FXML
	private JFXButton sair;
	
	@FXML
	private JFXButton produtos;
	
	@FXML
	private ImageView imgProdutos;
	
	/*@FXML
	private ImageView imgClientes;*/
	
	@FXML
	private ImageView imgFuncionarios;
	
	
	
	
	
	@FXML
	private void sair(ActionEvent event)
	{		
		try
		{
			((Node) (event.getSource())).getScene().getWindow().hide();	
			Parent root = FXMLLoader.load(getClass().getResource("Tela Inicial.fxml"));
			Scene scene = new Scene(root);
			Stage stage2 = new Stage();
			stage2.setScene(scene);
			stage2.setTitle("Tela Inicial");
			stage2.show();
		}
		catch(Exception e)
		{
			System.out.println("Erro!");
			System.out.println(e.getMessage());
		}
	}
	
	@FXML	
	private void produtos(ActionEvent event)
	{

		try
		{
			((Node) (event.getSource())).getScene().getWindow().hide();	
			Parent root = FXMLLoader.load(getClass().getResource("GerenciarProdutos.fxml"));
			Scene scene = new Scene(root);
			Stage stage2 = new Stage();
			stage2.setScene(scene);
			stage2.setTitle("Gerenciar Produtos");
			stage2.show();
		}
		catch(Exception e)
		{
			System.out.println("Erro!");
			System.out.println(e.getMessage());
		}
	}
	
	@FXML	
	private void funcionarios(ActionEvent event)
	{
	
		
		try
		{
			((Node) (event.getSource())).getScene().getWindow().hide();	
			Parent root = FXMLLoader.load(getClass().getResource("GerenciarFuncionarios.fxml"));
			Scene scene = new Scene(root);
			Stage stage2 = new Stage();
			stage2.setScene(scene);
			stage2.setTitle("Gerenciar Funcionarios");
			stage2.show();
		}
		catch(Exception e)
		{
			System.out.println("Erro!");
			System.out.println(e.getMessage());
		}
	}
	
	/*@FXML	
	private void clientes(ActionEvent event)
	{
			
		
		try
		{
			((Node) (event.getSource())).getScene().getWindow().hide();
			
			Parent root = FXMLLoader.load(getClass().getResource("GerenciarClientes.fxml"));
			Scene scene = new Scene(root);
			Stage stage2 = new Stage();
			stage2.setScene(scene);
			stage2.setTitle("Gerenciar Clientes");
			stage2.show();
		}
		catch(Exception e)
		{
			System.out.println("Erro!");
			System.out.println(e.getMessage());
		}
	}*/
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Image img, img2; //img3;
		
		img = new Image("br/ufrpe/fastFood/gui/icon-funcionario.png");
		img2 = new Image("br/ufrpe/fastFood/gui/icon-combo.png");
		//img3 = new Image("br/ufrpe/fastFood/gui/icon-self-service.png");
		
		//this.imgClientes.setImage(img3);
		this.imgFuncionarios.setImage(img);
		this.imgProdutos.setImage(img2);
		
	}

}
