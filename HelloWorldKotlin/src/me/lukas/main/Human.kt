package me.lukas.main

class Human(firstName: String, lastName: String, yearOfBirth: Int, male: Boolean) {
	
	val fullName = "$firstName $lastName"
	val male: Boolean
	val gender: String
	val age: Int
	
	init {
		age = 2020 - yearOfBirth
		this.male = male
		if(male) {
			this.gender = "male"
		} else {
			this.gender = "female"
		}
	}
	
	fun printInfo() {
		println("name: $fullName, age: $age, gender: $gender")
	}
	
	
}