package com.techmaster.mini_project.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
    int id;
    @JsonProperty("Name")
    String Name;
    @JsonProperty("Description")
    String Description;
    @JsonProperty("Thumbnail")
    String Thumbnail;
    @JsonProperty("Price")
    int Price;
    @JsonProperty("Rating")
    double Rating;
    @JsonProperty("PriceDiscount")
    int PriceDiscount;
}
