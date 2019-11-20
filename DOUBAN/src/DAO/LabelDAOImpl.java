package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LabelDAOImpl extends DAOBase implements LabelDAO	//评价标签 功能函数 实现
{
	//插入
	private static final String createsql="INSERT INTO LABEL VALUES(?,?,?,?)";
	public void insertLabel(Label label)
	{
		Connection conn=null;
		PreparedStatement pstm=null;
		try {
			conn=getConnection();
			pstm=conn.prepareStatement(createsql);
			
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
	
	//修改
	public void updateLabel(Label label)
	{
		
		deleteLabel(label.getLabelno());
		
		insertLabel(label);
	}
	
	//删除
	@SuppressWarnings("null")
	public void deleteLabel(int labelno)
	{
		Connection conn=null;
		PreparedStatement pstm=null;
		
		final String deletesql="DELETE FROM LABEL WHERE LABELNO=labelno";
		try {
			conn=getConnection();
			pstm=conn.prepareStatement(deletesql);
			
			pstm.executeUpdate();
			
			pstm.close();
			conn.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	//查询信息
	public Label getLabel(Label label)
	{
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet resultset;
		
		try {
			conn=getConnection();
			
			String searchsql="SELECT FROM LABEL WHERE LABELNO=?";
			pstm=conn.prepareStatement(searchsql);
			
			pstm.setInt(1, label.getLabelno());
			
			resultset=pstm.executeQuery();
		
			if(resultset.next())
			{
				Label label1=new Label();
				
				label1.setLabelno(resultset.getInt("LABElNO"));
				label1.setUno(resultset.getString("UNO"));
				label1.setMno(resultset.getString("MNO"));
				label1.setLabelcontent(resultset.getString("LABELCONTENT"));
				
				return label1;
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}