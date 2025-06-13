
public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.charAt(1)); // prints the character at the given index
        sb.setCharAt(0, 't'); // change character at that index to given char
        System.out.println(sb);
        sb.insert(5, 'w'); // insert a character at that index by moving the exisiting to the next index
        System.out.println(sb);
        sb.delete(0, 2); // deletes the character from the given index to given index
        System.out.println(sb);
        sb.append(" World"); // inset the given string at the end of the exisiting one
        System.out.println(sb);
    }
}
