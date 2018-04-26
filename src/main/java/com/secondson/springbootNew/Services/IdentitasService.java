package com.secondson.springbootNew.Services;

import com.secondson.springbootNew.Model.Identitas;
import com.secondson.springbootNew.Repository.IdentitasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IdentitasService {

    @Autowired
    private IdentitasRepository identitasRepository;

    public List<Identitas> getAllIdentitas(){
        List<Identitas> identitas = new ArrayList<>();
        identitasRepository.findAll().forEach(identitas::add);
        return identitas;
    }

    public Identitas getIdentitas(String id){
       return identitasRepository.findOne(id);
    }

    public void addIdentitas(Identitas identitass) {
        identitasRepository.save(identitass);
    }

    public void updateIdentitas(Identitas identitass) {
        identitasRepository.save(identitass);
    }

    public void deleteIdentitas(String id) {
        identitasRepository.delete(id);
    }
}
