package com.example.learningandroidfrombase

fun main(){

    //Exceptions
val array= arrayOf(3,true,4.0)
try{
    for(i in array.indices){
        println("current vale: ${array[i]},next value:${array[i+1]}")
    }
}catch (error:ArrayIndexOutOfBoundsException){
println("We got an error")
}
//----------------------------------


    //Lambda and Extension Methods
    val sum={
            x:Double,y:Double->x+y
    }
    val a:Double=3.0
    a.isPrime()
    a.isPrime()

    divide(10)
    println(sum(30.0,20.0))
//---------------------------------------------
}




//Lambda and Extension Methods
fun divide(number:Int)=number%2==0;
fun Double.isPrime():Boolean{
    for(i in 2 until this .toInt()){
        if(this.toInt()%i==0){
            return  false
        }
    }
    return true;
}
//---------------------------------------------