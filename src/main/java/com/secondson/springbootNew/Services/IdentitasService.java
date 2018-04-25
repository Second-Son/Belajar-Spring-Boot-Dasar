package com.secondson.springbootNew.Services;

import com.secondson.springbootNew.Model.Identitas;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class IdentitasService {

    private List<Identitas> identitas = new ArrayList<>(Arrays.asList(
            new Identitas("1", "Yusuf", "Ujungberung", "Programmer"),
            new Identitas("2", "Haidi Ghufron", "Bandung", "Web Development")
    ));


    public List<Identitas> getAllIdentitas(){
        return identitas;
    }

//    ini service untuk mengambil list dari list array identitas di atas berdasarkan id
    public Identitas getIdentitas(String id){
        return identitas.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addIdentitas(Identitas identitass) {
        identitas.add(identitass);
    }

    public void updateIdentitas(String id, Identitas identitass) {
        for (int i = 0; i < identitas.size(); i++){
            Identitas iden = identitas.get(i);
            if (iden.getId().equals(id)){
                identitas.set(i, identitass);
                return;
            }
        }
    }

    public void deleteIdentitas(String id) {
        identitas.removeIf(t -> t.getId().equals(id));
    }
}
