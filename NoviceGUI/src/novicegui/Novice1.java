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
public class Novice1 extends Novice {
     private static final int  hp = 250;
    
    public Novice1(){
        super(hp,"novice chinjung",25);
        this.attackSkill = AttackSkill.getAttackSkill("slap");
        
        
    }
}
