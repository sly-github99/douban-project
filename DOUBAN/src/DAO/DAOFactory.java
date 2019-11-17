package DAO;

public class DAOFactory 
{
	private static DAOFactory instance;
	
	static
	{
		instance=new DAOFactory();
	}
	
	private DAOFactory()
	{
		
	}
	
	public static DAOFactory getInstance()
	{
		return instance;
	}
	
	public static LabelDAO getLabelDAO()
	{
		LabelDAO labelDAO=new LabelDAOImpl();
		return labelDAO;
	}
	
}
