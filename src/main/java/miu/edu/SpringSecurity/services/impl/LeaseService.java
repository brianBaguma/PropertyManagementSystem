package miu.edu.SpringSecurity.services.impl;

//package miu.edu.SpringSecurity.lease;

import miu.edu.SpringSecurity.exception.ResourceNotFoundException;
import miu.edu.SpringSecurity.model.Lease;
import miu.edu.SpringSecurity.repository.LeaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaseService {

    @Autowired
    private LeaseRepository leaseRepository;

    public List<Lease> getAllLeases() {
        return leaseRepository.findAll();
    }
//
     public Lease getLeaseById(Long id) {
        return leaseRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Lease not found with id " + id));
    }
//
    public Lease addLease(Lease lease) {
        return leaseRepository.save(lease);
    }
//
public Lease updateLease(Long id, Lease lease) {
        Lease existingLease = leaseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Lease not found with id " + id));
//        existingLease.setProperty(lease.getProperty());
//        existingLease.setTenant(lease.getTenant());
//        existingLease.setStartDate(lease.getStartDate());
//        existingLease.setEndDate(lease.getEndDate());
        return leaseRepository.save(existingLease);
    }
//
      public void deleteLease(Long id) {
        if (!leaseRepository.existsById(id)) {
            throw new ResourceNotFoundException("Lease not found with id " + id);
        }
        leaseRepository.deleteById(id);
    }


}
