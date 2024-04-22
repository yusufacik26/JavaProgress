/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classwithattributes;


public class productt {

    /**
     * @return the _name
     */
    public String getName() {
        return _name;
    }

    /**
     * @param _name the _name to set
     */
    public void setName(String _name) {
        this._name = _name;
    }

    /**
     * @return the _description
     */
    public String getDescription() {
        return _description;
    }

    /**
     * @param _description the _description to set
     */
    public void setDescription(String _description) {
        this._description = _description;
    }

    /**
     * @return the _price
     */
    public double getPrice() {
        return _price;
    }

    /**
     * @param _price the _price to set
     */
    public void setPrice(double _price) {
        this._price = _price;
    }

    /**
     * @return the _stockAmount
     */
    public int getStockAmount() {
        return _stockAmount;
    }

    /**
     * @param _stockAmount the _stockAmount to set
     */
    public void setStockAmount(int _stockAmount) {
        this._stockAmount = _stockAmount;
    }


        // Attribute  ||  field
    
    public productt(String _name,int _id,int _stockAmount,double _Price, String _description){
        System.out.println("Class calistirildi...");
        this._id=_id;
        this._name=_name;
        this._price=_price;
        this._stockAmount=_stockAmount;
        this._description=_description;
    }
    
    
    
  private int _id;
  private String _name;
   private String _description;
   private double _price;
    private int _stockAmount ;
    
    
    
    
    //Getter
    public int getId(){
    return _id;
    
    }
    
    
    //Setter
    public void setId(int id){
  _id=id;
    
    
    }
}
