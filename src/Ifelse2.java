// Q: input firstname, lastname; compare length of firstname & lastname & print whatever is greater:
// eg: Shubham length is 7; Misra length is 5:
// Output: Shubham's length is "greater" than Misra's length.
public class Ifelse2 {
    public static void main(String args[]){
        String firstname = "Garima";
        String lastname = "Dixit";
        if (firstname.length() > lastname.length()){
            System.out.print(firstname +"'s"+ " length is greater " + lastname+"'s" + " length");

        }
        else{
            System.out.print(firstname + "is smaller" + lastname);
        }
    }
}
