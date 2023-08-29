package com.angel_angelov.board_games_site.data.supplier;

import com.angel_angelov.board_games_site.data.product_suppliers.ProductSuppliers;
import com.angel_angelov.board_games_site.data.contact_info.ContactInfo;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "suppliers")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToOne(mappedBy = "suppliers", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private ContactInfo contactInfo;

    @OneToMany(mappedBy = "suppliers", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<ProductSuppliers> productSuppliers = new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Set<ProductSuppliers> getProductSuppliers() {
        return productSuppliers;
    }

    public void setProductSuppliers(Set<ProductSuppliers> productSuppliers) {
        this.productSuppliers = productSuppliers;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contactInfo=" + contactInfo +
                ", productSuppliers=" + productSuppliers +
                '}';
    }
}
