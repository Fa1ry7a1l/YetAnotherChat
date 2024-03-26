package ru.sber.edu.yetanotherchat.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Chat {
    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany
    private Set<Message> messages;

    @ManyToMany
    private Set<User> members;

}
