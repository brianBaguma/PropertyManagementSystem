//package miu.edu.SpringSecurity.services;
//
//import miu.edu.SpringSecurity.model.Lease;
//import miu.edu.SpringSecurity.repository.LeaseRepository;
//import miu.edu.SpringSecurity.services.impl.LeaseService;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//import org.junit.jupiter.api.extension.ExtendWith;
//
//import java.time.LocalDate;
//import java.util.Date;
//import java.util.List;
//
//@ExtendWith(MockitoExtension.class)
//public class LeaseServiceTest {
//    @Mock
//    private LeaseRepository leaseRepository;
//    @InjectMocks
//    private LeaseService leaseService;
//
//    @Test
//    public void testSaveLease() {
//        Lease leaseFor2023 = createLease(LocalDate.of(2023, 1, 1), LocalDate.of(2024, 1, 1));
//        when(leaseRepository.save(any(Lease.class))).thenReturn(leaseFor2023);
//        Lease savedLease = leaseService.addLease(leaseFor2023);
//        assertThat(savedLease).isNotNull();
//        assertThat(savedLease.getStartDate()).isEqualTo(LocalDate.of(2023, 1, 1));
//    }
//
//    @Test
//    public void testGetAllLeases() {
//        Lease leaseFor2023 = createLease(LocalDate.of(2023, 1, 1), LocalDate.of(2024, 1, 1));
//        Lease leaseFor2024 = createLease(LocalDate.of(2023, 6, 1), LocalDate.of(2024, 6, 1));
//        when(leaseRepository.findAll()).thenReturn(List.of(leaseFor2023, leaseFor2024));
//        List<Lease> leases = leaseService.getAllLeases();
//        assertThat(leases).hasSize(2);
//        assertThat(leases.get(0).getStartDate()).isEqualTo(LocalDate.of(2023, 1, 1));
//        assertThat(leases.get(1).getStartDate()).isEqualTo(LocalDate.of(2023, 6, 1));
//    }
//
//    private Lease createLease(LocalDate startDate, LocalDate endDate) {
//        Lease lease = new Lease();
//        lease.setStartDate(2024,1,1);
//        lease.setEndDate(2023 ,1,1 );
//
////        lease.getStartDate();
////        lease.getEndDate();
////        lease.setStartDate();
////        lease.setEndDate();
//        return lease;
//    }
//}
