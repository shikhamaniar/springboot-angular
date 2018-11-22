package com.proj.qs;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "staff")
public class Staff {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    int id;
	
	@Column(name="name")
    String name;
	
	@Column(name = "pincode")
    int pincode;
	
	@Column(name = "house_no")
    String house_no;
	
	@Column(name = "area")
    String area;
	
	@Column(name = "landmark")
    String landmark;
	
	@Column(name = "city")
    String city;
	
	@Column(name = "state")
    String state;
	
	@Column(name = "contact")
    String contact;
	
	@Column(name = "email")
    String email;
	
	@Column(name = "gender")
    String gender;
	
	@Column(name = "joining_date")
    String joining_date;

    @Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", pincode=" + pincode + ", house_no=" + house_no + ", area="
				+ area + ", landmark=" + landmark + ", city=" + city + ", state=" + state + ", contact=" + contact
				+ ", email=" + email + ", gender=" + gender + ", joining_date=" + joining_date + "]";
	}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public void setHouse_no(String house_no) {
        this.house_no = house_no;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setJoining_date(String joining_date) {
        this.joining_date = joining_date;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPincode() {
        return pincode;
    }

    public String getHouse_no() {
        return house_no;
    }

    public String getArea() {
        return area;
    }

    public String getLandmark() {
        return landmark;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getJoining_date() {
        return joining_date;
    }

    public Staff() {
    }

}
