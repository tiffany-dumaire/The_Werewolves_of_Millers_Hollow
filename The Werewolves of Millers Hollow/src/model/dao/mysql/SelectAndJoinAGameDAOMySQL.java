/**
 * package model.dao.mysql
 */
package model.dao.mysql;

/**
 * Imported classes and libraries.
 */
import java.util.*;
import businesslogic.domain.Game;

/**
 * @author Tiffany Dumaire - Aaron Lazaroo - Clarence Rouvel
 */
public class SelectAndJoinAGameDAOMySQL extends SelectAndJoinAGameDAO {

    /**
     * Default constructor
     */
    public SelectAndJoinAGameDAOMySQL() {}

    @Override
    public Game getGameById(int game_id) {
    	return null;
    }

    @Override
    public ArrayList<Game> getAvailableGameList(){
    	return new ArrayList<Game>();
    }

    @Override
    public boolean makePlayerJoinAGameByGameId(int game_id) {
    	return true;
    }

}