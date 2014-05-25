/**
 * Created by Bastian on 25/05/2014.
 */
class Customer {
    private String _name;
    private Vector _rentals = new Vector();
    public Customer (String name){
        _name = name;
    };
    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }
    public String getName (){
        return _name;
    };