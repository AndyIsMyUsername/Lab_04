
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 6223602
 */
public class Main extends Application {

   
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        
        GridPane gp = new GridPane(10,10);
        gp.setHgap(10);
        gp.setVgap(10);
        
        
        Label days = new Label("Days on the trip: ");
        TextField dayTF = new TextField();
        gp.add(days, 0, 0);
        gp.add(dayTF, 1, 0);
        
        Label airfare = new Label("Airfare: ");
        TextField airfareTF = new TextField();
        gp.add(airfare, 0, 2);
        gp.add(airfareTF, 1, 2);
        
        Label carRental = new Label("Car rental: ");
        TextField carRentalTF = new TextField();
        gp.add(carRental, 0, 3);
        gp.add(carRentalTF, 1, 3);
        
        Label Miles = new Label("Miles: ");
        TextField MilesTF = new TextField();
        gp.add(Miles, 0, 4);
        gp.add(MilesTF, 1, 4);
        
        Label ParkingFee = new Label("Parking Fee: ");
        TextField ParkingFeeTF = new TextField();
        gp.add(ParkingFee, 0, 5);
        gp.add(ParkingFeeTF, 1, 5);
        
        Label TaxiCharges = new Label("Taxi Charges");
        TextField TaxiChargesTF = new TextField();
        gp.add(TaxiCharges, 0, 6);
        gp.add(TaxiChargesTF, 1, 6);
        
        Label RegistFee = new Label("Registration Fees:");
        TextField RegistFeeTF = new TextField();
        gp.add(RegistFee, 0, 7);
        gp.add(RegistFeeTF, 1, 7);
        
        Label Lodging = new Label("Lodging Charges(Per Night): ");
        TextField LodgingTF = new TextField();
        gp.add(Lodging, 0, 8);
        gp.add(LodgingTF, 1, 8);
        
        Scene scene = new Scene(gp,500,500);
        stage.setScene(scene);
        stage.show();
    }
    
}
