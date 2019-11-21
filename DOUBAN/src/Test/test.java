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
			
			insertLabel(label1);
			
			break;
		case 2:
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
