package org.moussaud.micropets.pets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.function.Predicate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AIPetsSummary {

    static private String CONTEXT = "aipets";

    @JsonProperty(value = "Total")
    int total = 0;

    @JsonProperty(value = "Hostname")
    String hostname;

    @JsonProperty(value = "Pets")
    List<AIPet> pets = new ArrayList<>();

    private boolean filter = true;

    public void addPet(String name, String type, Integer age, String url) {
        this.hostname = getHostname();
        total = total + 1;
        var aipet = new AIPet(null, name, type, age, url, this.hostname,
                String.format("/%s/v1/data/%d", CONTEXT, total));
     
        pets.add(aipet);
    }

    public void addPet(AIPet aipet) {
        this.hostname = getHostname();
        pets.add(aipet);
        total = total + 1;
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
        return "AIPetsSummary [hostname=" + hostname + ", pets=" + pets + ", total=" + total + "]";
    }

    public AIPetsSummary filter() {
        Collections.shuffle(this.pets);
        if (filter) {
            final Random random = new Random();
            final int number = random.nextInt(pets.size());
            this.pets.removeIf(new Predicate<AIPet>() {
                @Override
                public boolean test(AIPet pet) {
                    return pet.index() > number+1;
                }
            });
            this.total = pets.size();
        }
        return this;
    }

    public void clear() {
        this.total = 0;
        pets.clear();
    }

}
