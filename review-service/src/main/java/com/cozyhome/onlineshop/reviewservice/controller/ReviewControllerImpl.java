package com.cozyhome.onlineshop.reviewservice.controller;

import com.cozyhome.onlineshop.reviewservice.dto.ReviewRequest;
import com.cozyhome.onlineshop.reviewservice.dto.ReviewResponse;
import com.cozyhome.onlineshop.reviewservice.model.Review;
import com.cozyhome.onlineshop.reviewservice.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("${api.basePath}/review")
public class ReviewControllerImpl {

    private final ReviewService reviewService;

    @GetMapping
    public ResponseEntity<List<ReviewResponse>> getReviews() {
        return new ResponseEntity<>(reviewService.getReviews(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ReviewResponse> saveReview(@RequestBody ReviewRequest review) {
        return new ResponseEntity<>(reviewService.saveReview(review), HttpStatus.CREATED);
    }
}
