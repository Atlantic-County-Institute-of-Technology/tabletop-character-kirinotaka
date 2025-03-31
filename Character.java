import java.util.ArrayList; //imports array list


abstract class Character { //
    protected int STR;
    protected int DEX;
    protected int CON;
    protected int INT;
    protected int WIS;
    protected int CHA;
    protected String name;
    protected int LVL;
    protected int HP;
    protected int AC;
    protected ArrayList<String> feats;

    public void getAbilityModifier(){

    }

    public int calculateHitPoints() {
        if (LVL == 1) {
            HP = 10 + getAbilityModifier(CON);
        } else {
            HP = HP + (LVL - 1) * (6 + getAbilityModifier(CON));
        }
        return HP;
    }

    public int calculateArmorClass(){
        AC = 10 + getAbilityModifier(DEX);
        return AC;
    }

    public Character(String name, int LVL, int HP, int AC){
        this.name = name;
        this.LVL = LVL;
        this.HP = calculateHitPoints();
        this.AC = calculateArmorClass();
    }

}
