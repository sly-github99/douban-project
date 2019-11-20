package DAO;

public interface LabelDAO 	//评价标签 功能函数 接口
{
	public void insertLabel(Label label);
	public void updateLabel(Label label);
	public void deleteLabel(int labelno);
	public Label getLabel(Label label);
}
