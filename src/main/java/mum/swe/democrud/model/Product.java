package mum.swe.democrud.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "product_number")
	@NotNull(message = "*Please provide product number")
//	@NotEmpty(message = "*Please provide product number")
	private Long productNumber;

	@Column(name = "product_name")
	@NotEmpty(message = "*Please provide product name")
	private String productName;

	@Column(name = "unit_price")
	@NotNull(message = "*Please provide unit price")
	//@NotEmpty(message = "*Please provide unit price")
	private Float unitPrice;

	@Column(name = "manufacture_date")
	@NotNull(message = "*Please provide manufacture date")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate dateMfd;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(Long productNumber) {
		this.productNumber = productNumber;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public LocalDate getDateMfd() {
		return dateMfd;
	}

	public void setDateMfd(LocalDate dateMfd) {
		this.dateMfd = dateMfd;
	}
}
