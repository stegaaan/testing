/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seamu
 */
import com.mycompany.assignment1.Student;
import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {

	@Test
	public void run() {
		
		Student james = new Student("james" ,"20", "9/10/1995","13556233"  );
		Student mary = new Student ("mary", "18"," 4/3/1993", "14147686" );
		if(james.getUsername().compareTo(james.getName()+james.getAge()) != 0  ){
			fail("wrong name");
		}
		if(mary.getUsername().compareTo(mary.getName()+mary.getAge()) != 0){
			fail("wrong name");
		}
	}
	
}