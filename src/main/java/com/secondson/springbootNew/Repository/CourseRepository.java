package com.secondson.springbootNew.Repository;

import com.secondson.springbootNew.Model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CourseRepository extends PagingAndSortingRepository<Course, String> {

    public List<Course> findByIdentitasId(String identitasId);
    // getAllIdentitas()
    // getIdentitas(String id)
    // updateIdentitas(Identitas identitas)
    // deleteIdentitas(String id)

}
