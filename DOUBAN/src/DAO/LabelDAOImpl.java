package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class LabelDAOImpl extends DAOBase implements LabelDAO
{
	private static final String CREATE_STUDENT_SQL="INSERT INTO LABEL VALUES(?,?,?,?)";
	public void insertLabel(Label label)
	{
		Connection conn=null;
		PreparedStatement pstm=null;
		try {
			conn=getConnection();
			pstm=conn.prepareStatement(CREATE_STUDENT_SQL);
			
			pstm.setInt(1,label.getLabelno());
			pstm.setString(2, label.getUno());
			pstm.setString(3, label.getMno());
			pstm.setString(4, label.getLabelcontent());
			
			pstm.executeUpdate();
			
			pstm.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static final String updatesql="UPDATE LABEL SET(?,?,?,?) WHERE(?,?,?,?)";
	public void updateLabel(Label label)
	{
		Connection conn=null;
		PreparedStatement pstm=null;
		try {
			conn=getConnection();
			pstm=conn.prepareStatement(updatesql);
			
			pstm.setInt(1, x);
		}
		
	}
	
	public void deleteLabel(String labelno)
	{
		Connection conn=null;
		PreparedStatement pstm=null;
		
		try {
			conn=getConnection();
			String deletesql="DELETE FROM LABEL WHERE LABELNO='+labelno'";
			pstm.executeUpdate(deletesql);
			
			pstm.close();
			conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Label getLabel(String labelno)
	{
		return null;
	}
}
