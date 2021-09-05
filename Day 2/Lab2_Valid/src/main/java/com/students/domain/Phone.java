/**
 * 
 */
package com.students.domain;

//import javax.validation.constraints.Digits;
//import javax.validation.constraints.Size;
import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * @author B.Pirasanth
 *
 */
public class Phone implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Digits(integer = 3, fraction =0, message = "abcd")
	@Size(min =100, max= 999)
 	private Integer area;
	@Digits(integer = 3, fraction =0)
	@Size(min = 100, max = 999)
 	private Integer prefix;
	@Digits(integer = 4, fraction =0)
	@Size(min =1000, max= 9999)
 	private Integer number;
	

 
	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

 	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getPrefix() {
		return prefix;
	}

	public void setPrefix(Integer prefix) {
		this.prefix = prefix;
	}
}
