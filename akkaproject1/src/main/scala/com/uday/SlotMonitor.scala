package com.uday

import akka.actor.Actor

class SlotMonitor extends Actor{
  
  override def receive={
    
    
    case message if message.isInstanceOf[ParkingMessage] && message.asInstanceOf[ParkingMessage].msg == "Alot Parking Spot"
    => sender ! ParkingLotManagement.findParkingSlot


    case ticket if ticket.isInstanceOf[Ticket] => sender ! ParkingLotManagement.freeSlot(ticket.asInstanceOf[Ticket].ticketNo - 1)
  }
  
}