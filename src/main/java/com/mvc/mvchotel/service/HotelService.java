package com.mvc.mvchotel.service;

import com.mvc.mvchotel.dto.Countroom;
import com.mvc.mvchotel.dto.HotelForm;
import com.mvc.mvchotel.entity.Hotel;
import com.mvc.mvchotel.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {

    @Autowired
    HotelRepository hotelRepository ;


    public Countroom findCountReadyRoom(){
        Countroom countReadyRoom = hotelRepository.findCountReadyRoom();
        return countReadyRoom;
    }

    public Countroom findCountNotReadyRoom(){
        Countroom countNotReadyRoom = hotelRepository.findCountNotReadyRoom();
        return countNotReadyRoom;
    }

    public Countroom findCountPendingRoom(){
        Countroom countPedingReadyRoom = hotelRepository.findCountPendingReadyRoom();
        return countPedingReadyRoom;
    }

    public void  saveAllRoom(Hotel hotel){
        hotelRepository.save(hotel);
    }

    public List<HotelForm> ridRoomisReady(){
        List<HotelForm> listridRoomisReady = hotelRepository.findCountAndRidRoom();
        return listridRoomisReady;
    }
}
