package com.mvc.mvchotel.controller;

import com.mvc.mvchotel.dto.Countroom;
import com.mvc.mvchotel.dto.HotelForm;
import com.mvc.mvchotel.entity.Hotel;
import com.mvc.mvchotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HotelController {
    @Autowired
    HotelService hotelService;



    @GetMapping("/")
    public String Form(Model model){
        Hotel hotel = new Hotel();
        model.addAttribute("hotel",hotel);
        return "create";
    }

    @GetMapping("/answer")
    public String Answer(Model model){

        Countroom answercountNotreadyroom = hotelService.findCountNotReadyRoom();
        Countroom answercountreadyroom = hotelService.findCountReadyRoom();
        Countroom answercountPendingroom = hotelService.findCountPendingRoom();

        model.addAttribute("answercountready",answercountreadyroom.getCountReadyRoom());
        model.addAttribute("answercountpending",answercountPendingroom.getCountPedingRoom());
        model.addAttribute("answercountnotready",answercountNotreadyroom.getCountNotReadyRoom());

        List<HotelForm> answertablereadycount = hotelService.ridRoomisReady();

        model.addAttribute("answercount1",answertablereadycount);

        return "index";
    }

    @PostMapping("/save")
    public String Save(Model model ,@ModelAttribute("hotel") Hotel hotel){
        hotelService.saveAllRoom(hotel);
        return "redirect:/answer";
    }



}
