package services.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

import model.Grille;
import model.VitesseExecution;

public class VitesseExecutionDao extends Dao{

	public void save(VitesseExecution vitesseExecution) {
		Connection connection = getConnection();
		PreparedStatement statement = null;
		try {
			String sql = "insert into VitesseExecution (nom,vitesse) values (?,?)";
			statement = connection.prepareStatement(sql);
			statement.setString(1, vitesseExecution.getNom());
			statement.setInt(2, vitesseExecution.getVitesse());
			System.out.println(sql);
			statement.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		finally{
			closeConnection(connection, statement);
		}
	}
	
	public VitesseExecution getFromNom(String nom) {
		Connection connection = getConnection();
		Statement statement=null;
		try {
			statement = connection.createStatement();
			ResultSet result = statement.executeQuery("select * from VitesseExecution where nom = '" + nom+"'");
			
			if (result.next()) {
				return buildVitesseExecutionFromRow(result);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		finally{
			closeConnection(connection, statement);
		}
		return null;
	}
	
	public List<VitesseExecution> getAll() {
		List<VitesseExecution> all = new ArrayList<>();
		Connection connection = getConnection();
		Statement statement=null;
		try {
			statement = connection.createStatement();
			ResultSet result = statement.executeQuery("select * from VitesseExecution order by vitesse");
			while (result.next()) {
				all.add(buildVitesseExecutionFromRow(result));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		finally{
			closeConnection(connection, statement);
		}
		return all;
	}
	
	
	private VitesseExecution buildVitesseExecutionFromRow(ResultSet result) throws SQLException {
		return new VitesseExecution(result.getString(1), result.getInt(2));
	}
}
