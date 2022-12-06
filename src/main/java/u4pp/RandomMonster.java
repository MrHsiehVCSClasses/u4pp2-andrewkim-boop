package u4pp;
import java.lang.Math;

public class RandomMonster extends Monster{
    public RandomMonster(String name, int health, int attack, int exp){
        super(name, health, attack, exp);
    }
    //------------------------------------------------------------
    public void takeTurn(Combatant target){
        if(Math.random() > 0.5){
            target.takeDamage(this.getAttackPower());
        }
    }
    //------------------------------------------------------------
    public String toString(){
        return("Name - " + myName + "\nCurrent Health - " + myHealth + "/" + myMaxHealth + "\nMax Health - " + myMaxHealth + "\nAttack Power - " + myAttack + "\nEXP Dropped - " + myExp + "\nThis Monster only attacks 50% of the time, however it has increased stats");
    }
}
