package org.cash.SpringSecurityWithJWT.project.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "users")
@Getter @Setter @ToString
@AllArgsConstructor @NoArgsConstructor
public class CreateUserEntity {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private UUID id;

    @Column(name = "doc_id")
    private String docId;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "user_roles", // New Table - For Roles
            joinColumns = @JoinColumn(name = "user_id")) // Foreign Key
    @Column(name = "role")
    private Set<String> roles;
}
