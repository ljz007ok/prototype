package com.gupao.prototype.project;

public class ProjectServiceImpl implements ProjectService {

	public void update(ProjectVO projectVO) {
		try {
			ProjectDao dao = new ProjectDao();
			Project oldPo = dao.getById(projectVO.getId());
			Project newPo = oldPo.clone();
			newPo.setName(projectVO.getName());
			newPo.setCode(projectVO.getCode());			
			dao.update(newPo);
			
			//记录日志
			LogService logService = new LogService();
			logService.insertLog(oldPo, newPo);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
