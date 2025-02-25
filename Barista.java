public class Barista {
    private String name;
    private char gender;

    Barista (String name, char gender){
        this.name = name;
        this.gender = gender;
    }

    Barista (){
        this.name = null;
        this.gender = ' ';
    }

    public String getName() {
        return name;
    }

    public String getGenderName() {
        if (gender == 'M') return "Male";
        else if (gender == 'F') return  "Female";
        return " ";
    }
}
