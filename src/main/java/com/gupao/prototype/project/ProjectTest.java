package com.gupao.prototype.project;

public class ProjectTest {

	public static void main(String[] args) {
		ProjectVO projectVO = new ProjectVO();
		ProjectService projectService = new ProjectServiceImpl();
		projectService.update(projectVO);
	}

}
