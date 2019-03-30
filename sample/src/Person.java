public class Person {
    String Name;
    String Gender;
    String Father;
    String Mother;
    Boolean Marriage_Status;
    String Spouse;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getFather() {
        return Father;
    }

    public void setFather(String father) {
        Father = father;
    }

    public String getMother() {
        return Mother;
    }

    public void setMother(String mother) {
        Mother = mother;
    }

    public Boolean getMarriage_Status() {
        return Marriage_Status;
    }

    public String getSpouse() {
        return Spouse;
    }

    public void setSpouse(String spouse) {
        Spouse = spouse;
    }

    public void setMarriage_Status(Boolean marriage_Status) {
        Marriage_Status = marriage_Status;
    }
}
