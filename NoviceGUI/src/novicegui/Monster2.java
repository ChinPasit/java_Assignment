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
public class Monster2 extends Novice {
    private static final int  hp = 100;
    
    public Monster2(){
        super(hp,"monster2",7);
        this.attackSkill = AttackSkill.getAttackSkill("slap");
    }
}
