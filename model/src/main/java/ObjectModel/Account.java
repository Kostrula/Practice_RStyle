package ObjectModel;

public class Account {
    private Long id;
    private String number;
    private String name;
    private String description;

    public void setId(Long id){
        this.id = id;
    }

    public void  setNumber(String number){
        this.number = number;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public Long getId(){
        return id;
    }

    public String getNumber(){
        return number;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }
}
