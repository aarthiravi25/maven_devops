package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class OrderController {

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("/order")
    public String placeOrder(@ModelAttribute User user, Model model) {
        String message = "Order placed successfully done for Item: " 
                + user.getItemName() + ", Quantity: " 
                + user.getQuantity();

        model.addAttribute("message", message);
        return "index";
    }
}
