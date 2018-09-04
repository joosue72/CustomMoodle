/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.businesslogic;

import edu.salle.custommoodle.dataacess.StudentDAO;
import edu.salle.custommoodle.dataacess.imple.StudentDAOLisImple;
import edu.salle.custommoodle.model.Student;
import java.util.List;

/**
 *
 * @author Josue Romo
 */
public class StudentBLO {
    private StudentDAO studentDAO;

    public StudentBLO() {
        studentDAO = new StudentDAOLisImple();
    }
    
    public Student save(Student student)
    {
     return   studentDAO.save(student); 
    }
    
    public List<Student> findAll()
    {
        return studentDAO.findAll();
    }
    
    public Student find(String id)
    {
        return studentDAO.find(id);
    }
}
