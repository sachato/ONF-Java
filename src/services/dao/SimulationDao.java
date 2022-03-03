package services.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Simulation;

public class SimulationDao extends Dao{

	public void save(Simulation simulation) {
		Connection connection = getConnection();
		PreparedStatement statement = null;
		try {
			String sql = "insert into Simulation (nom,nombrePasMax,vitesseExecution, cellule, nombreDeTours, grille) values (?,?,?,?,?,?)";
			statement = connection.prepareStatement(sql);
			statement.setString(1, simulation.getNom());
			statement.setInt(2, simulation.getNombrePasMax());
			statement.setInt(3, simulation.getVitesseExecution());
			statement.setString(4, simulation.getCellules());
			statement.setInt(5, simulation.getNombreDeTours());
			statement.setString(6, simulation.getGrille());
			
			System.out.println(sql);
			statement.executeUpdate();

//			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		finally{
			closeConnection(connection, statement);
		}
	}
	
	public List<Simulation> findAll() {
		List<Simulation> all = new ArrayList<>();
		Connection connection = getConnection();
		Statement statement=null;
		// TODO
		try {
			statement = connection.createStatement();
			ResultSet result = statement.executeQuery("select * from Simulation");
			while (result.next()) {
				all.add(buildSimulationFromRow(result));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		finally{
			closeConnection(connection, statement);
		}
		return all;
	}
	
	
	public Simulation findById(long id) {
		Connection connection = getConnection();
		Statement statement=null;
		try {
			statement = connection.createStatement();
			ResultSet result = statement.executeQuery("select * from Simulation where id = " + id);
			if (result.next()) {
				return buildSimulationFromRow(result);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		finally{
			closeConnection(connection, statement);
		}
		return null;
	}
	
	public void update (Simulation simulation, int id) {
		Connection connection = getConnection();
		PreparedStatement statement = null;
		try {
			String sql = "update Simulation set nom=?, nombrePasMax=?, vitesseExecution=?, cellule=?, nombreDeTours=?, grille=? where id ="+id;
			statement = connection.prepareStatement(sql);
			//((PreparedStatement) statement).setInt(1, superhero.getId());
			statement.setString(1, simulation.getNom());
			statement.setInt(2, simulation.getNombrePasMax());
			statement.setInt(3, simulation.getVitesseExecution());
			statement.setString(4, simulation.getCellules());
			statement.setInt(5, simulation.getNombreDeTours());
			statement.setString(6, simulation.getGrille());
			System.out.println(sql);
			statement.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		finally{
			closeConnection(connection, statement);
		}
	}
	
	
	private Simulation buildSimulationFromRow(ResultSet result) throws SQLException {

		return new Simulation(result.getInt(1), result.getString(2), result.getString(3),
				result.getInt(4), result.getInt(5), result.getString(6), result.getInt(7));
	}

}
