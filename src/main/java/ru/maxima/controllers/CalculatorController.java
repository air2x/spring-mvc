package ru.maxima.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/calculator")
    public String calculate(@RequestParam("firstNum") String firstNum,
                           @RequestParam("symbol") String symbol,
                           @RequestParam("secondNum") String secondNum,
                           Model model) {
        double firstNumDub = Double.parseDouble(firstNum);
        double secondNumDub = Double.parseDouble(secondNum);
        double result = 0;
        if ("plus".equals(symbol)) {
            result = firstNumDub + secondNumDub;
        } else if ("minus".equals(symbol)) {
            result = firstNumDub - secondNumDub;
        } else if("delit".equals(symbol)) {
            result = firstNumDub / secondNumDub;
        } else if("umnoj".equals(symbol)) {
            result = firstNumDub * secondNumDub;
        }

        model.addAttribute("message", "Result = " + result);

        return "calculator";
    }
}
