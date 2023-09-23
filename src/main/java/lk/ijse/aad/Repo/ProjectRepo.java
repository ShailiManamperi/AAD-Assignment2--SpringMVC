package lk.ijse.aad.Repo;

import lk.ijse.aad.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<Project, String> {
}
