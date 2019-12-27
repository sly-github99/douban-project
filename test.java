package Test;
import DAO.*;
import java.io.*;
import java.util.*;

public class test 
{
	public static void main(String[] args) 
	{
		System.out.println("请输入要进行的业务：");
		System.out.println("1.插入标签");
		System.out.println("2.修改标签");
		System.out.println("3.删除标签");
		System.out.println("4.查询标签");
		
		Scanner read=new Scanner(System.in);
		
		int num=read.nextInt();
		
		switch(num)
		{
		case 1:
			Label label1=new Label();
			
			System.out.println("请依次输入标签ID，用户ID，电影ID，标签内容：");
			int LABELNO = read.nextInt();
			String UNO=read.nextLine();
			String MNO=read.nextLine();
			String LABELCONTENT=read.nextLine();
			
			label1.setLabelno(LABELNO);
			label1.setUno(UNO);
			label1.setMno(MNO);
			label1.setLabelcontent(LABELCONTENT);
			
			DAOFactory.getLabelDAO().insertLabel(label1);
			
			break;
		case 2:
			
			System.out.println("请输入要修改的标签ID：");
			int labelno1=read.nextInt();
			DAOFactory.getLabelDAO().deleteLabel( labelno1);
			
			Label label2=new Label();
			
			System.out.println("请依次输入标签ID，用户ID，电影ID，标签内容：");
			int LABELNO2 = read.nextInt();
			String UNO2=read.nextLine();
			String MNO2=read.nextLine();
			String LABELCONTENT2=read.nextLine();
			
			label2.setLabelno(LABELNO2);
			label2.setUno(UNO2);
			label2.setMno(MNO2);
			label2.setLabelcontent(LABELCONTENT2);
			
			DAOFactory.getLabelDAO().insertLabel(label2);
			
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			System.out.println("输入错误！");
			break;
		}
	}

}
