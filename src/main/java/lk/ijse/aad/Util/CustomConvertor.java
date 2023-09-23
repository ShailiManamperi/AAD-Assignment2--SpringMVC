package lk.ijse.aad.Util;


import lk.ijse.aad.Dto.ProjectDTO;
import lk.ijse.aad.Entity.Project;

public class CustomConvertor {
    public static ProjectDTO toProjectsDTO(Project project){
        return new ProjectDTO(project.getProjectId(),project.getProjectName(),project.getProjectDescription(),project.getProjectDeadline(),project.getTechLeadId().getTechLeadId());
    }
}
