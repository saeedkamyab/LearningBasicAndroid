package com.example.learningandroidfrombase

import android.graphics.Color


class Oop {
    fun main() {
val car1:Car=Car()
        car1.Brand="BMW"
        car1.Color="Black"
        car1.Price=250000
    }
    val car2:Car2=Car2("black",BrandNames.BENEZ,10000)

}

//Inheritance
open class Vehicle(var Brand:BrandNames, var Color:String, var Price:Int)
{
    lateinit var OwnerName:String
    fun Start(){
        println("Started")
    }
}
class MotorCycle(brand:BrandNames,color: String,price:Int):Vehicle(brand,color,price){

}

//======================================
class Car{
    var Color:String?=null
    var Brand:String?=null
    var Price:Int?=null
fun Start(){
    println("Started")
}
}
/*class Car2(var Color:String, var Brand:String, var Price:Int){
    lateinit var OwnerName:String //lateinit :when you defined your var with this label it means the variable dose not exist until you use it in your instance
    fun Start(){
        println("Started")
    }
}*/
class Car2(var Color:String, var Brand:BrandNames, var Price:Int){
    lateinit var OwnerName:String //lateinit :when you defined your var with this label it means the variable dose not exist until you use it in your instance
    fun Start(){
        println("Started")
    }
}