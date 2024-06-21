package miu.edu.SpringSecurity.services.impl;


import miu.edu.SpringSecurity.exception.ResourceNotFoundException;
import miu.edu.SpringSecurity.model.Tenant;
import miu.edu.SpringSecurity.repository.TenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TenantService {

//
       @Autowired
      private TenantRepository tenantRepository;
//
        public List<Tenant> getAllTenants() {
            return tenantRepository.findAll();
     }


//
      public Tenant getTenantById(Long id) {
           return tenantRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Tenant not found with id " + id));
}


//
        public Tenant addTenant(Tenant tenant) {

                return tenantRepository.save(tenant);
        }
//
public Tenant updateTenant(Long id, Tenant tenant) {
    Tenant existingTenant = tenantRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Tenant not found with id " + id));
//    existingTenant.setName(tenant.getName());
//    existingTenant.setEmail(tenant.getEmail());
    return tenantRepository.save(existingTenant);
}

public void deleteTenant(Long id) {
       if (!tenantRepository.existsById(id)) {
        throw new ResourceNotFoundException("Tenant not found with id " + id);
          }
    tenantRepository.deleteById(id);
   }
}
