package miu.edu.SpringSecurity.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Lease {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Property property;

    @ManyToOne
    private Tenant tenant;
    private Date startDate;
    private Date endDate;

    public Lease(Property property, Tenant tenant, Date startDate, Date endDate) {
        this.property = property;
        this.tenant = tenant;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void setEndDate(int i, int i1, int i2) {
        
    }

    public void setStartDate(int i, int i1, int i2) {
    }
}
