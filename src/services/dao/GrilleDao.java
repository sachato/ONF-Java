package services.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import model.Grille;

public class GrilleDao extends Dao {

	public void save(Grille grille) {
		Connection connection = getConnection();
		PreparedStatement statement = null;
		try {
			String sql = "insert into Grille (nom,taille) values (?,?)";
			statement = connection.prepareStatement(sql);
			statement.setString(1, grille.getNom());
			statement.setString(2, grille.getTaille());
			System.out.println(sql);
			statement.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		finally{
			closeConnection(connection, statement);
		}
	}
	
	public Grille getFromNom(String nom) {
		Connection connection = getConnection();
		Statement statement=null;
		// TODO
		try {
			statement = connection.createStatement();
			ResultSet result = statement.executeQuery("select * from Grille where nom = '" + nom+"'");
			if (result.next()) {
				return buildGrilleFromRow(result);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		finally{
			closeConnection(connection, statement);
		}
		return null;
	}
	
	public List<Grille> getAll() {
		List<Grille> all = new ArrayList<>();
		Connection connection = getConnection();
		Statement statement=null;
		try {
			statement = connection.createStatement();
			ResultSet result = statement.executeQuery("select * from Grille order by nom");
			while (result.next()) {
				all.add(buildGrilleFromRow(result));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		finally{
			closeConnection(connection, statement);
		}
		return all;
	}
	
	
	private Grille buildGrilleFromRow(ResultSet result) throws SQLException {
		return new Grille(result.getString(1), result.getString(2));
	}
	
	
}
