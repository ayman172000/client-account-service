package com.example.clientaccountmicroservice.DTO.request;

import lombok.Data;

@Data
public class CompteCourantReq {
    private Long clientId;
    private double balance;
    private double overDraft;
}
