package com.secondson.springbootNew.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Identitas {

    private String id;
    private String nama;
    private String alamat;
    private String deskripsi;
}
