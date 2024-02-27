package com.jobapplication.review;

import java.util.List;

public interface ReviewService {
    List<Review> getAllReview(Long companyId);
    boolean addReview(Long companyId, Review review);
    Review getReview(long companyId, Long reviewId);
    boolean updateReview(Long companyId, long reviewId, Review updatedReview);

    boolean deleteReview(Long companyId, long reviewId);
}
