package lk.ijse.aad.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Project {
    @Id
    private String projectId;
    private String projectName;
    private String projectDescription;
    private String projectDeadline;
    @ManyToOne
    private TechLead techLeadId;
}
