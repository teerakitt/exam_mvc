package com.vote.demo.controller;

import com.vote.demo.entity.Student;
import com.vote.demo.entity.Total;
import com.vote.demo.repository.StudentRepository;
import com.vote.demo.repository.TotalRepository;
import com.vote.demo.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class voteController {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    TotalRepository totalRepository;
    @Autowired
    VoteService voteService;


    @GetMapping("/")
    public String index(Model model){
        List<Total> data =totalRepository.getData();
        model.addAttribute("stu",data);
        return "index";
    }
    @GetMapping("/go/")
    public String pagecheck(ModelMap model, @RequestParam String answer){
        String[] vote = answer.split(",");
        List<Total> data =totalRepository.getData();
        for(int i=0;i<25;i++){
            data.get(i).setVote(Integer.parseInt(vote[i]));
            data.get(i).setScore(voteService.randomScore());
        }
        totalRepository.saveAll(data);
        model.addAttribute("stu",data);
        return  "test";
    }
}
