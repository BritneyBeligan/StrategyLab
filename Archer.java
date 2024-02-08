public class Archer implements CharacterType {
    public String attack(){

        String output = new String();
        output += "Archer shoots an arrow!";
        return output;      

    }

    public String defend(){
        String output = new String();
        output += "Using a shield to defend!";
        return output;
    }

}
