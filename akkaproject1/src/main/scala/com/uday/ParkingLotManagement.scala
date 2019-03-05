package com.uday

import akka.actor.ActorSystem
import akka.actor.Props
import scala.collection.mutable.ListBuffer

object ParkingLotManagement  extends App{
  
  val parkingSystem = ActorSystem("ParkingLot")
  val attendant = parkingSystem.actorOf(Props[AttendentActor], "Attendant")
  val slotMonitor = parkingSystem.actorOf(Props[SlotMonitor], "SlotMonitor")
 
  
  val parkingSlots = ListBuffer(false, false, false, false, false)
  
   attendant ! ParkingMessage("I Need Parking")

    attendant ! ParkingMessage("I Need Parking")

    attendant ! ParkingMessage("I Need Parking")

    attendant ! ParkingMessage("I Need Parking")

    attendant ! ParkingMessage("I Need Parking")

    attendant ! ParkingMessage("I Need Parking")

    attendant ! ParkingMessage("I Need Parking")
    attendant ! Ticket(2)

    attendant ! ParkingMessage("I Need Parking")

    attendant ! ParkingMessage("I Need Parking")

    attendant ! Ticket(3)

    attendant ! Ticket(4)

    attendant ! ParkingMessage("I Need Parking")

    attendant ! ParkingMessage("I Need Parking")

    attendant ! ParkingMessage("I Need Parking")

 def findParkingSlot: Int = {

    parkingSlots.indexOf(false)
  }

  def assignParkingSlot(slot: Int): Unit = {

    parkingSlots(slot) = true
  }

  def freeSlot(slot: Int): Int = {

    parkingSlots(slot) = false
    slot + 1
  }
}