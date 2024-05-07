package main.java.entities;

public class User {

    private Integer codigo;
    private String name;
    private String senha;
    private String EMAIL;
    private Integer registro;
    
    public User( String name,  String senha, String eMAIL, Integer registro) {
        this.name = name;
        this.senha = senha;
        EMAIL = eMAIL;
        this.registro = registro;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
   
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getEMAIL() {
        return EMAIL;
    }
    public void setEMAIL(String eMAIL) {
        EMAIL = eMAIL;
    }
    public Integer getRegistro() {
        return registro;
    }
    public void setRegistro(Integer registro) {
        this.registro = registro;
    }
}
