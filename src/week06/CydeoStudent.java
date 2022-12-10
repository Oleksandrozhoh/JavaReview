package week06;

public class CydeoStudent {

    public String name, programmingLanguage, groupName;
    public int age, batch;
    public char gender;
    public boolean isMarried, isEmployed;

    public void setInfo(String name,String programmingLanguage,String groupName, int age, int batch,char gender, boolean isMarried, boolean isEmployed){
        this.name = name;
        this.programmingLanguage = programmingLanguage;
        this.groupName = groupName;
        this.age = age;
        this.batch = batch;
        this.gender = gender;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;

    }

    public void study(){
        System.out.println(name+" is studying...");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", groupName='" + groupName + '\'' +
                ", age=" + age +
                ", batch=" + batch +
                ", gender=" + gender +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                '}';
    }
}
