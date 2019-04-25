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
public class AttackSkill {
    private String name;
    private int damage;
    
    public AttackSkill(String inputname , int inputdamage){
        this.name = inputname;
        this.damage = inputdamage;
    }
    public String getName(){
        return this.name;
    }
    public int getDamage(){
        return this.damage;
    }
    public static AttackSkill getAttackSkill(String name){
		AttackSkill skill = null;
		switch(name.toLowerCase()){
			case "slap":
				skill = new AttackSkill("slap", 45);
				break;
		}
		return skill;
	}
}
