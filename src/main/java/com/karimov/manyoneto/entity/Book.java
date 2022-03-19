package com.karimov.manyoneto.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "book")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "book_sec")
    @SequenceGenerator(name = "book_sec", sequenceName = "book_sec", allocationSize = 1)
    private Long id;

    @Column(name = "book_name")
    private String bookName;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "author_id")
    private Author author;

    @Column(name = "book_size")
    private int bookSize;

    @Column(name = "book_date")
    private Date bookDate;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    @Column(name = "book_description")
    private String bookDescription;

    @OneToMany(mappedBy = "book")
    private List<Comment> comment;
}
