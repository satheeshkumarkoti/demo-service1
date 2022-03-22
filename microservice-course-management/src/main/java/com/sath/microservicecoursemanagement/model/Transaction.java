package com.sath.microservicecoursemanagement.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name ="course", referencedColumnName = "id")
    private Course course;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "dateOfIssue")
    private LocalDateTime dateOfIssue;
}
