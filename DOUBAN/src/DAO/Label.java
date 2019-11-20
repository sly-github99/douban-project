package DAO;

public class Label 	//评价标签实体属性
{
	private int LABELNO;
	private String UNO;
	private String MNO;
	private String LABELCONTENT;
	
	
	
	public int getLabelno() 
	{
		return LABELNO;
	}
	public void setLabelno(int LABELNO)
	{
		this.LABELNO=LABELNO;
	}
	
	public String getUno()
	{
		return UNO;
	}
	public void setUno(String UNO)
	{
		this.UNO=UNO;
	}
	
	public String getMno()
	{
		return MNO;
	}
	public void setMno(String MNO)
	{
		this.MNO=MNO;
	}
	
	public String getLabelcontent() 
	{
		return LABELCONTENT;
	}
	public void setLabelcontent(String LABELCONTENT)
	{
		this.LABELCONTENT=LABELCONTENT;
	}
}
