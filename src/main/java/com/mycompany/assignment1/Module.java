/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment1;

/**
 *
 * @author seamu
 */
import java.util.ArrayList;


public class Module {

	String Module;
	String ID;
	ArrayList<Student> students = new ArrayList<Student>();
	
	
	public Module(String MoDule,String id ) {
		// TODO Auto-generated constructor stub
		Module = MoDule;
		ID = id;

	}
	
	public void addStudent(Student a){
		
		students.add(a);
	}
	
	public String getName(){
		return Module;
	}
	
	public void studentlist(){
		for(int x = 0; x < students.size();x++){
			System.out.println("---" + students.get(x).getUsername());
		}
	}

}
