package miu.edu.SpringSecurity.controller;
import miu.edu.SpringSecurity.services.impl.PropertyService;
import miu.edu.SpringSecurity.services.impl.TenantService;
import miu.edu.SpringSecurity.services.impl.LeaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class ViewController {

    @Autowired
    private PropertyService propertyService;

    @Autowired
    private TenantService tenantService;

    @Autowired
    private LeaseService leaseService;

    @GetMapping("/properties")
    public String properties(Model model) {
        model.addAttribute("properties", propertyService.getAllProperties());
        return "properties";
    }

    @GetMapping("/tenants")
    public String tenants(Model model) {
        model.addAttribute("tenants", tenantService.getAllTenants());
        return "tenants";
    }

    @GetMapping("/leases")
    public String leases(Model model) {
        model.addAttribute("leases", leaseService.getAllLeases());
        return "leases";
    }
}

