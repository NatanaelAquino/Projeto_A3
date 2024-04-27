package main.java.entities;

public class User {

    private String name;
    private Integer age;
    private Integer CPF;
    private String Office;
    private String Sector;
    
    public User(String name, Integer age, Integer cPF, String office, String sector) {
        this.name = name;
        this.age = age;
        CPF = cPF;
        Office = office;
        Sector = sector;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getCPF() {
        return CPF;
    }

    public void setCPF(Integer cPF) {
        CPF = cPF;
    }

    public String getOffice() {
        return Office;
    }

    public void setOffice(String office) {
        Office = office;
    }

    public String getSector() {
        return Sector;
    }

    public void setSector(String sector) {
        Sector = sector;
    }
    

}
