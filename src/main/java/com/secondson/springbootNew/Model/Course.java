package com.secondson.springbootNew.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course {

    @Id
    private String id;
    private String nama;
    private String deskripsi;
    @ManyToOne
    private Identitas identitas;
}
