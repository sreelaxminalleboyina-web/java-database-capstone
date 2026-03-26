package com.project.back_end.mvc;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.project.back_end.services.CommonService;

@Controller
public class DashboardController {

    // 2. Autowire the Shared Service
    @Autowired
    private CommonService commonService;

    // 3. Admin Dashboard Method
    @GetMapping("/adminDashboard/{token}")
    public String adminDashboard(@PathVariable("token") String token) {

        // Validate token for admin role
        String validationResult = commonService.validateToken(token, "admin");

        // If valid → go to admin dashboard
        if (validationResult == null || validationResult.isEmpty()) {
            return "admin/adminDashboard";
        }

        // If invalid → redirect to home/login page
        return "redirect:/";
    }

    // 4. Doctor Dashboard Method
    @GetMapping("/doctorDashboard/{token}")
    public String doctorDashboard(@PathVariable("token") String token) {

        // Validate token for doctor role
        String validationResult = commonService.validateToken(token, "doctor");

        // If valid → go to doctor dashboard
        if (validationResult == null || validationResult.isEmpty()) {
            return "doctor/doctorDashboard";
        }

        // If invalid → redirect to home/login page
        return "redirect:/";
    }
}
