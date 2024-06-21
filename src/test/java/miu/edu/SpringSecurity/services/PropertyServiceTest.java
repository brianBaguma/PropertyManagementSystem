package miu.edu.SpringSecurity.services;

import miu.edu.SpringSecurity.model.Property;
import miu.edu.SpringSecurity.repository.PropertyRepository;
import miu.edu.SpringSecurity.services.impl.PropertyService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class PropertyServiceTest {

    @Mock
    private PropertyRepository propertyRepository;

    @InjectMocks
    private PropertyService propertyService;

    @Test
    public void testSaveProperty() {
        Property property = new Property();
        property.setAddress("123 Main St");
        property.setDescription("A beautiful house");
        property.setRentAmount(1200.00);

        when(propertyRepository.save(any(Property.class))).thenReturn(property);

        Property savedProperty = propertyService.addProperty(property);
        assertThat(savedProperty).isNotNull();
        assertThat(savedProperty.getAddress()).isEqualTo("123 Main St");
    }

    @Test
    public void testGetAllProperties() {
        Property property1 = new Property();
        property1.setAddress("123 Main St");
        property1.setDescription("A beautiful house");
        property1.setRentAmount(1200.00);

        Property property2 = new Property();
        property2.setAddress("456 Elm St");
        property2.setDescription("A lovely apartment");
        property2.setRentAmount(800.00);

        when(propertyRepository.findAll()).thenReturn(List.of(property1, property2));

        List<Property> properties = propertyService.getAllProperties();
        assertThat(properties).hasSize(2);
        assertThat(properties.get(0).getAddress()).isEqualTo("123 Main St");
        assertThat(properties.get(1).getAddress()).isEqualTo("456 Elm St");
    }
}

