package DAO;

public interface LabelDAO 	//���۱�ǩ ���ܺ��� �ӿ�
{
	public void insertLabel(Label label);
	public void updateLabel(Label label);
	public void deleteLabel(int labelno);
	public Label getLabel(Label label);
}
