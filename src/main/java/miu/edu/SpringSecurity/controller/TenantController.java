package miu.edu.SpringSecurity.controller;

import miu.edu.SpringSecurity.exception.InvalidRequestException;
import miu.edu.SpringSecurity.model.Tenant;
import miu.edu.SpringSecurity.services.impl.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tenants")
public class TenantController {
    @Autowired
    private TenantService tenantService;

    @GetMapping
    public List<Tenant> getAllTenants() {
        return tenantService.getAllTenants();
    }

    @GetMapping("/{id}")
    public Tenant getTenantById(@PathVariable Long id) {
        return tenantService.getTenantById(id);
    }

    @PostMapping
    public Tenant addTenant(@RequestBody Tenant tenant) {
        if (tenant.getName() == null || tenant.getName().isEmpty()) {
            throw new InvalidRequestException("Tenant name is required");
        }
        return tenantService.addTenant(tenant);
    }

    @PutMapping("/{id}")
    public Tenant updateTenant(@PathVariable Long id, @RequestBody Tenant tenant) {
        return tenantService.updateTenant(id, tenant);
    }
//
    @DeleteMapping("/{id}")
    public void deleteTenant(@PathVariable Long id) {
        tenantService.deleteTenant(id);
    }
}
