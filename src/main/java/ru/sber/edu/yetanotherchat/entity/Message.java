package ru.sber.edu.yetanotherchat.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.sql.Time;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Message {
    @Id
    private Long id;

    @ManyToOne
    private User author;

    @Column(nullable = false)
    private String text;

    @Column(nullable = false)
    private Time timeCreated;

    @ManyToOne
    private Chat chat;
}
