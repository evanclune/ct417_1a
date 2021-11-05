/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ct417_1;


public class Module {
    private String moduleName;
    private String moduleID;

    public Module(String name, String ID){
        this.moduleName=name;
        this.moduleID=ID;
    }

    
    //getters
    public String getName() {
        return moduleName;
    }
    
    public String getID() {
        return moduleID;
    }
    //setters
    public void setName(String name) {
        this.moduleName = name;
    }
    
    public void setID(String ID) {
        this.moduleID = ID;
    }

    
    

}