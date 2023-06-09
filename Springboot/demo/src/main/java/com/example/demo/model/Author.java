package com.example.demo.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long authorId;
    private String name;
    private String email;

//    @OneToMany(targetEntity = Book.class, fetch = FetchType.LAZY,
//    cascade = CascadeType.ALL)
//    private List<Book> books;

}
