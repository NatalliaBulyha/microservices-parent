package com.cozyhome.onlineshop.reviewservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ReviewRequest {
    private String id;
    private byte rating;
    private String comment;
    private String customerId;
    private String productSkuCode;
}
