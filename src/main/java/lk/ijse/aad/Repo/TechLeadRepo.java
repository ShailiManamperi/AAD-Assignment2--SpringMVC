package lk.ijse.aad.Repo;

import lk.ijse.aad.Entity.TechLead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TechLeadRepo extends JpaRepository<TechLead, String> {

    @Query("select t from TechLead t where t.techLeadId = ?1")
    TechLead findTechLead(String techLeadId);

}
