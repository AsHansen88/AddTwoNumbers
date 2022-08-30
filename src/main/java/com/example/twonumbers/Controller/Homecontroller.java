package com.example.twonumbers.Controller;


import com.example.twonumbers.Model.DTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class Homecontroller {
  @GetMapping("/")
  public String home(){

    return "Home/index";
  }

  @GetMapping("/calculate")

  public String Calculate(@ModelAttribute DTO data, Model model){

    String value_1= data.getValue_1();
    String value_2=data.getValue_2();
    double convert=Double.parseDouble(value_1)+Double.parseDouble(value_2);

    model.addAttribute("result", 19);

    return "home/calculate";
  }

}
