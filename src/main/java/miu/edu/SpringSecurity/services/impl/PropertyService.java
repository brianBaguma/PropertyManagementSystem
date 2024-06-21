package miu.edu.SpringSecurity.services.impl;

import lombok.RequiredArgsConstructor;
import miu.edu.SpringSecurity.exception.ResourceNotFoundException;
import miu.edu.SpringSecurity.model.Property;
import miu.edu.SpringSecurity.repository.PropertyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PropertyService {

  private final PropertyRepository propertyRepository;

  public List<Property> getAllProperties() {
        return propertyRepository.findAll();
    }


public Property getPropertyById(Long id) {
    return propertyRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Property not found with id " + id));
}


//
    public Property addProperty(Property property) {
        return propertyRepository.save(property);
    }


//
public Property updateProperty(Long id, Property property) {
    Property existingProperty = propertyRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Property not found with id " + id));
//    existingProperty.setAddress(property.getAddress());
//    existingProperty.setDescription(property.getDescription());
//    existingProperty.setRentAmount(property.getRentAmount());
    return propertyRepository.save(existingProperty);
}


//
public void deleteProperty(Long id) {
    if (!propertyRepository.existsById(id)) {
        throw new ResourceNotFoundException("Property not found with id " + id);
    }
    propertyRepository.deleteById(id);
}


}
