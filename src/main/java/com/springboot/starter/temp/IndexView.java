package com.springboot.starter.temp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/common")
public class IndexView {

    @GetMapping("/pages/index")
    public String index() { return "common/pages/index"; }


}
