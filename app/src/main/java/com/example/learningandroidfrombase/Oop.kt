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

val player1=Player(2)
val player2=Player("Ali")
val player3=Player<String>("Ali2")
}
//Generics
class Player<T>(input:T){
init{//there is an init in each class and it runs when you make an instance of a class
    println(input.toString())
}
}

//interfaces
class ssk:IInter{

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