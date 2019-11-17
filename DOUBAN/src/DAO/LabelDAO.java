package DAO;

public interface LabelDAO 
{
	public void insertLabel(Label label);
	public void updateLabel(Label label);
	public void deleteLabel(String labelno);
	public Label getLabel(String labelno);
}
