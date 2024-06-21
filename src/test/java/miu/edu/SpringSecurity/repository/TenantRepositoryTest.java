//package miu.edu.SpringSecurity.repository;
//
//
//
//import miu.edu.SpringSecurity.model.Tenant;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import static org.assertj.core.api.Assertions.assertThat;
//
//@DataJpaTest
//public class TenantRepositoryTest {
//
//    @Autowired
//    private TenantRepository tenantRepository;
//
//    @Test
//    public void testSaveTenant() {
//        Tenant tenant = new Tenant();
//        tenant.setName("John Doe");
//        tenant.setEmail("john.doe@example.com");
//
//        Tenant savedTenant = tenantRepository.save(tenant);
//        assertThat(savedTenant).isNotNull();
//        assertThat(savedTenant.getId()).isNotNull();
//    }
//
//    @Test
//    public void testFindTenantById() {
//        Tenant tenant = new Tenant();
//        tenant.setName("John Doe");
//        tenant.setEmail("john.doe@example.com");
//        tenantRepository.save(tenant);
//
//        Tenant foundTenant = tenantRepository.findById(tenant.getId()).orElse(null);
//        assertThat(foundTenant).isNotNull();
//        assertThat(foundTenant.getName()).isEqualTo("John Doe");
//    }
//}
//
