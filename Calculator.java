import java.util.ArrayList;

public class Calculator extends Reservation {
    private String reservationType;

    public Calculator(){
        reservationType = "S";
    }

    //Accessor
    public String getType(){
        return reservationType;
    }

    //Mutator
    public void setType(String type){
        this.reservationType = type;
    }

    //Calculation
    public double getDiscount(){
        if (reservationType == "S"){
            return totalCost;
        } else if (reservationType == "AP"){
            double temp;
            temp = totalCost;
            double discountedPrice = (temp * (5 / 100));
            return discountedPrice;
        } else {
            return totalCost;
        }
    }
}
