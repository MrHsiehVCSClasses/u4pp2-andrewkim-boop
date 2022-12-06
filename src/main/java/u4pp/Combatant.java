package u4pp;

public class Combatant {
    public String myName;
    public int myMaxHealth;
    public int myAttack;
    public int myHealth;
    //------------------------------------------------------------
    public Combatant(String name, int maxHealth, int attack){
        myName = name;
        myMaxHealth = maxHealth;
        myAttack = attack;
        myHealth = maxHealth;
    }
    //------------------------------------------------------------
    public String getName(){
        return myName;
    }//------------------------------------------------------------
    public int getHealth(){
        return myHealth;
    }
    //------------------------------------------------------------
    public int getMaxHealth(){
        return myMaxHealth;
    }
    //------------------------------------------------------------
    public int getAttackPower(){
        return myAttack;
    }
    //------------------------------------------------------------
    public void setHealth(int health){
        if(health <= 0){
            myHealth = 0;
        }
        else if(health >= myMaxHealth){
            myHealth = myMaxHealth;
        }
        else{
            myHealth = health;
        }
    }
    //------------------------------------------------------------
    public void setMaxHealth(int health){
        if(health >= myMaxHealth){
            myHealth = myMaxHealth;
            myMaxHealth = health;
        }
        else{
            myMaxHealth = health;
            myHealth = myMaxHealth;
        }
        if(health <= 0){
            myMaxHealth = 1;
            myHealth = 1;
        }
    }
    //------------------------------------------------------------
    public void setAttackPower(int attackPower){
        myAttack = attackPower;
        if(attackPower <= 0){
            myAttack = 0;
        }
    }
    //------------------------------------------------------------
    public void takeDamage(int damage){
        if(damage > 0){
            setHealth(myHealth - damage);
        }
    }
    //------------------------------------------------------------
    public boolean canFight(){
        if(myHealth > 0){
            return true;
        }
        return false;
    }
    //------------------------------------------------------------
    public String toString(){
        return("Name - " + myName + "\nCurrent Health - " + myHealth + "/" + myMaxHealth + "\nMax Health - " + myMaxHealth + "\nAttack Power - " + myAttack);
    }
}
