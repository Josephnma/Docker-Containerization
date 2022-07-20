package com.blogapp.blogapp.service;


import javax.servlet.http.HttpSession;

public interface LikeService {
//    LikesDto createLike(LikesDto likesDto,Long postId,Long personId);
    void unLike(long likeId);
    String createLike(Long postId, Long personId, HttpSession session);
}
