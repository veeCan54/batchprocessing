//package com.veecan54.batchprocessing.data;
//
//import java.util.Date;
//import java.util.UUID;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToOne;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//public class CustomerPaymentsInfo {
//	@Id
//	@GeneratedValue
//	private UUID id;
//	
//	@OneToOne
//	@JoinColumn(name="id")
//	private Customer customer;
//	
//	private Date invoiceDate;
//	
//	private Date paidDate;
//	
//	private Double invoiceAmount;
//	
//	private Double paidAmount;
//}
