package com.secondson.springbootNew.Repository;

import com.secondson.springbootNew.Model.Identitas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IdentitasRepository extends PagingAndSortingRepository<Identitas, String> {
    // getAllIdentitas()
    // getIdentitas(String id)
    // updateIdentitas(Identitas identitas)
    // deleteIdentitas(String id)

}
