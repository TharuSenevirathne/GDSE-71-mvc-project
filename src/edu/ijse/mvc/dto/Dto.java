 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;

/**
 *
 * @author tharu
 */
public class Dto {
    private String id;
    private String title;
    private String name;
    private String dob;
    private Double salary;
    private String address;
    private String city;
    private String province;
    private String postalcode;
    

    public Dto(String id, String title, String name, String dob, Double salary, String address, String city, String province, String postalcode ) {
        this.id = id;
        this.title = title;
        this.name = name;
        this.dob = dob;
        this.salary = salary;
        this.address = address;
        this.city = city;
        this.province = province;
        this.postalcode = postalcode;
    }

    public Dto() {
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the salary
     */
    public Double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province the province to set
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return the postalcode
     */
    public String getPostalcode() {
        return postalcode;
    }

    /**
     * @param postalcode the postalcode to set
     */
    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }
    
    @Override
    public String toString (){
        return "Dto{"+"id="+id+",title="+title+",name="+name+",dob="+dob+",salary="+salary+",address="+address+",city="+city+",province="+province+",postalcode="+postalcode+'}';
    }



}
