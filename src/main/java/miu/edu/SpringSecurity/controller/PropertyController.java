package miu.edu.SpringSecurity.controller;



import lombok.RequiredArgsConstructor;
import miu.edu.SpringSecurity.exception.InvalidRequestException;
import miu.edu.SpringSecurity.model.Property;
import miu.edu.SpringSecurity.services.impl.PropertyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/properties")
@RequiredArgsConstructor
public class PropertyController {

    private final PropertyService propertyService;

    @GetMapping
    public List<Property> getAllProperties() {
        return propertyService.getAllProperties();
    }

    @GetMapping("/{id}")
    public Property getPropertyById(@PathVariable Long id) {
        return propertyService.getPropertyById(id);
    }

    @PostMapping
    public Property addProperty(@RequestBody Property property) {
        if (property.getAddress() == null || property.getAddress().isEmpty()) {
            throw new InvalidRequestException("Property address is required");
           }
        return propertyService.addProperty(property);
    }

    @PutMapping("/{id}")
    public Property updateProperty(@PathVariable Long id, @RequestBody Property property) {
        return propertyService.updateProperty(id, property);
    }

    @DeleteMapping("/{id}")
    public void deleteProperty(@PathVariable Long id) {
        propertyService.deleteProperty(id);
    }
}
