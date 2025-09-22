
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
        
        
        GridPane root = new GridPane(10,10);
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(25, 25, 25, 25 ));
        
        
        Label days = new Label("Days on the trip: ");
        TextField dayTF = new TextField();
        root.add(days, 0, 0);
        root.add(dayTF, 1, 0);
        
        Label airfare = new Label("Airfare $: ");
        TextField airfareTF = new TextField();
        root.add(airfare, 0, 2);
        root.add(airfareTF, 1, 2);
        
        Label carRental = new Label("Car rental $: ");
        TextField carRentalTF = new TextField();
        root.add(carRental, 0, 3);
        root.add(carRentalTF, 1, 3);
        
        Label Miles = new Label("total Miles, is it a private vehicle ? (yes or no): ");
        TextField MilesTF = new TextField();
        root.add(Miles, 0, 4);
        root.add(MilesTF, 1, 4);
        
        Label ParkingFee = new Label("Days Parking Fee $: ");
        TextField ParkingFeeTF = new TextField();
        root.add(ParkingFee, 0, 5);
        root.add(ParkingFeeTF, 1, 5);
        
        Label TaxiCharges = new Label("Days Taxi Charges");
        TextField TaxiChargesTF = new TextField();
        root.add(TaxiCharges, 0, 6);
        root.add(TaxiChargesTF, 1, 6);
        
        Label RegistFee = new Label("Registration Fees$ :");
        TextField RegistFeeTF = new TextField();
        root.add(RegistFee, 0, 7);
        root.add(RegistFeeTF, 1, 7);
        
        Label Lodging = new Label("Lodging Charges per days $: ");
        TextField LodgingTF = new TextField();
        root.add(Lodging, 0, 8);
        root.add(LodgingTF, 1, 8);
        
        Button register = new Button("Register");
        root.add(register, 1, 9);
        
        Label totalLabel = new Label();
        Label allowedExpLbl = new Label();
        Label excessLbl = new Label();
        Label savedLbl = new Label();
        root.add(totalLabel, 0, 9);
        root.add(allowedExpLbl, 0, 10);
        root.add(excessLbl, 0, 11);
        root.add(savedLbl, 0, 12);
        
        register.setOnAction(event -> {
            
            register.setDisable(false);
            
            if (dayTF.getText().isEmpty() ||
            MilesTF.getText().isEmpty() ||
            LodgingTF.getText().isEmpty()){
                register.setDisable(true);
                return;
            }
            
            String DayTGString = dayTF.getText();
            double intValuedayTG = Integer.parseInt(DayTGString);
            double finalValueSavedTG = intValuedayTG * 37;
            
            
            String airString = airfareTF.getText();
            double intValueAirFare = Integer.parseInt(airString);
            
            String carString = carRentalTF.getText();
            double intValueCar = Integer.parseInt(carString);
            
            String milesString = MilesTF.getText();
            if (milesString.contains("yes")) {
                int intValueMiles = Integer.parseInt(milesString);
                double finalValueMSaved = intValueMiles*(0.27);
            } 
            
            String parkingString = ParkingFeeTF.getText();
            double intValueParking = Integer.parseInt(parkingString);
            double finalValuePsaved = intValueParking * 10;
            
            String taxiString = TaxiChargesTF.getText();
            double intValueTaxi = Integer.parseInt(taxiString);
            double finalValueTSaved = intValueTaxi * 20;
            
            String ConString = RegistFeeTF.getText();
            double intValueCon = Integer.parseInt(ConString);
            
            String LodgingString = LodgingTF.getText();
            double intValueLodging = Integer.parseInt(LodgingString);
            double finalValueLodgSaved = intValueLodging * intValuedayTG;
            
            double total = intValueLodging + intValueMiles + 
                     + intValueTaxi + intValueParking  + intValuedayTG + 
                    intValueAirFare + intValueCar + intValueCon;
            
            double totalSaved = finalValueLodgSaved + finalValuePsaved + finalValueSavedTG + 
                                   finalValueTSaved ;
            
           String totalString = String.valueOf(total);
           String totalSavedString = String.valueOf(totalSaved);
           
            totalLabel.setText("Total Expenses: $" +  totalString);
            //allowedExpLbl.setText("Total Allowed: $" + String.format("%.2f", allowedExpenses));
            //excessLbl.setText("Excess to Pay: $" + String.format("%.2f", excess));
            savedLbl.setText("Amount Saved: $" + totalSavedString));
            
        });
        
        
        Scene scene = new Scene(root,500,500);
        scene.getStylesheets().add("demo.css");
        stage.setTitle("Travel expense Calculator");
        stage.setScene(scene);
        stage.show();
    }
    
}
