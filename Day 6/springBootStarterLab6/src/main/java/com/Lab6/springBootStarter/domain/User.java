package com.labSix.springBootStarter.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class User {
    @Id
    long id;
    @Column(name = "Name")
    String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "User_Post")
    @Fetch(FetchMode.JOIN)
    List<Post> posts;
}
