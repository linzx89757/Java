package chapter1.diaryplus.util;

import java.util.ArrayList;

import chapter1.diary.bean.Diary;

public interface IDiaryManager
{
    // �����ռ��ļ�
    // �������ɹ��򷵻�true, ����ʧ���򷵻�false
    public abstract boolean save(ArrayList<Diary> diaries);

    // ��ȡ������ռ��ļ�
    // ����ռ��ļ������Ҷ�ȡ�ɹ�, �����ռ��б�
    // ����ռ��ļ������ڻ��ȡʧ�ܣ����ؿ�
public abstract ArrayList<Diary> load();


}
