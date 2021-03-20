package com.vote.demo.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class VoteService {
    public int randomScore(){
        Random ran = new Random();
        int score = ran.nextInt(100);
        return score;
    }
    public void saveData(){

    }
}
