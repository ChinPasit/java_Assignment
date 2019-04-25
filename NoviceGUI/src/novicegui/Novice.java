/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novicegui;

/**
 *
 * @author LENOVO
 */
abstract class Novice {
    protected String name;
    protected int atk;
    protected int exp;
    protected int hp;
    protected int level;
    protected int maxhp;
    protected AttackSkill attackSkill;


    
    public Novice(int inputValue,String inputname,int inputatk){
        atk = inputatk;
        exp = 0;
        hp  = inputValue;
        maxhp = 250;
        name = inputname;
        level = 1;
    }
    public void getItem(Item item){
        this.atk += item.getRestoreValue();
    }
    public String getName(){
        return this.name;
    }
    public String getstaus(){
        if(this.hp > 80){
            return "Excellent";
        }
        else if(this.hp > 50){
            return "Good";
        }
        else {
            return "Help me";
        }
    }
    public int getmaxhp(){
        return this.maxhp;
    }
    public int gethp(){
        return this.hp;
    }
    public int gethpGeneral(){
        return this.hp;
    }
    public double getatk(){
        return this.atk;
    }
    public double getexp(){
        return this.exp;
    }
    public void eat(Postion postion){
        this.hp += postion.getRestoreValue();
        if(this.hp > this.maxhp){
            this.hp = this.maxhp;
        }
    }
    public void getatkup(int inputatk){
        this.atk += 15;
    }
    public int getLevel(){
        return this.level;
    }
    public int getLevelup(Postion postion){
        this.level += postion.getRestoreValue();
        return this.level;
    }
    public void attack(Novice rival){
        rival.injure(this.attackSkill);
    }
    public void injure(AttackSkill skill){
		this.reducedHealth(skill.getDamage());
	}
    public void reducedHealth(int value){
		this.hp -= value;
		if(this.hp < 0)
			this.hp = 0;
	}
}
