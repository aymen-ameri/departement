package com.example.departemny_service.service;

import com.example.departemny_service.entity.Departemnt;
import com.example.departemny_service.repo.DepartmentRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartemntService {
    @Autowired
    private DepartmentRepositry     departmentRepositry;

    public Departemnt saveDepartemnt(Departemnt departemnt) {
      return   departmentRepositry.save(departemnt);
    }

    public Departemnt finddepartmentbyid(Long departemtnid) {
       return departmentRepositry.findByDepartmentId(departemtnid);
    }
}
