package com.demo.entity;

public class Girl {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column girl.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column girl.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column girl.cup
     *
     * @mbg.generated
     */
    private String cup;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column girl.career
     *
     * @mbg.generated
     */
    private String career;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column girl.id
     *
     * @return the value of girl.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column girl.id
     *
     * @param id the value for girl.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column girl.name
     *
     * @return the value of girl.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column girl.name
     *
     * @param name the value for girl.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column girl.cup
     *
     * @return the value of girl.cup
     *
     * @mbg.generated
     */
    public String getCup() {
        return cup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column girl.cup
     *
     * @param cup the value for girl.cup
     *
     * @mbg.generated
     */
    public void setCup(String cup) {
        this.cup = cup == null ? null : cup.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column girl.career
     *
     * @return the value of girl.career
     *
     * @mbg.generated
     */
    public String getCareer() {
        return career;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column girl.career
     *
     * @param career the value for girl.career
     *
     * @mbg.generated
     */
    public void setCareer(String career) {
        this.career = career == null ? null : career.trim();
    }
}