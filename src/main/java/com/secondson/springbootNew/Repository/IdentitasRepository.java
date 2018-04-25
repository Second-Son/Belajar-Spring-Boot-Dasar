package com.secondson.springbootNew.Repository;

import com.secondson.springbootNew.Model.Identitas;
import org.springframework.data.repository.CrudRepository;

public interface IdentitasRepository extends CrudRepository<Identitas, String> {
    // getAllIdentitas()
    // getIdentitas(String id)
    // updateIdentitas(Identitas identitas)
    // deleteIdentitas(String id)

}
