package com.gathergrid.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.sql.Date;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Date date;
    private Time hour;
    private String location;
    private String description;
    private Integer quantityVip;
    private Integer quantityStandard;
    @ManyToOne
    private Category category;
    @OneToMany
    private List<Comment> comments;
    @OneToMany
    private List<Ticket> tickets;
    @ManyToOne
    private User user;

    public Event() {
    }

    public Event(String name, Date date, Time hour, String location, String description, Integer quantityVip, Integer quantityStandard, Category category, List<Comment> comments, List<Ticket> tickets, User user) {
        this.name = name;
        this.date = date;
        this.hour = hour;
        this.location = location;
        this.description = description;
        this.quantityVip = quantityVip;
        this.quantityStandard = quantityStandard;
        this.category = category;
        this.comments = comments;
        this.tickets = tickets;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getHour() {
        return hour;
    }

    public void setHour(Time hour) {
        this.hour = hour;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantityVip() {
        return quantityVip;
    }

    public void setQuantityVip(Integer quantityVip) {
        this.quantityVip = quantityVip;
    }

    public Integer getQuantityStandard() {
        return quantityStandard;
    }

    public void setQuantityStandard(Integer quantityStandard) {
        this.quantityStandard = quantityStandard;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
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
        Event event = (Event) o;
        return Objects.equals(name, event.name) && Objects.equals(date, event.date) && Objects.equals(hour, event.hour) && Objects.equals(location, event.location) && Objects.equals(description, event.description) && Objects.equals(quantityVip, event.quantityVip) && Objects.equals(quantityStandard, event.quantityStandard) && Objects.equals(category, event.category) && Objects.equals(comments, event.comments) && Objects.equals(tickets, event.tickets) && Objects.equals(user, event.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date, hour, location, description, quantityVip, quantityStandard, category, comments, tickets, user);
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", hour=" + hour +
                ", location='" + location + '\'' +
                ", description='" + description + '\'' +
                ", quantityVip=" + quantityVip +
                ", quantityStandard=" + quantityStandard +
                ", category=" + category +
                ", comments=" + comments +
                ", tickets=" + tickets +
                ", user=" + user +
                '}';
    }
}
