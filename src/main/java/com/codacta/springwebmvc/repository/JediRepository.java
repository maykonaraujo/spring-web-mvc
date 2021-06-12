package com.codacta.springwebmvc.repository;

import com.codacta.springwebmvc.model.Jedi;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JediRepository {
    private List<Jedi> jedi = new ArrayList<>();
    public List<Jedi> getAllJedi(){
        return this.jedi;

    }

    public void add(Jedi jedi) {
        this.jedi.add(jedi);
    }
}
