package u4pp;

public class DefenseMonster extends Monster{
    public int myDefense;
    public DefenseMonster(String name, int health, int attack, int exp, int defense){
        super(name, health, attack, exp);
        myDefense = defense;
    }
    //------------------------------------------------------------
    public int getDefense(){
        if(myDefense < 0){
            return(0);
        }
        return(myDefense);
    }
    //------------------------------------------------------------
    public void takeDamage(int damage){
        if(damage - myDefense <= 0){
            super.takeDamage(0);
        } 
        else{
            super.takeDamage(damage - myDefense);
        }
    }
    //------------------------------------------------------------
    public String toString(){
        return("Name - " + myName + "\nCurrent Health - " + myHealth + "/" + myMaxHealth + "\nMax Health - " + myMaxHealth + "\nAttack Power - " + myAttack + "\nEXP Dropped - " + myExp + "\nMonster Defense - " + myDefense);
    }
}
