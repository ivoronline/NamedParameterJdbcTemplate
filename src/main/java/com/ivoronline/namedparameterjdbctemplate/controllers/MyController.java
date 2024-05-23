package com.ivoronline.namedparameterjdbctemplate.controllers;

import com.ivoronline.namedparameterjdbctemplate.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired private MyService myService;

  //=========================================================================================================
  // INSERT
  //=========================================================================================================
  @ResponseBody
  @GetMapping("/insert")
  public int insert() {
    int    id = myService.insert("Jill", 40);
    return id;
  }

}

