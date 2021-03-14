package com.mvc.mvchotel.dto;

public class Countroom {
    private Long countRoom ;
    private Long countReadyRoom ;
    private Long countPedingRoom ;
    private Long countNotReadyRoom ;
    private String nameRoom ;

    public Countroom( String nameRoom , Long countRoom) {
        if(nameRoom.equals("Ready")){
            setCountReadyRoom(countRoom) ;
        }else if(nameRoom.equals("Pending")){
            setCountPedingRoom(countRoom);
        }else {
            setCountNotReadyRoom(countRoom); ;
        }
    }


    public Long getCountRoom() {
        return countRoom;
    }

    public void setCountRoom(Long countRoom) {
        this.countRoom = countRoom;
    }

    public Long getCountReadyRoom() {
        return countReadyRoom;
    }

    public void setCountReadyRoom(Long countReadyRoom) {
        this.countReadyRoom = countReadyRoom;
    }

    public Long getCountPedingRoom() {
        return countPedingRoom;
    }

    public void setCountPedingRoom(Long countPedingRoom) {
        this.countPedingRoom = countPedingRoom;
    }

    public Long getCountNotReadyRoom() {
        return countNotReadyRoom;
    }

    public void setCountNotReadyRoom(Long countNotReadyRoom) {
        this.countNotReadyRoom = countNotReadyRoom;
    }

    public String getNameRoom() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }
}
