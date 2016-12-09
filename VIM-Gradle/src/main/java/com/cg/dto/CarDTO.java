package com.cg.dto;


/*NA*/
/**
 * 
 * This is a CarDTO class
 * @see java.lang.Object
 * @author Abhishek
 * 
 *
 */

public class CarDTO
{
//	TODO:1 Oracle db is using strategy = GenerationType.SEQUENCE
//	TODO:2 MySQL db is using strategy = GenerationType.AUTO

    private int id;
	
    private String make;
	
    private String model;
	
    private String modelYear;

    public CarDTO()
    {
        this.id = -1;
        this.make = "";
        this.model = "";
        this.modelYear = "";        
    }

    /**
     * 
     * @return id id of car
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * 
     * @param id set id of car
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * 
     * @return make of a car
     */
    
    public String getMake()
    {
        return make;
    }

    /**
     * 
     * @param make sets make of a car
     */
    public void setMake(String make)
    {
        this.make = make;
    }

    /**
     * 
     * @return model of a car
     */
    public String getModel()
    {
        return model;
    }

    /**
     * 
     * @param model sets model of a car
     */
    public void setModel(String model)
    {
        this.model = model;
    }

    /**
     * 
     * @return modelYear of a car
     */
    public String getModelYear()
    {
        return modelYear;
    }

    /**
     * 
     * @param modelYear sets modelyear of a car
     */
    public void setModelYear(String modelYear)
    {
        this.modelYear = modelYear;
    }
}
