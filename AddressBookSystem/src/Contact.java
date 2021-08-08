import java.util.List;

public class Contact {
    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;
    private List<Contact> contact;

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getfirstName() {
        return firstName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }
    public String getlastName() {
        return lastName;
    }

    public void setcity(String city) {
        this.city = city;
    }
    public String getcity() {
        return city;
    }

    public void setstate(String state) {
        this.state = state;
    }
    public String getstate() {
        return state;
    }

    public void setzip(String zip) {
        this.zip = zip;
    }
    public String getzip() {
        return zip;
    }

    public void setphoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getphoneNumber() {
        return phoneNumber;
    }

    public void setemail(String email) {
        this.email = email;
    }
    public String getemail() {
        return email;
    }

    @Override
    public String toString() {
        return '\n'+"Contact is"+'\n'+ "First Name: " + firstName +'\n'+ "Last  Name: " + lastName +'\n'+ "City : " + city +'\n'+ "State : " + state
                + "zip : " + zip +'\n'+"Phone Number : " + phoneNumber +'\n'+ "Email Id: " + email +'\n';
    }

    @Override
    public boolean equals(Object obj) {
        boolean retVal = false;
        if(!(obj instanceof Contact)){
            return false;
        }
        Contact ptr= (Contact) obj;
        retVal=ptr.firstName.toString()==this.firstName;
        return retVal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.firstName != null ? this.firstName.hashCode() : 0);
        return hash;
    }

}

