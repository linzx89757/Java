package service;

import java.util.List;
import domain.Classes;



public interface IClassesService {
		//添加一条发布信息到数据库
		public void addClasses(Classes classes);
		//获取所有信息列表
		public List<Classes> getAllClasses();
}
