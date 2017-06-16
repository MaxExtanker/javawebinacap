
package cl.negocio;

import cl.accesodato.Conexion;

public class Course {
    private String ID;
    private String NAME;
    private String DESCRIPTION;
    private String CREATED_AT;
    private String STATE;
    Conexion con;
    public Course(){
        con=new Conexion();
        
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public String getCREATED_AT() {
        return CREATED_AT;
    }

    public void setCREATED_AT(String CREATED_AT) {
        this.CREATED_AT = CREATED_AT;
    }

    public String getSTATE() {
        return STATE;
    }

    public void setSTATE(String STATE) {
        this.STATE = STATE;
    }
    public void save(){
        con.runSql("insert into COURSES(NAME,DESCRIPTION,CREATET_AT,STATE)"
                +"values('"+this.getNAME()+"','"+this.getDESCRIPTION()+"','"+this.getCREATED_AT()+"','"+this.getSTATE()+"'");
        
    }
    
}
