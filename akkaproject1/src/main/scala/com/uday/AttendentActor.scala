package com.uday

import akka.actor.Actor
import akka.util.Timeout
import scala.concurrent.Await
import scala.concurrent.duration._
import akka.pattern.ask

class AttendentActor extends Actor{
  
  implicit val timeOut=Timeout(1000 seconds)
  
  
  override def receive={
     case message if message.isInstanceOf[ParkingMessage] && message.asInstanceOf[ParkingMessage].msg == "I Need Parking"
    
     => {
      
      val res = Await.result((ParkingLotManagement.slotMonitor ? ParkingMessage("Alot Parking Spot")).mapTo[Int], 5.seconds)
      if (res == -1) println("Sorry Sir Parking Is Full Please Try Later")
      else {
        ParkingLotManagement.assignParkingSlot(res)
        println("your car is parked at : " + (res + 1))
      }
    }
      case ticket if ticket.isInstanceOf[Ticket]
    => {
      val res =Await.result((ParkingLotManagement.slotMonitor ? ticket).mapTo[Int], 5.seconds)
      println("Slot : " + res + " Is Now Free Thanks For Parking .....")
    }
  }
}