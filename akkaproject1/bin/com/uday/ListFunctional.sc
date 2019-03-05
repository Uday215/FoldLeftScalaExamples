package com.uday

object ListFunctional {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  val x:List[Int]=List(1,2,3,4,5)                 //> x  : List[Int] = List(1, 2, 3, 4, 5)
  val y:List[Int]=List(6,7,8,9,10)                //> y  : List[Int] = List(6, 7, 8, 9, 10)
  

      
      
  //x.map{ ele=> y.map(el=>fun(ele,el))}
  
  
       
  def fun(ele:Int,el:Int)={
  ele*el
  }                                               //> fun: (ele: Int, el: Int)Int
}