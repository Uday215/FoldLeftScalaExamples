package com.uday

object ListFunctional {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(85); 
  println("Welcome to the Scala worksheet");$skip(40); 
  
  
  val x:List[Int]=List(1,2,3,4,5);System.out.println("""x  : List[Int] = """ + $show(x ));$skip(35); 
  val y:List[Int]=List(6,7,8,9,10);System.out.println("""y  : List[Int] = """ + $show(y ));$skip(114); 
  

      
      
  //x.map{ ele=> y.map(el=>fun(ele,el))}
  
  
       
  def fun(ele:Int,el:Int)={
  ele*el
  };System.out.println("""fun: (ele: Int, el: Int)Int""")}
}
