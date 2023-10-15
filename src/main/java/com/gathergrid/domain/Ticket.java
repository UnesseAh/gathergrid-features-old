package com.gathergrid.domain;

import com.gathergrid.domain.enums.TicketCategory;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double price;
    private TicketCategory ticketCategory;
    @ManyToOne
    private User user;

    public Ticket() {
    }

    public Ticket(Long id, Double price, TicketCategory ticketCategory, User user) {
        this.id = id;
        this.price = price;
        this.ticketCategory = ticketCategory;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public TicketCategory getTicketCategory() {
        return ticketCategory;
    }

    public void setTicketCategory(TicketCategory ticketCategory) {
        this.ticketCategory = ticketCategory;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(price, ticket.price) && ticketCategory == ticket.ticketCategory && Objects.equals(user, ticket.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, ticketCategory, user);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", price=" + price +
                ", ticketCategory=" + ticketCategory +
                ", user=" + user +
                '}';
    }
}
