package lk.ijse.aad.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProjectDTO implements Serializable,SuperDto {
    private String projectId;
    private String projectName;
    private String projectDescription;
    private String projectDeadline;
    private String techLeadId;
}