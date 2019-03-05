package com.uday

object Test extends App{
  
  val list1=List(1,2,3,4,5,6,7,8,9,10)
  
  
  //list1.foreach(println)
  
  //println(sum2(list1))
  
  //println(mul1(list1))
  
  
  println(count(list1))
  def sum(list1:List[Int])=list1.foldLeft(0)((x,y)=>x+y)
  
  def sum1(list1:List[Int])=list1.foldLeft(0)(_+_)
  
  def sum2(list1:List[Int])=list1.foldLeft(0)(sumfun)
  
  def mul(list1:List[Int])=list1.foldLeft(1)((x,y)=>x*y)
  
  def mul1(list1:List[Int])=list1.foldLeft(1)(_*_)
  
 // def count(list1:List[Int])=list1.foldLeft(0)((x,_)=>x+1)
  
   def count(list1:List[Int])=list1.foldLeft(0)(countfun)
   
   
  
  
   
   //def average(list1:List[Int])=list1.fo
  
 def countfun(x:Int,y:Int)={
    
    println(x+"------------"+(y+1))
    x+1
    
  }
  
  def sumfun(x:Int,y:Int)={
    
    
    println(x+"*********"+y)
    x+y
  }
  
  
  def average1(x:Int,y:Int)={
    
  }
}