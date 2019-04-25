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
public class Item {
    private String name;
    private float restoreValue;
    private int weaponType;
    
    public Item(int type){
        this.weaponType = type;
        switch(weaponType){
            case 0 : this.name = "Sword";
                    this.restoreValue = 50;
                    break;
            case 1 : this.name = "Archer";
                    this.restoreValue = 25;
                    break;
            case 2 :this.name = "Wand";
                    this.restoreValue = 12;
                    break;
        }
    }
    public String getName(){
        return this.name;
    }
    public float getRestoreValue(){
        return this.restoreValue ;
    }
}
