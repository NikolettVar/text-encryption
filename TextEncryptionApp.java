/*
*TextEncryptionApp.java
*N Varadi
*01 12 2020
*/
import javax.swing.*;

public class TextEncryptionApp{
	public static void main(String args[]){

	//Variables

	String text;
	String encryptedText;

	//Create an object instance of the instantiable class, so we can access methods associated with that class

	TextEncryption myTextEncryption = new TextEncryption();

	//Ask user for input, call setter method and send out user input to instan class for processing

	text = JOptionPane.showInputDialog(null, "Please enter text");
	myTextEncryption.setText(text);

	//Call compute method to carry out computations

	myTextEncryption.compute();

	//Call getter method to return output value

	encryptedText = myTextEncryption.getEncryptedText();

	//Print output to the user

	JOptionPane.showMessageDialog(null, "The encrypted version of your text is: " + encryptedText);

	}
}