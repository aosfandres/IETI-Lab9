package eci.ieti.data.model;

import java.sql.Date;

import org.springframework.data.annotation.Id;

public class Todo {

    @Id
    private Long id;

    private String description;
    private int priority;
    private Date dueDate;
    private String responsible;
    private String status;

    public Todo(String description, int priority, java.util.Date date, String responsible, String status) {
        this.description = description;
        this.priority = priority;
        this.dueDate = (Date) date;
        this.responsible = responsible;
        this.status = status;
    }

    public Todo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Todo{" + "id=" + id + ", description='" + description + '\'' + ", priority=" + priority + ", dueDate="
                + dueDate + ", responsible='" + responsible + '\'' + ", status='" + status + '\'' + '}';
    }
}
