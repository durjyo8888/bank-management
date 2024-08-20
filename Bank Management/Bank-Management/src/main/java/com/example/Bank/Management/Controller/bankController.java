package com.example.Bank.Management.Controller;


import com.example.Bank.Management.Model.Branch;
import com.example.Bank.Management.Model.Service;
import com.example.Bank.Management.Repository.branchRepository;
import com.example.Bank.Management.Repository.serviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class bankController {
    @Autowired
    private branchRepository branchRepository;

    @Autowired
    private serviceRepository serviceRepository;

    @GetMapping("/branches")
    public String getBranches(Model model){
        model.addAttribute("bankName", "State Bank of India");

        List<Branch> branches = branchRepository.findAll();
        model.addAttribute("branches", branches);
        return "branches";
    }

    @GetMapping("/services")
    public String getServices(Model model){
        model.addAttribute("bankName", "State Bank of India");

        List<Service> services = serviceRepository.findAll();
        model.addAttribute("services", services);
        return "services";
    }
}
