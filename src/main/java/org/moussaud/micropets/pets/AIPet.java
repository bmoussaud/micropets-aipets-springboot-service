package org.moussaud.micropets.pets;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

public record AIPet(

                @Id @JsonProperty(value = "Index") Integer index,

                @JsonProperty(value = "Name") String name,

                @JsonProperty(value = "Kind") String type,

                @JsonProperty(value = "Age") Integer age,

                @JsonProperty(value = "URL") String url,

                @JsonProperty(value = "Hostname") String hostname,

                @JsonProperty(value = "URI") String uri) {

}
