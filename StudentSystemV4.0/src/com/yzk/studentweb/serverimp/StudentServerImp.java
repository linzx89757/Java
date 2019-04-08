package com.yzk.studentweb.serverimp;

import java.io.File;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yzk.studentweb.dao.StudentDao;
import com.yzk.studentweb.impldao.StudentDaoImp;
import com.yzk.studentweb.model.Student;
import com.yzk.studentweb.server.StudentServet;

public class StudentServerImp implements StudentServet {
	StudentDao dao = new StudentDaoImp();

	@Override
	public boolean addStudent(Student student) {

		if (dao.studentchek(student.getName())) {
			return false;
		} else {
			dao.addStudent(student);
			return true;
		}
	}

	@Override
	public void deleteStudent(String name, String path) {
		dao.deleteStudent(name, path);
	}

	@Override
	public Student selectStudentByName(String name) {
		Student studnet = dao.selectStudentByName(name);
		return studnet;
	}

	@Override
	public ArrayList<Student> selectAllStudent() {
		ArrayList<Student> lists = dao.selectAllStudent();
		return lists;
	}

	@Override
	public void updateStudent(Student student, String name) {
		dao.updateStudent(student, name);
	}

	@Override
	public boolean studentchek(String name) {
		return dao.studentchek(name);
	}

	public Student getFile(HttpServletRequest request,
			HttpServletResponse response) {
		return null;

	}

	@Override
	public String selectStudentImg(String name) {
		return dao.selectStudentImg(name);
	}

	@Override
	public void deletefile(String path, String name) {
		dao.deleteFile(path, name);
	}

	@Override
	public void uploadFile(String filename, File file, String path) {
		dao.uploadFile(filename, path, file);
	}

}
