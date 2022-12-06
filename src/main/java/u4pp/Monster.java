package u4pp;

public class Monster extends Combatant{
    public int myExp;
    public Monster(String name, int health, int attack, int exp){
        super(name, health, attack);
        myExp = exp;
    }
    //------------------------------------------------------------
    public int getExpGiven(){
        if(myExp < 0){
            return(0);
        }
        return myExp;
    }
    //------------------------------------------------------------
    public void takeTurn(Combatant target){
        target.takeDamage(this.getAttackPower());
    }
    //------------------------------------------------------------
    public String toString(){
        return("Name - " + myName + "\nCurrent Health - " + myHealth + "/" + myMaxHealth + "\nMax Health - " + myMaxHealth + "\nAttack Power - " + myAttack + "\nEXP Dropped - " + myExp);
    }
}
