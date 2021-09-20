package com.example.labSix.domain1;

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
    @Column(name = "Name")
    String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "USER_POSTS")
    @Fetch(FetchMode.JOIN)

    List<Post> posts;

}
