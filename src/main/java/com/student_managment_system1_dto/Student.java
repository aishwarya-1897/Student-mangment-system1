package com.student_managment_system1_dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int studentId;
   private String studentName;
   private long studentPhoneNumber;
   private String studentEmail;
   private double studentFee;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public long getStudentPhoneNumber() {
	return studentPhoneNumber;
}
public void setStudentPhoneNumber(long studentPhoneNumber) {
	this.studentPhoneNumber = studentPhoneNumber;
}
public String getStudentEmail() {
	return studentEmail;
}
public void setStudentEmail(String studentEmail) {
	this.studentEmail = studentEmail;
}
public double getStudentFee() {
	return studentFee;
}
public void setStudentFee(double studentFee) {
	this.studentFee = studentFee;
}
   
   
}
