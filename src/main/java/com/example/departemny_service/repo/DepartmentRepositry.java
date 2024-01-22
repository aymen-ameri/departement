package com.example.departemny_service.repo;

import com.example.departemny_service.entity.Departemnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepositry extends JpaRepository<Departemnt,Long> {


    Departemnt findByDepartmentId(Long departemtnid);
}
