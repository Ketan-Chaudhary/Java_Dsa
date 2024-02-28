package leetcode.String_Assignment;
//https://leetcode.com/problems/defanging-an-ip-address/
public class IPAddress {
    public static void main(String[] args) {

    }
    String defangIPaddr(String address) {
        address= address.replace(".","[.]");
        return address;
    }
}
