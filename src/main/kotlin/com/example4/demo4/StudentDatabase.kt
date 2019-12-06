package com.example4.demo4

import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class StudentDatabase{
    private val students = mutableListOf<Student>()

    @PostConstruct
    private fun init(){
        students.add(Student("2939489375", "Sammy Njihia"))
        students.add(Student("204874802", "Ben Wawesh"))
    }

    fun getStudents() = students

    fun addStudent(student: Student): Boolean{
        students.add(student)
        return true
    }

    fun getStudentWithRollNumber(roll_number: String): Student?{
        var student = students.find { it.roll_number==roll_number }

        return student
    }
}