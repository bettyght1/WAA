package com.example.lab.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER")
public class User {
    @Id
    long id;
    @Column(name = "First_Name")
    private String firstName;

    @Column(name = "Last_Name")
    private String lastName;

    private String username;

    private String password;

    private boolean active;

    @ManyToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    @JoinTable(name = "User_Role")
    private List<Role> roles;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "USER_POSTS")
    @Fetch(FetchMode.JOIN)

    List<Post> posts;

}
