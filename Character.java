public class Character {

    private CharacterType characterType; 


    public Character(CharacterType characterType){
        this.characterType = characterType;
    }

    public String showCharacter(){

     return characterType.attack();

    }
    
}



