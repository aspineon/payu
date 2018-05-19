package com.createam.payu.order.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Buyer {
  private String email;
  private String language;
}