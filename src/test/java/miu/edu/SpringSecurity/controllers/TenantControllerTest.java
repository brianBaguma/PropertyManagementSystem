//package miu.edu.SpringSecurity.controllers;
//
//import miu.edu.SpringSecurity.controller.TenantController;
//import miu.edu.SpringSecurity.model.Tenant;
//import miu.edu.SpringSecurity.services.impl.TenantService;
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
//import java.util.List;
//
//@WebMvcTest(TenantController.class)
//public class TenantControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private TenantService tenantService;
//
//    @Test
//    public void testGetAllTenants() throws Exception {
//        Tenant tenant1 = new Tenant();
//        tenant1.setName("John Doe");
//        tenant1.setEmail("john.doe@example.com");
//
//        Tenant tenant2 = new Tenant();
//        tenant2.setName("Jane Smith");
//        tenant2.setEmail("jane.smith@example.com");
//
//        given(tenantService.getAllTenants()).willReturn(List.of(tenant1, tenant2));
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/tenants")
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$[0].name").value("John Doe"))
//                .andExpect(jsonPath("$[1].name").value("Jane Smith"));
//    }
//}
//
