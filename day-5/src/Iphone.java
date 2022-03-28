// innerclass

import accesuaries.EarPhone;

class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        Iphone.Earphone earphone = iphone.new Earphone();

        Iphone.Earphone.AirPod airPod = iphone.new Earphone().new AirPod();
    }
}
public class Iphone {
   private String model;
   private Double price;
   private EarPhone earPhone;

   public String getModel(){return model;}
   public void setModel(String model){this.model = model; }

    public Double getPrice(){return price;}
    public void setPrice(double price){this.price = price; }

    public EarPhone getEarPhone(){return earPhone;}
    public void setEarPhone(EarPhone earPhone){this.earPhone = earPhone; }

    public class Earphone extends accesuaries.EarPhone{
       public class AirPod extends EarPhone{

       }
    }


}
