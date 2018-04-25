package com.secondson.springbootNew.Services;

import com.secondson.springbootNew.Model.Identitas;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class IdentitasService {

    private List<Identitas> identitas =  Arrays.asList(
            new Identitas("1", "Yusuf", "Ujungberung", "Programmer"),
				new Identitas("2", "Haidi Ghufron", "Bandung", "Web Development")
		);


    public List<Identitas> getAllIdentitas(){
        return identitas;
    }
}
