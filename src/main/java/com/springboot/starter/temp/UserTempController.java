package com.springboot.starter.temp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserTempController {
    @GetMapping("/pages/index")
    public String adminIndex() {
        return "users/pages/index";
    }

    // Menu 1
    @GetMapping("/pages/menu1/submenu-1")
    public String menu1_1() { return "users/pages/menu1/submenu-1"; }


    @GetMapping("/pages/menu1/submenu-2")
    public String menu1_2() { return "users/pages/menu1/submenu-2"; }

    @GetMapping("/pages/menu1/submenu-3")
    public String menu1_3() { return "users/pages/menu1/submenu-3"; }

    @GetMapping("/pages/menu1/submenu-4")
    public String menu1_4() { return "users/pages/menu1/submenu-4"; }

    // Menu 2
    @GetMapping("/pages/menu2/submenu-1")
    public String menu2_1() { return "users/pages/menu2/submenu-1"; }

    @GetMapping("/pages/menu2/submenu-2")
    public String menu2_2() { return "users/pages/menu2/submenu-2"; }

    @GetMapping("/pages/menu2/submenu-3")
    public String menu2_3() { return "users/pages/menu2/submenu-3"; }

    @GetMapping("/pages/menu2/submenu-4")
    public String menu2_4() { return "users/pages/menu2/submenu-4"; }

    // Menu 3
    @GetMapping("/pages/menu3/submenu-1")
    public String menu3_1() { return "users/pages/menu3/submenu-1"; }

    @GetMapping("/pages/menu3/submenu-2")
    public String menu3_2() { return "users/pages/menu3/submenu-2"; }

    @GetMapping("/pages/menu3/submenu-3")
    public String menu3_3() { return "users/pages/menu3/submenu-3"; }

    @GetMapping("/pages/menu3/submenu-4")
    public String menu3_4() { return "users/pages/menu3/submenu-4"; }

    // Menu 4
    @GetMapping("/pages/menu4/submenu-1")
    public String menu4_1() { return "users/pages/menu4/submenu-1"; }

    @GetMapping("/pages/menu4/submenu-2")
    public String menu4_2() { return "users/pages/menu4/submenu-2"; }

    @GetMapping("/pages/menu4/submenu-3")
    public String menu4_3() { return "users/pages/menu4/submenu-3"; }

    @GetMapping("/pages/menu4/submenu-4")
    public String menu4_4() { return "users/pages/menu4/submenu-4"; }

}