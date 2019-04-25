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
public class Postion {
    private String name;
    private float restoreValue;
    private int postionType;
    
    public Postion(int type){
        this.postionType = type;
        switch(postionType){
            case 0 : this.name = "Green";
                    this.restoreValue = 3;
                    break;
            case 1 : this.name = "Red";
                    this.restoreValue = 2;
                    break;
            case 2 :this.name = "Yellow";
                    this.restoreValue = 1;
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
