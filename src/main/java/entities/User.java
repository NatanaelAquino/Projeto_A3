package main.java.entities;

public class User {

    private Integer codigo;
    private String name;
    private Integer Login;
    private String senha;
    private String EMAIL;
    private Integer registro;



    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getLogin() {
        return Login;
    }
    public void setLogin(Integer login) {
        Login = login;
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
