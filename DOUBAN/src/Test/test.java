package Test;
import DAO.*;
import java.io.*;
import java.util.*;

public class test 
{
	public static void main(String[] args) 
	{
		System.out.println("������Ҫ���е�ҵ��");
		System.out.println("1.�����ǩ");
		System.out.println("2.�޸ı�ǩ");
		System.out.println("3.ɾ����ǩ");
		System.out.println("4.��ѯ��ǩ");
		
		Scanner read=new Scanner(System.in);
		
		int num=read.nextInt();
		
		switch(num)
		{
		case 1:
			
			Label label1=new Label();
			
			System.out.println("�����������ǩID���û�ID����ӰID����ǩ���ݣ�");
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
			System.out.println("�������");
			break;
		}
	}

}
