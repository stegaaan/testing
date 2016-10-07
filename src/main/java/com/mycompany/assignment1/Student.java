
package com.mycompany.assignment1;

/**
 *
 * @author seamu
 */
public class Student {

	String Name;
	String age;
	String DOB;
	String ID;
	String username;
	
	
	
	public Student(String name, String ag, String dob, String id){ 
		
		Name = name;
		age = ag;
		DOB = dob;
		ID = id;
		username();
	}

	public void username(){
		
		this.username = this.Name + this.age; 
		
	}
	
	public String getUsername(){
		return this.username;
	}
        
        public String getName(){
            return Name;
        }
        
        public String getAge(){
            return age;
        }

}