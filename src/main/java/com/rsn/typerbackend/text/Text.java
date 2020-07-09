package com.rsn.typerbackend.text;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "text")
@Data
public class Text {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "quote")
    private String quote;

    @Column(name = "source")
    private String source;

    @Column(name = "language_code")
    private String languageCode;
}
