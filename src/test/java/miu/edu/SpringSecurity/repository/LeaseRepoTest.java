//package miu.edu.SpringSecurity.repository;
//import miu.edu.SpringSecurity.model.Lease;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import static org.assertj.core.api.Assertions.assertThat;
//
//import java.time.LocalDate;
//import java.util.Date;
//
//@DataJpaTest
//public class LeaseRepoTest {
//    @Autowired
//    private LeaseRepository leaseRepository;
//
//    private final Date startDate = java.sql.Date.valueOf(LocalDate.of(2023, 1, 1));
//    private final Date endDate = java.sql.Date.valueOf(LocalDate.of(2024, 1, 1));
//
//    private Lease setupLease() {
//        Lease lease = new Lease();
//        lease.setStartDate(startDate);
//        lease.setEndDate(endDate);
//        return lease;
//    }
//
//    @Test
//    public void testSaveLease() {
//        Lease lease = setupLease();
//        Lease savedLease = leaseRepository.save(lease);
//        assertThat(savedLease).isNotNull();
//        assertThat(savedLease.getId()).isNotNull();
//    }
//
//    @Test
//    public void testFindLeaseById() {
//        Lease lease = setupLease();
//        leaseRepository.save(lease);
//        Lease foundLease = leaseRepository.findById(lease.getId()).orElse(null);
//        assertThat(foundLease).isNotNull();
//        assertThat(foundLease.getStartDate()).isEqualTo(startDate);
//    }
//}
