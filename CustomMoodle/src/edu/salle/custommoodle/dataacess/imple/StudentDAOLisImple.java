/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.dataacess.imple;

import edu.salle.custommoodle.dataacess.StudentDAO;
import edu.salle.custommoodle.model.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Josue Romo
 */
public class StudentDAOLisImple implements StudentDAO
{
  private static List<Student> studentList = new ArrayList<>();

    @Override
    public Student save(Student student) {
        String id = Integer.toString(studentList.size()+1);
        student.setId(id);
        studentList.add(student);
        return student;
    }

    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public Student find(String id) {
        for(Student student : studentList)
        {
            if(student.getId().equals(id))
            {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student findByLastName(String LastName) {
    
     LastName = LastName.toLowerCase().trim();
      Student res=null;
      for(Student student : studentList)
      {
          if(student.getLastName().toLowerCase().contains(LastName))
          {
              return student;
          }
          
      }
      return null;
    }

    @Override
    public void delete(Student student) {
       studentList.remove(student);
    }

    @Override
    public void update(Student student) {
        int pos = studentList.indexOf(student);//obteniendo la posicion en donde este el alumno
        studentList.set(pos,student);
    }
    
}
