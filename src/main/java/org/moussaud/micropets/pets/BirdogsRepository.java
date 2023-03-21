package org.moussaud.micropets.pets;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class BirdogsRepository {

    public List<Birdogs> findAll() {
        return new ArrayList<Birdogs>();
    }

    public Birdogs findById(long index) {
        return findAll().get((int) index);
    }

}
