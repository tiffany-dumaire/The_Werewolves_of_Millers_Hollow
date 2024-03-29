/**
 * package application.
 */
package application;
	
/**
 * Imported libraries and classes.
 */
import java.io.IOException;
import java.net.URL;

import businesslogic.domain.Game;
import businesslogic.domain.Player;
import businesslogic.domain.PlayerInGame;
import businesslogic.domain.User;
import gui.controller.GameManagementController;
import gui.controller.LoginController;
import gui.controller.PlayerStatsController;
import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * 
 * @author Tiffany Dumaire
 *
 */
public class TheWerewolvesOfMillersHollow extends Application {
	
	/**
	 * Attribute containing the current stage of the application.
	 */
	private static Stage stage = null;
	
	public static Stage getStage() throws IOException{
		return TheWerewolvesOfMillersHollow.stage;
	}

	/**
	 * Allows the application to change scene.
	 * @param resources
	 * @throws IOException
	 */
    public static void setScene(URL resources) throws IOException {
        Parent root = FXMLLoader.load(resources);
        Scene scene = new Scene(root);
        TheWerewolvesOfMillersHollow.stage.setScene(scene);
    }
	
    /**
     * Allows the application to start
     * @param primaryStage
     */
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setResizable(false);
			TheWerewolvesOfMillersHollow.stage=primaryStage;
			primaryStage.setTitle("The Werewolves Of Millers Hollow");
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../gui/view/StartMenuView.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setFullScreen(false);
			primaryStage.getIcons().add(new Image(("@../../image/logo.png")));
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Allows the user to go to the admin menu
	 * @param admin
	 * @param resource
	 * @throws IOException
	 */
	public static void goToAdminMenu(User admin, URL resource) throws IOException {
		try {
			LoginController.setCurrentUser(admin);
		} catch (IOException e) {
			e.printStackTrace();
		}
        FXMLLoader loader = new FXMLLoader(resource);
        Parent root = loader.load();
        Scene scene = new Scene(root);
        TheWerewolvesOfMillersHollow.stage.setScene(scene);
    }
	
	/**
	 * Allows the user to go to the player menu
	 * @param player
	 * @param resource
	 * @throws IOException
	 */
	public static void goToPlayerMenu(User player, URL resource) throws IOException {
		try {
			LoginController.setCurrentUser(player);
		} catch (IOException e) {
			e.printStackTrace();
		}
        FXMLLoader loader = new FXMLLoader(resource);
        Parent root = loader.load();
        Scene scene = new Scene(root);
        TheWerewolvesOfMillersHollow.stage.setScene(scene);
    }
	
	 /**
     * Allows the user to go to the game management view with a generated game id
     * @param game
     * @param resource
     * @throws IOException
     */
    public static void generateGameIdInGameManagement(PlayerInGame player, Game game, URL resource) throws IOException {
        try {
        	GameManagementController.setCurrentPlayerInGame(player);
            GameManagementController.setCurrentGame(game);
        } catch (IOException e) {
            e.printStackTrace();
        }
        FXMLLoader loader = new FXMLLoader(resource);
        Parent root = loader.load();
        Scene scene = new Scene(root);
        TheWerewolvesOfMillersHollow.stage.setScene(scene);
    }
    
    /**
     * Allows the user to go to the game management view
     * @param game
     * @param resource
     * @throws IOException
     */
    public static void goToGameManagement(PlayerInGame player, Game game, URL resource) throws IOException {
        try {
        	GameManagementController.setCurrentPlayerInGame(player);
            GameManagementController.setCurrentGame(game);
        } catch (IOException e) {
            e.printStackTrace();
        }
        FXMLLoader loader = new FXMLLoader(resource);
        Parent root = loader.load();
        Scene scene = new Scene(root);
        TheWerewolvesOfMillersHollow.stage.setScene(scene);
    }
	
	/**
	 * Allows the user to go to the player stats view
	 * @param player
	 * @param resource
	 * @throws IOException
	 */
	public static void goToPlayerStats(Player player, URL resource) throws IOException {
		try {
			PlayerStatsController.setPlayer(player);
		} catch (IOException e) {
			e.printStackTrace();
		}
        FXMLLoader loader = new FXMLLoader(resource);
        Parent root = loader.load();
        Scene scene = new Scene(root);
        TheWerewolvesOfMillersHollow.stage.setScene(scene);
    }
	
	/**
	 * Main function
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
	
}
