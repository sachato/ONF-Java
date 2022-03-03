package services.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
}
