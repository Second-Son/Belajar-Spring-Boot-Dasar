package com.secondson.springbootNew.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Identitas {

    @Id
    private String id;
    private String nama;
    private String alamat;
    private String deskripsi;
}
