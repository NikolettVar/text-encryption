# text-encryption
Higher Diploma in Computing, Software Development, Software Development module. This small project was created as part of a Continuous Assessment.
- A startup company has commissioned the development of an application to encrypt text.
- The application prompts the user to enter a piece of text (at least one sentence).
- The text can contain only letters, spaces (i.e. ' ') and dots (i.e. '.'). Each sentence ends with a dot.
- Next, the application uses the given text to generate a new encrypted text. 
- The encrypted text is created using the following rules:
- If the character is a vowel then immediately after the vowel add a ‘+’ 
  character
- If the character is a consonant then just before the consonant add a ‘$’ 
  character
- Each space is replaced with the ‘#’ symbol twice
- Each dot is included in the new text without any changes.
This small project uses instantiable class, JOptionPane to read in user input and StringBuffer.
