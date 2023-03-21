package org.moussaud.micropets.pets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.function.Predicate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BirdogsSummary {

    @JsonProperty(value = "Total")
    int total = 0;

    @JsonProperty(value = "Hostname")
    String hostname;

    @JsonProperty(value = "Pets")
    List<Birdogs> pets = new ArrayList<>();

    public void addBirdogs(Birdogs Birdogs) {
        pets.add(Birdogs);
        total = total + 1;
        this.hostname = getHostname();
        Birdogs.hostname = this.hostname;
        Birdogs.uri = String.format("/birdogss/v1/data/%d", Birdogs.index);
    }

    private String getHostname() {
        try {
            return InetAddress.getLocalHost().toString();
        } catch (UnknownHostException e) {
            return "Unknown";
        }
    }

    @Override
    public String toString() {
        return "BirdogsSummary [hostname=" + hostname + ", pets=" + pets + ", total=" + total + "]";
    }

    public BirdogsSummary filter() {
        Collections.shuffle(this.pets);
        Random random = new Random();
        int number = random.nextInt(pets.size());
        this.pets.removeIf(new Predicate<Birdogs>() {
            @Override
            public boolean test(Birdogs Birdogs) {
                return Birdogs.index > number;
            }
        });
        this.total = pets.size();
        return this;
    }

}
