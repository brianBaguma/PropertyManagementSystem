//package miu.edu.SpringSecurity.controllers;
//
//
//
//import miu.edu.SpringSecurity.controller.PropertyController;
//import miu.edu.SpringSecurity.model.Property;
//import miu.edu.SpringSecurity.services.impl.PropertyService;
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
//import java.util.List;
//
//@WebMvcTest(PropertyController.class)
//public class PropertyControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private PropertyService propertyService;
//
//    @Test
//    public void testGetAllProperties() throws Exception {
//        Property property1 = new Property();
//        property1.setAddress("123 Main St");
//        property1.setDescription("A beautiful house");
//        property1.setRentAmount(1200.00);
//
//        Property property2 = new Property();
//        property2.setAddress("456 Elm St");
//        property2.setDescription("A lovely apartment");
//        property2.setRentAmount(800.00);
//
//        given(propertyService.getAllProperties()).willReturn(List.of(property1, property2));
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/properties")
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$[0].address").value("123 Main St"))
//                .andExpect(jsonPath("$[1].address").value("456 Elm St"));
//    }
//}
//
