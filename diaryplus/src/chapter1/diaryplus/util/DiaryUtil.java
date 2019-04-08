package chapter1.diaryplus.util;

import chapter1.diary.bean.Diary;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class DiaryUtil {

	/**
	��*��java�Ŀ����л��Ķ���(ʵ��Serializable�ӿ�)���л����浽XML�ļ�����,�����һ�α����������л��������ü��Ͻ��з�װ
	��*����ʱ���������ڵĶ���ԭ����XML�ļ�����
	��*@paramobjҪ���л��Ŀ����л��Ķ���
	��*@paramfileName����ȫ�ı���·�����ļ���
	��*@throwsFileNotFoundExceptionָ��λ�õ��ļ�������
	��*@throwsIOException���ʱ�����쳣
	��*@throwsException��������ʱ�쳣
	��*/
	public static void diaryToXml(ArrayList<Diary> diaries)
    throws FileNotFoundException, IOException
 {
		//��������ļ�
		File fo=new File("e:\\diaries.xml");
		//�ļ�������,�ʹ������ļ�
		if(!fo.exists())
		{
			//�ȴ����ļ���Ŀ¼
	        fo.createNewFile();
		
		}
		//�����ļ������
		FileOutputStream fos=new FileOutputStream(fo);
	//����XML�ļ����������ʵ��
	XMLEncoder encoder=new XMLEncoder(fos);
      //�������л������XML�ļ�
	encoder.writeObject(diaries);
	encoder.flush();
	//�ر����л�����
        encoder.close();
	//�ر������
	fos.close();
	}
	
	/**
	��*��ȡ��objSourceָ����XML�ļ��е����л�����Ķ���,���صĽ��������List��װ
	��*@paramobjSource��ȫ���ļ�·�����ļ�ȫ��
	��*@return��XML�ļ����汣��Ķ��󹹳ɵ�List�б�(������һ�����߶�������л�����Ķ���)
	��*@throwsFileNotFoundExceptionָ���Ķ����ȡ��Դ������
	��*@throwsIOException��ȡ��������
	��*@throwsException��������ʱ�쳣����
	��*/
	public static ArrayList<Diary> xmlToDiary()
    throws FileNotFoundException, IOException
{
		ArrayList objList=new ArrayList();
		File fin=new File("e:\\diaries.xml");
		FileInputStream fis=new FileInputStream(fin);
       XMLDecoder decoder=new XMLDecoder(fis);
       Object obj=null;
       try
       {
    	   while((obj=decoder.readObject())!=null)
    	   {
    		   objList.add(obj);
    		   }
    	   }
       catch(Exception e)
       {
      }
       fis.close();
       decoder.close();
       System.out.println(objList.size());
       return objList;
	}
	
	}
