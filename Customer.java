import java.util.Objects;

public class Customer extends Person implements SystemInterface{
   private String idType;

   private boolean hasFamily;
private Room r;

    public Room getR() {
        return r;
    }

    public void setR(Room r) {
        this.r = r;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getPhonNumber() {
        return PhonNumber;
    }

    public void setPhonNumber(String phonNumber) {
        PhonNumber = phonNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHasFamily() {
        return hasFamily;
    }

    public void setHasFamily(boolean hasFamily) {
        this.hasFamily = hasFamily;
    }

    @Override
    public Object Search() {
        return null;
    }
}
