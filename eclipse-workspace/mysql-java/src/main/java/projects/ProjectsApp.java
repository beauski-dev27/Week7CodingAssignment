package projects;

import projects.dao.DbConnection;

/** 
 * @author Promineo
 * 
 */

public class ProjectsApp {

/**
 * 
 * @param args
 */
	
	public static void main(String[] args) {
		DbConnection.getConnection();
	}

}
