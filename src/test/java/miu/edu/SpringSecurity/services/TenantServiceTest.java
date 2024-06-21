package miu.edu.SpringSecurity.services;

import miu.edu.SpringSecurity.model.Tenant;
import miu.edu.SpringSecurity.repository.TenantRepository;
import miu.edu.SpringSecurity.services.impl.TenantService;
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
public class TenantServiceTest {

    @Mock
    private TenantRepository tenantRepository;

    @InjectMocks
    private TenantService tenantService;

    @Test
    public void testSaveTenant() {
        Tenant tenant = new Tenant();
        tenant.setName("John Doe");
        tenant.setEmail("john.doe@example.com");

        when(tenantRepository.save(any(Tenant.class))).thenReturn(tenant);

        Tenant savedTenant = tenantService.addTenant(tenant);
        assertThat(savedTenant).isNotNull();
        assertThat(savedTenant.getName()).isEqualTo("John Doe");
    }

    @Test
    public void testGetAllTenants() {
        Tenant tenant1 = new Tenant();
        tenant1.setName("John Doe");
        tenant1.setEmail("john.doe@example.com");

        Tenant tenant2 = new Tenant();
        tenant2.setName("Jane Smith");
        tenant2.setEmail("jane.smith@example.com");

        when(tenantRepository.findAll()).thenReturn(List.of(tenant1, tenant2));

        List<Tenant> tenants = tenantService.getAllTenants();
        assertThat(tenants).hasSize(2);
        assertThat(tenants.get(0).getName()).isEqualTo("John Doe");
        assertThat(tenants.get(1).getName()).isEqualTo("Jane Smith");
    }
}

