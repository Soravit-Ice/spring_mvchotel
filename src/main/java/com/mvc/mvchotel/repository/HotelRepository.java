package com.mvc.mvchotel.repository;

import com.mvc.mvchotel.dto.Countroom;
import com.mvc.mvchotel.dto.HotelForm;
import com.mvc.mvchotel.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HotelRepository extends JpaRepository<Hotel, String> {

    @Query(value = "SELECT new com.mvc.mvchotel.dto.Countroom(status,COUNT(status)) \n" +
            "FROM  Hotel \n" +
            "WHERE status = 'Ready' ")
    Countroom findCountReadyRoom();

    @Query(value = "SELECT new com.mvc.mvchotel.dto.Countroom(status,COUNT(status)) \n" +
            "FROM  Hotel \n" +
            "WHERE status = 'NotReady' ")
    Countroom findCountNotReadyRoom();

    @Query(value = "SELECT new com.mvc.mvchotel.dto.Countroom(status,COUNT(status)) \n" +
            "FROM  Hotel \n" +
            "WHERE status = 'Pending' ")
    Countroom findCountPendingReadyRoom();

    @Query(value = "SELECT new com.mvc.mvchotel.dto.HotelForm(rid,status,firstname,lastname)\n" +
            "FROM Hotel \n" +
            "WHERE status = 'Ready'\n")
    List<HotelForm> findCountAndRidRoom();
}
