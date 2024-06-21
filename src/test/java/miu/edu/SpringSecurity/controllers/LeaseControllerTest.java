//package miu.edu.SpringSecurity.controllers;
//import miu.edu.SpringSecurity.controller.LeaseController;
//import miu.edu.SpringSecurity.model.Lease;
//import miu.edu.SpringSecurity.services.impl.LeaseService;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.http.MediaType;
//import static org.mockito.BDDMockito.given;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//
//import java.time.LocalDate;
//import java.time.ZoneId;
//import java.util.Date;
//import java.util.List;
//
//@WebMvcTest(LeaseController.class)
//public class LeaseControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private LeaseService leaseService;
//
//    @Test
//    public void testGetAllLeases() throws Exception {
//        Lease lease1 = createLease(LocalDate.of(2023, 1, 1), LocalDate.of(2024, 1, 1));
//        Lease lease2 = createLease(LocalDate.of(2023, 6, 1), LocalDate.of(2024, 6, 1));
//
//        givenLeases(List.of(lease1, lease2));
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/leases")
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$[0].startDate").value("2023-01-01"))
//                .andExpect(jsonPath("$[1].startDate").value("2023-06-01"));
//    }
//
//    private Lease createLease(LocalDate startDate, LocalDate endDate) {
//        Lease lease = new Lease();
//        lease.setStartDate(Date.from(startDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
//        lease.setEndDate(Date.from(endDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
//        return lease;
//    }
//
//    private void givenLeases(List<Lease> leases) {
//        given(leaseService.getAllLeases()).willReturn(leases);
//    }
//}
//
