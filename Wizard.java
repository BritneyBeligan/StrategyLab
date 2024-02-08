public class Wizard implements CharacterType{
    public String attack(){

        String output = new String();
        output += "Wizard casts a spell!";
        return output;      

    }

    public String defend(){
        String output = new String();
        output += "Creating a magic barrier for defense!";
        return output;
    }
}
