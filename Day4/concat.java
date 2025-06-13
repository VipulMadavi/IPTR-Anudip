public class concat {
    public static void main(String[] args) {
        String firstname = "Vipul";
        String lastname = "Madavi";
        String fullname = firstname + " " + lastname; // we can also use .concat() method
        // fullname = firstname.concat(lastname);
        System.out.println(fullname);
        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i)); // prints individual characters
        }
    }
}
