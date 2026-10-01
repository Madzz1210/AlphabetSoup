//Name: Maddy Dyer
//Date: 10/01/26
//Description: This program will alter the string list based off of the users commands and the company name, etc.


public class Soup {
    //these are instance variables 
    private String letters; //refreshingdeliciouszero
    private String company; //coke

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.
    //Precondition: The user types a word to add
    //Postcondition: The word is added to the letters string
    //adds a word to the pool of letters known as "letters"
    public void add(String word){
        letters += word;
    }

    //Precondition: The user wants to find a random letter from the string
    //Postcondition: A random letter is selected from the string
    //Use Math.random() to get a random character from the letters string and return it.
    public char randomLetter(){
        char randomLetter = letters.charAt((int)(Math.random()*letters.length()));
        return randomLetter;
    }

    //Precondition: The user wants hte company name to be centered in the letters
    //Postcondition: The company name is centered
    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    public String companyCentered(){
        String companyCentered = letters.substring(0, letters.length()/2) + company + letters.substring(letters.length()/2, letters.length());
        return companyCentered;
    }

    //Precondition: If there is a vowel in the letters string, the first one gets removed
    //Postcondition: That letter if it exists gets removed
    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    public void removeFirstVowel(){
        String vowel = "[aeiouAEIOU]";
        letters = letters.replaceFirst(vowel, ""); 
    }
    //Precondition: Letters string will have a random number of lettters removed from it
    //Postcondition: Letters still exists and has values, but is missing a chunk of letters
    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    public void removeSome(int num){
        int location = (int)(Math.random()*(letters.length()-num));
        String firstPart = letters.substring(0, location);
        String lastPart = letters.substring(location);
        letters = (firstPart + lastPart);
    }
    //Precondition: If letterrs has the word "word" in it, then it will be removed
    //Postcondition: If "word" was there then it was removed
    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    public void removeWord(String word){
        letters = letters.replace("word", "");
    }
}
