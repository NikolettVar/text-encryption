/*
*TextEncryption.java
*N Varadi
*01 12 2020
*/

public class TextEncryption{

	//Declare data members

	private String text;
	private String encryptedText;
	private StringBuffer strBuff;

	//Constructor, assign initial values to data members

	public TextEncryption(){
		text = "";
		encryptedText = "";
		strBuff = new StringBuffer(); //Create an instance of StringBuffer class
	}

	//Create input method/setter for the user input

	public void setText(String text){
		this.text = text;
	}

	//Create computation method

	public void compute(){

		for(int i = 0; i < text.length(); i++){
			if(text.charAt(i) == ' '){ //if char is a space, replace it with a String of ##
				strBuff.append("##");
			}
			else if(text.charAt(i)== 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u'){
				strBuff.append(text.charAt(i)); //if char is a vowel, copy it into strBuff, then add + character
				strBuff.append('+');

			}
			else if(text.charAt(i) == '.'){
				strBuff.append(text.charAt(i)); //if char is a dot, copy it into strBuff, unchanged
			}

			else{
				strBuff.append('$');
				strBuff.append(text.charAt(i)); //otherwise, if char is a consonant, add $ then copy char into strBuff
			}
		}

		//Convert content of StringBuffer back to a String
		encryptedText = strBuff.toString();
	}

	//Create output/getter method to return output value

	public String getEncryptedText(){
		return encryptedText;
	}
}