package miu.edu.SpringSecurity.repository;

import miu.edu.SpringSecurity.model.Lease;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaseRepository extends JpaRepository<Lease, Long> {
}
