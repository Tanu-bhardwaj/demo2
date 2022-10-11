package com.example.demo.Controller;

import com.example.demo.Model.tableEntity;
import com.example.demo.repo.testrepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

  @Autowired
  testrepo testrepo;


  @GetMapping("/")
  public List<tableEntity> getTest() {
    List<tableEntity> list = testrepo.findAll();
    return list;
  }
}
