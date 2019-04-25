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
public class Monster1 extends Novice{
    private static final int  hp = 150;
    
    public Monster1(){
        super(hp,"monster1",15);
        this.attackSkill = AttackSkill.getAttackSkill("slap");
    }
}
