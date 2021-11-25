package com.mycompany.myapp.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mycompany.myapp.domain.enumeration.BillingMethod;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Order.
 */
@Entity
@Table(name = "jhi_order")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "sum")
    private Double sum;

    @Column(name = "delivey_adress")
    private String deliveyAdress;

    @Column(name = "delivery_date_time")
    private ZonedDateTime deliveryDateTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "billing_method")
    private BillingMethod billingMethod;

    @ManyToMany
    @JoinTable(
        name = "rel_jhi_order__products",
        joinColumns = @JoinColumn(name = "jhi_order_id"),
        inverseJoinColumns = @JoinColumn(name = "products_id")
    )
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    @JsonIgnoreProperties(value = { "model", "orders" }, allowSetters = true)
    private Set<Product> products = new HashSet<>();

    @ManyToOne
    @JsonIgnoreProperties(value = { "connection", "orders" }, allowSetters = true)
    private Client client;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Order id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getSum() {
        return this.sum;
    }

    public Order sum(Double sum) {
        this.setSum(sum);
        return this;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public String getDeliveyAdress() {
        return this.deliveyAdress;
    }

    public Order deliveyAdress(String deliveyAdress) {
        this.setDeliveyAdress(deliveyAdress);
        return this;
    }

    public void setDeliveyAdress(String deliveyAdress) {
        this.deliveyAdress = deliveyAdress;
    }

    public ZonedDateTime getDeliveryDateTime() {
        return this.deliveryDateTime;
    }

    public Order deliveryDateTime(ZonedDateTime deliveryDateTime) {
        this.setDeliveryDateTime(deliveryDateTime);
        return this;
    }

    public void setDeliveryDateTime(ZonedDateTime deliveryDateTime) {
        this.deliveryDateTime = deliveryDateTime;
    }

    public BillingMethod getBillingMethod() {
        return this.billingMethod;
    }

    public Order billingMethod(BillingMethod billingMethod) {
        this.setBillingMethod(billingMethod);
        return this;
    }

    public void setBillingMethod(BillingMethod billingMethod) {
        this.billingMethod = billingMethod;
    }

    public Set<Product> getProducts() {
        return this.products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public Order products(Set<Product> products) {
        this.setProducts(products);
        return this;
    }

    public Order addProducts(Product product) {
        this.products.add(product);
        product.getOrders().add(this);
        return this;
    }

    public Order removeProducts(Product product) {
        this.products.remove(product);
        product.getOrders().remove(this);
        return this;
    }

    public Client getClient() {
        return this.client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Order client(Client client) {
        this.setClient(client);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Order)) {
            return false;
        }
        return id != null && id.equals(((Order) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Order{" +
            "id=" + getId() +
            ", sum=" + getSum() +
            ", deliveyAdress='" + getDeliveyAdress() + "'" +
            ", deliveryDateTime='" + getDeliveryDateTime() + "'" +
            ", billingMethod='" + getBillingMethod() + "'" +
            "}";
    }
}
