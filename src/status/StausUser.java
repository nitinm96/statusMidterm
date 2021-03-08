/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * March 8th
 * @author srinivsi
 */
public class StausUser 
{
    public enum Status 
    {
        REJECTED, PENDING, PROCESSING, APPROVED, NOTVALIDCODE
    };
    
    public enum Value 
    {
        ZERO, ONE, TWO, THREE
    };
    
    private Status status;
    private Value value;
    
        public StausUser(Value v)
        {
            
            this.value = v;
        }
    
    
    /**
     * @return the status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * @return the value
     */
    public Value getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Value value) {
        this.value = value;
    }
      public void statusDetail(Value value)
{
switch(value)
        {
        case ZERO : System.out.println("REJECTED");
        break;
        case ONE: System.out.println("PENDING");
        break;
        case TWO:
        System.out.println("PROCESSING");
        break;
        case THREE: 
            System.out.println("APPROVED");
        break;
        
        default:
         System.out.println("NOT VALID CODE");
        break;
        }
}

 
}       
            

 

