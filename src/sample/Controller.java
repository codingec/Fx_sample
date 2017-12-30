package sample;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    public TextField Lname;
    public TextField Lsurname;
    public TextField Lage;
    public TextField Laddress;
    public TextField Lprice_of_food;
    public TextField Lname_favorite;
    public TextField Lquantity;
    public Label resulter;

    public void buttonclicked(){

        String name;
        String surname;
        int age;
        String address;
        int price_of_food;
        String name_favorite;
        int adder;
        int quantity;


        name = Lname.getText();
        surname = Lsurname.getText();
        age = Integer.parseInt(Lage.getText());
        address = Laddress.getText();
        price_of_food = Integer.parseInt(Lprice_of_food.getText());
        name_favorite = Lname_favorite.getText();
        quantity = Integer.parseInt(Lquantity.getText());
        adder = price_of_food * quantity;
        resulter.setText("This is what you´ve inserted into Andres Demo:" + "\n" + "Your name is:" + name + "\n" + "Your surname is:" + surname + "\n" + "Your age is:" + age + "\n" + "Your address is:" + address + "\n" + "food price is:" + price_of_food + "\n" + "Name of your favorite food:" + name_favorite + "\n" + "How many you eat:"+ quantity + "\n" + "Total you spent on food:" + adder);


    }


}
