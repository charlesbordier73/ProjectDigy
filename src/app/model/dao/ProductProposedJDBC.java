package app.model.dao;
import app.model.*;
import app.model.Product;

/**
 * Class in charge of linking the model to the database.
 * No database provide for the moment.
 * @author shui
 *
 */
public class ProductProposedJDBC extends Product {
	public ProductProposedJDBC(String label, String description, ProductCategory category) throws Exception{
		super(label, description, category);
		// TODO Changer le constructeur pour renvoyer un élément dans la DB.
	}

	/**
	 * save a new proposition of product - seller side
	 * @throws Exception 
	 */
	public void addProductProposed(String label, String description, ProductCategory category) throws Exception{
		JdbcConnection connection = JdbcConnection.getInstance();
	    connection.openConnection();
		String proposeProduct = "INSERT INTO ProductProposed VALUES('"+ label +"','"+ description +"','"+ category+"')";
		connection.executeRequest(proposeProduct);
		connection.close();
	}
	
	/**
	 * delete a proposition of product when it's valid or refused - admin side
	 * @throws Exception 
	 */
	public void deleteProductProposed(String label, String description, ProductCategory category) throws Exception{
		JdbcConnection connection = JdbcConnection.getInstance();
	    connection.openConnection();
		String deleteProductProposed = "DELETE FROM ProductProposed WHERE label = '"+ label +"'AND description = '"+ description +"'AND category = '"+ category+"')";
		connection.executeRequest(deleteProductProposed);
		connection.close();
	}
}
