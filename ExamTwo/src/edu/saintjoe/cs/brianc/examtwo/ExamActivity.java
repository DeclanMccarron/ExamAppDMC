
package edu.saintjoe.cs.brianc.examtwo;


import com.google.devtools.simple.runtime.components.Component;
import com.google.devtools.simple.runtime.components.HandlesEventDispatching;
import com.google.devtools.simple.runtime.components.android.Form;

import com.google.devtools.simple.runtime.components.android.Button;
import com.google.devtools.simple.runtime.components.android.Label;
import com.google.devtools.simple.runtime.components.android.HorizontalArrangement;
import com.google.devtools.simple.runtime.components.android.TextBox;
import com.google.devtools.simple.runtime.components.android.AccelerometerSensor;

import com.google.devtools.simple.runtime.events.EventDispatcher;

public class ExamActivity extends Form implements HandlesEventDispatching {

	// this part is the buttons that will appear on the main screen
	private HorizontalArrangement line1, line2, line3, line4, line5;
	private Button DoubleButton;
	private Label resultLabel;
	private Label promptLabel;
	private TextBox inputBox;
	private Label outputLabel;
	int temp;
	
// the start or would be called main in java
 void $define() {
 	
     this.BackgroundColor(COLOR_WHITE);
     //to create different rows on the screen
     line1 = new HorizontalArrangement(this);
     line2 = new HorizontalArrangement(this);
     line3 = new HorizontalArrangement(this);
     line4 = new HorizontalArrangement(this);

    // the inputBox to enter a number 
     promptLabel = new Label(line1, "Enter a number:");
     inputBox = new TextBox(line1);
     inputBox.NumbersOnly(true);
   
     DoubleButton = new Button(line2,"Double it":"); 
     
     resultLabel = new Label(line3,"");
     
     outputLabel = new Label(line4, "");
 
   
 @Override
 public boolean dispatchEvent(Component component, String id, String eventName,
         Object[] args) {
 	//when the button is clicked this part of the code will "double it"
	    if (component.equals(DoubleButton) && eventName.equals("Click")){
	    	temp = Integer.parseInt(inputBox.Text());
    	temp x= 2;
	    	resultLabel.Text(String.valueOf(temp));
	        return true;
	     } 
	    // the output label will put double the value from the input
	    if (component.equals(resultLabel) && eventName.equals("Click"))
    return true;
	} 
} 
