/**
 * package businesslogic.facade
 */
package businesslogic.facade;

/**
 * Imported classes and libraries.
 */
import java.sql.SQLException;
import java.util.*;

import businesslogic.domain.PlayerInGame;
import model.dao.factory.AbstractFactoryDAO;
import model.dao.mysql.GameDAO;
import model.dao.mysql.PlayerInGameDAO;

/**
 * @author Tiffany Dumaire
 */
public class GameFacade {

    /**
     * Default constructor
     */
    public GameFacade() {}

    /**
     * @param badPlayerUsername 
     * @param reason 
     * @param description 
     * @return
     */
    public boolean sendPlayerReport(String badPlayerUsername, String reason, String description) {
        // TODO implement here
        return false;
    }

    /**
     * 
     * @param username 
     * @return
     */
    public boolean proposeAsASheriff(int gameId, String username) {
    	AbstractFactoryDAO factory = AbstractFactoryDAO.getInstance();
		try {
			PlayerInGameDAO playerInGameDAO  = factory.createPlayerInGameDAO();	
			return playerInGameDAO.proposeAsASheriff(gameId, username);
		}catch(SQLException e) {
			e.getStackTrace();
			return false;
		}  
    }

    /**
     * 
     * @param username1 
     * @param username2 
     * @param game_id 
     * @return
     */
    public boolean makeAVote(String username1, String username2, int game_id) {
    	AbstractFactoryDAO factory = AbstractFactoryDAO.getInstance();
    	try {
    		GameDAO gameDAO = factory.createGameDAO();
    		return gameDAO.sendVote(username1,username2,game_id);
    	}catch (SQLException e){
    		e.getStackTrace();
    		return false;
    	}
    }

    /**
     * 
     * @param game_id 
     * @return
     */
    public ArrayList<String> getAllVotes(int game_id) {
        // TODO implement here
        return null;
    }
    
    /**
     * 
     * @param gameId
     * @param username
     * @return
     */
    public PlayerInGame getPlayerInGame(int gameId,String username) {
    	AbstractFactoryDAO factory = AbstractFactoryDAO.getInstance();
		try {
			PlayerInGameDAO playerInGameDAO  = factory.createPlayerInGameDAO();	
			return playerInGameDAO.getPlayerInGame(gameId, username);
		}catch(SQLException e) {
			e.getStackTrace();
			return null;
		}  
    }

    /**
     * 
     * @param gameId
     * @param username
     * @return
     */
    public boolean becomeLover(int gameId, String username) {
    	AbstractFactoryDAO factory = AbstractFactoryDAO.getInstance();
		try {
			PlayerInGameDAO playerInGameDAO  = factory.createPlayerInGameDAO();	
			return playerInGameDAO.becomeLover(gameId, username);
		}catch(SQLException e) {
			e.getStackTrace();
			return false;
		}  
    }
    
    /**
     * 
     * @param game_id 
     * @return
     */
    public ArrayList<String> getRoleList(int gameId) {
    	AbstractFactoryDAO factory = AbstractFactoryDAO.getInstance();
		try {
			PlayerInGameDAO playerInGameDAO  = factory.createPlayerInGameDAO();	
			return playerInGameDAO.getRoleList(gameId);
		}catch(SQLException e) {
			e.getStackTrace();
			return null;
		}
    }
    
    /**
     * 
     * @param game_id 
     * @return
     */
    public ArrayList<String> getPlayerList(int gameId) {
    	AbstractFactoryDAO factory = AbstractFactoryDAO.getInstance();
		try {
			PlayerInGameDAO playerInGameDAO  = factory.createPlayerInGameDAO();	
			return playerInGameDAO.getPlayerList(gameId);
		}catch(SQLException e) {
			e.getStackTrace();
			return null;
		}
    }
    
    /**
     * 
     * @param gameId
     * @return
     */
    public ArrayList<String> getPlayerInLove(int gameId) {
    	AbstractFactoryDAO factory = AbstractFactoryDAO.getInstance();
		try {
			PlayerInGameDAO playerInGameDAO  = factory.createPlayerInGameDAO();	
			return playerInGameDAO.getPlayerInLove(gameId);
		}catch(SQLException e) {
			e.getStackTrace();
			return null;
		}
    }
    
    /**
     * 
     * @param game_id 
     * @return
     */
    public ArrayList<PlayerInGame> getPlayerInGameList(int gameId) {
    	AbstractFactoryDAO factory = AbstractFactoryDAO.getInstance();
		try {
			PlayerInGameDAO playerInGameDAO  = factory.createPlayerInGameDAO();	
			return playerInGameDAO.getPlayerInGameList(gameId);
		}catch(SQLException e) {
			e.getStackTrace();
			return null;
		}
    }
    
    /**
     * 
     * @param gameId
     * @param username
     * @return
     */
    public boolean removePlayerInGame(int gameId, String username) {
    	AbstractFactoryDAO factory = AbstractFactoryDAO.getInstance();
		try {
			PlayerInGameDAO playerInGameDAO  = factory.createPlayerInGameDAO();	
			return playerInGameDAO.removePlayerInGame(gameId, username);
		}catch(SQLException e) {
			e.getStackTrace();
			return false;
		}  
    }
}