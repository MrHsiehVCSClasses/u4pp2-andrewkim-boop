package u4pp;

public class Fighter extends Combatant {
    public int myExp;
    public int myFocusStacks;
    public int myLevel = 1;
    public boolean myBlock;
    public Fighter(String name, int maxHealth, int attack){
        super(name, maxHealth, attack);
    }
    //------------------------------------------------------------
    public int getEXP(){
        return myExp;
    }
    //------------------------------------------------------------
    public int getFocusStacks(){
        return myFocusStacks;
    }
    //------------------------------------------------------------
    public int getLevel(){
        return myLevel;
    }
    //------------------------------------------------------------
    public boolean getIsBlocking(){
        return myBlock;
    }
    //------------------------------------------------------------
    public void attack(Combatant target){
        int mult = 1;
        for(int i = 0; i < myFocusStacks; i++){
            mult *= 2; 
        }
        if(myFocusStacks > 0){
            target.takeDamage(this.getAttackPower() * mult);
            myFocusStacks = 0;
        }
        else{
            target.takeDamage(this.getAttackPower());
        }
    }
    //------------------------------------------------------------
    public void block(){
        myBlock = true;
    }
    //------------------------------------------------------------
    public void focus(){
        myFocusStacks += 1;
    }
    //------------------------------------------------------------
    public void gainEXP(int exp){
        while(exp >= myLevel){
            exp -= myLevel;
            myLevel++;
            int current = getMaxHealth();
            this.setMaxHealth(current + 5);
            this.setHealth(current + 5);
            this.setAttackPower(this.getAttackPower() + 1);
            System.out.println("You leveled up to level " + myLevel);
        }
        myExp += exp;
        if(myExp >= myLevel){
            myExp -= myLevel;
            System.out.println("You leveled up to level " + myLevel);
        }
        System.out.println(this.toString());
    }
    //------------------------------------------------------------
    public void takeDamage(int damage){
        if(myBlock == true){
            super.takeDamage(damage / 2);
            myBlock = false;
        }
        else{
            super.takeDamage(damage);
        }
    }
    //------------------------------------------------------------
    public String toString(){
        return("Name - " + myName + "\nCurrent Health - " + myHealth + "/" + myMaxHealth + "\nMax Health - " + myMaxHealth + "\nAttack Power - " + myAttack + "\nLevel - " + myLevel + "\nEXP - " + myExp + "/" + myLevel + "\nFocus Stacks - " + myFocusStacks + "\nBlocking - " + myBlock);
    }
}
