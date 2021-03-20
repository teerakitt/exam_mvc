package com.vote.demo.repository;

import com.vote.demo.entity.Total;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TotalRepository extends JpaRepository<Total,Integer> {
    @Query(value = "select student.id stu_Id, subject.id sub_id ,0 score,0 vote FROM student right outer join subject ",nativeQuery = true)
    List<Total>  getData();
}
