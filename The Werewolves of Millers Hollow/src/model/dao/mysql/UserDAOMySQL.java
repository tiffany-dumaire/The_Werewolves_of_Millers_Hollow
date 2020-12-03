package model.dao.mysql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import businesslogic.systemelement.User;
import model.dao.factory.FactoryDAOMySQL;

/**
 * @author Tiffany Dumaire
 */
public class UserDAOMySQL extends UserDAO{

    /**
     * Default constructor
     */
    public UserDAOMySQL() {
    }

    /**
     * @param userId 
     * @return
     */
    public User getUserById(int userId) {
    	return null;
    }

    /**
     * @param email 
     * @return
     */
    public User getUserByEmail(String email) throws SQLException {
    	//Search the User by his email in the database.
		String sqlRequest="SELECT * FROM User WHERE email=?";
		PreparedStatement request = FactoryDAOMySQL.getConnection().prepareStatement(sqlRequest);
    	request.setString(1, email);
    	ResultSet resultSet = request.executeQuery();
    	//Return the User if he exists.
    	if(resultSet.first()){
    		return null;
    	}
    	else{
    		return new User(resultSet.getInt("userId"),resultSet.getString("email"),resultSet.getString("password"),resultSet.getBoolean("idAdmin"));
    	}
    }
    
    public boolean exist(String email) throws SQLException {
		//Search the User by his email in the database.
    	String sqlRequest = "SELECT COUNT(*) FROM User WHERE email=?";
    	PreparedStatement request = FactoryDAOMySQL.getConnection().prepareStatement(sqlRequest);
    	request.setString(1, email);
    	ResultSet resultSet = request.executeQuery();
    	return resultSet.first();
    }

    /**
     * @param email
     * @param password
     * @return
     */
	public User getUserByLogin(String email, String password) throws SQLException{
		//Search the User by his email and password in the database.
		String sqlRequest="SELECT * FROM User WHERE email=? AND password=?";
		PreparedStatement request = FactoryDAOMySQL.getConnection().prepareStatement(sqlRequest);
    	request.setString(1, email);
    	request.setString(2, password);
    	ResultSet resultSet = request.executeQuery();
    	//Return the User if he exists.
    	if(resultSet.first()){
    		return null;
    	}
    	else{
    		return new User(resultSet.getInt("userId"),resultSet.getString("email"),resultSet.getString("password"),resultSet.getBoolean("isAdmin"));
    	}
	}
}