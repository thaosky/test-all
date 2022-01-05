package com.example.demo.controller;

import com.example.demo.dto.EmailModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/email")
    public String hello(Model model) {
        // Tạo ra thông tin
        EmailModel emailModel = new EmailModel("Thảo",
                "Hihi",
                "12345",
                "Mua nhà",
                "1234",
                "USD",
                "ThaoNp",
                "aaaaaaaaaaaaaaaaaa",
                "Lỗi nên trả lại");

        // Đưa thông tin vào Model
        model.addAttribute("emailModel", emailModel);

        // TRả về template profile.html
        return "BH1";
    }

}

