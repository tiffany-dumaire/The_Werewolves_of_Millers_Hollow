package gui.controller;


import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import application.TheWerewolvesOfMillersHollow;
import businesslogic.facade.UserFacade;
import businesslogic.systemelement.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class LoginController implements Initializable {
	
	@FXML
	private TextField email;
	
	@FXML
	private TextField password;
	
	@FXML
	void login(ActionEvent event) throws SQLException, IOException {
		String mail = email.getText();
		String pwd = password.getText();
		UserFacade userFacade = new UserFacade();
		User user;
		try {
			user = userFacade.login(mail,pwd);
		}catch(SQLException e) {
			infoBox("Veuillez entrer un identifiant et une adresse correcte", null, "Failed");
            return;
		}
		TheWerewolvesOfMillersHollow.setScene(user,getClass().getResource("../PlayerMenuView.fxml"));
	}
	
	@FXML
	void returnMenu(ActionEvent event) throws IOException {
		TheWerewolvesOfMillersHollow.setScene(getClass().getResource("../view/StartMenuView.fxml"));
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
	//Methodes ajoutees
	
	
	public static void infoBox(String message, String head, String title){
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setContentText(message);
        alert.setTitle(title);
        alert.setHeaderText(head);
        alert.showAndWait();
    }
}
