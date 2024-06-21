package miu.edu.SpringSecurity.controller;

import miu.edu.SpringSecurity.exception.InvalidRequestException;
import miu.edu.SpringSecurity.model.Lease;
import miu.edu.SpringSecurity.services.impl.LeaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leases")
public class LeaseController {
    @Autowired
    private LeaseService leaseService;

    @GetMapping
    public List<Lease> getAllLeases() {
        return leaseService.getAllLeases();
    }

    @PostMapping
    public Lease addLease(@RequestBody Lease lease) {
        if (lease.getProperty() == null || lease.getTenant() == null) {
            throw new InvalidRequestException("Lease must have a property and a tenant");
        }
        return leaseService.addLease(lease);
    }

  @GetMapping("/{id}")
    public Lease getLeaseById(@PathVariable Long id) {
        return leaseService.getLeaseById(id);
    }

//    @PostMapping
//    public Lease addLease(@RequestBody Lease lease) {
//        return leaseService.addLease(lease);
//    }

    @PutMapping("/{id}")
    public Lease updateLease(@PathVariable Long id, @RequestBody Lease lease) {
        return leaseService.updateLease(id, lease);
    }
//
    @DeleteMapping("/{id}")
    public void deleteLease(@PathVariable Long id) {
        leaseService.deleteLease(id);
    }
}
