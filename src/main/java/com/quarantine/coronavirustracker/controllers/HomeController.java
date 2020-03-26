package com.quarantine.coronavirustracker.controllers;

import com.quarantine.coronavirustracker.CoronavirusTrackerApplication;
import com.quarantine.coronavirustracker.dataservice.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("locationStats",coronaVirusDataService.getAllStats());
        return "home";
    }
}