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

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;



public class Programme {

	String Name;
	ArrayList<Module> modules = new ArrayList<Module>();
	DateTime startdate;
	DateTime enddate;
	
	
	
	public Programme(String name, String SD, String ED) {

		Name = name;

		startdate = DateTime.parse(SD, DateTimeFormat.forPattern("dd/MM/yyyy"));
		enddate = DateTime.parse(ED, DateTimeFormat.forPattern("dd/MM/yyyy"));
		
	}
	
	public void addModule(Module a){
		modules.add(a);
	}
	
	public void printProgramme(){
		
		System.out.println(Name + ", " + startdate.toString(DateTimeFormat.forPattern("dd/MM/yyyy")) + " - " + 
		enddate.toString(DateTimeFormat.forPattern("dd/MM/yyyy")));
		for(int x = 0; x< modules.size(); x++){
			System.out.println("-" + modules.get(x).getName());
			modules.get(x).studentlist();
		}
		
	}
	
	public String getName(){
		return Name;
	}

}