package br.ufrpe.fastFood.gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import br.ufrpe.fastFood.beans.Combo;
import br.ufrpe.fastFood.beans.Produto;
import br.ufrpe.fastFood.beans.Venda;
import br.ufrpe.fastFood.exceptions.ONFException;
import br.ufrpe.fastFood.negocios.Fachada;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class AdicionarCarrinhoComboProdutoController implements Initializable{

	@FXML
	private JFXButton botaoSair;

	@FXML
	private JFXButton botaoConcluir;

	@FXML
	private JFXTextField txtIdCombo;

	@FXML
	private JFXTextField txtIdProduto;

	@FXML
	private TableView<Combo> tabelaC;

	@FXML
	private TableColumn<Combo, String> colunaNomeC;

	@FXML
	private TableColumn<Combo, String> colunaIdC;

	@FXML
	private TableColumn<Combo, String> colunaP1;

	@FXML
	private TableColumn<Combo, String> colunaP2;

	@FXML
	private TableColumn<Combo, String> colunaP3;

	@FXML
	private TableColumn<Combo, Double> valorC;



	@FXML
	private TableView<Produto> tabelaP;

	@FXML
	private TableColumn<Produto, String> colunaNomeP;

	@FXML
	private TableColumn<Produto, String> colunaIdP;

	@FXML
	private TableColumn<Produto, Double> valorP;
	
	@FXML
	private void botaoAdicionarPAction(ActionEvent event){
		Venda venda = new Venda();
		
		if(!txtIdProduto.equals("")){
			
			String id = txtIdProduto.getText();					
			
			try {
				if(Fachada.getInstancia().procurarProduto(id) != null){
					
					venda.comprarProduto(Fachada.getInstancia().procurarProduto(id));
					Fachada.getInstancia().cadastrarVenda(venda);
					
				}
			} catch (ONFException e) {
				e.printStackTrace();
			}
			
			
		}
		
	}
	
	@FXML
	private void botaoAdicionarCAction(ActionEvent event){
		Venda venda = new Venda();
		if(!txtIdCombo.equals("")){
			
			String id = txtIdCombo.getText();					
			
			try {
				if(Fachada.getInstancia().procurarCombo(id) != null){
					
					
					
					venda.comprarCombo(Fachada.getInstancia().procurarCombo(id));
					Fachada.getInstancia().cadastrarVenda(venda);
				}
			} catch (ONFException e) {
				e.printStackTrace();
			}
			
			
		}
		
	}


	@FXML
	private void botaoVoltarAction(ActionEvent event){
		
		
	}
	
	@FXML
	private void botaoConcluirAction(ActionEvent event){
		
	}





	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//Tabela de produtos
		ArrayList<Produto> p = (ArrayList<Produto>) Fachada.getInstancia().listarProdutos();

		colunaNomeP.setCellValueFactory(new PropertyValueFactory<>("nome"));
		colunaIdP.setCellValueFactory(new PropertyValueFactory<>("codigo"));
		valorP.setCellValueFactory(new PropertyValueFactory<>("valor"));

		tabelaP.setItems(FXCollections.observableArrayList(p));
		
		//Tabela de Combos
		
		ArrayList<Combo> c = (ArrayList<Combo>) Fachada.getInstancia().listarCombos();

		colunaNomeC.setCellValueFactory(new PropertyValueFactory<>("nome"));
		colunaIdC.setCellValueFactory(new PropertyValueFactory<>("codigo"));
		valorC.setCellValueFactory(new PropertyValueFactory<>("valor"));
		this.colunaP1.setCellValueFactory(new  PropertyValueFactory<>("p1"));
		this.colunaP2.setCellValueFactory(new  PropertyValueFactory<>("p2"));
		this.colunaP3.setCellValueFactory(new  PropertyValueFactory<>("p3"));

		tabelaC.setItems(FXCollections.observableArrayList(c));

	}

}
