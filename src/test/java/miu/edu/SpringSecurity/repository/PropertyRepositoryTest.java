//package miu.edu.SpringSecurity.repository;
//import miu.edu.SpringSecurity.model.Property;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import static org.assertj.core.api.Assertions.assertThat;
//
//@DataJpaTest
//public class PropertyRepositoryTest {
//
//    @Autowired
//    private PropertyRepository propertyRepository;
//
//    @Test
//    public void testSaveProperty() {
//        Property property = new Property();
//        property.setAddress("123 Main St");
//        property.setDescription("A beautiful house");
//        property.setRentAmount(1200.00);
//
//        Property savedProperty = propertyRepository.save(property);
//        assertThat(savedProperty).isNotNull();
//        assertThat(savedProperty.getId()).isNotNull();
//    }
//
//    @Test
//    public void testFindPropertyById() {
//        Property property = new Property();
//        property.setAddress("123 Main St");
//        property.setDescription("A beautiful house");
//        property.setRentAmount(1200.00);
//        propertyRepository.save(property);
//
//        Property foundProperty = propertyRepository.findById(property.getId()).orElse(null);
//        assertThat(foundProperty).isNotNull();
//        assertThat(foundProperty.getAddress()).isEqualTo("123 Main St");
//    }
//}
//
