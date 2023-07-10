package errors;

import model.Person;

public class ExceptionsTester {
    public static void main(String[] args) {
        System.out.println("Begin.");
        Person p1 = new Person();

        Throwable throwable;
        Error error;
        Exception exception;

        try {
            p1.clone(); // will throw new NullPointerException object!
        } catch (NullPointerException e){ // trying to catch especially NullPointerException
            // error handling.
            System.out.println("Ooops! It's NullPointerException ( : " + e.getMessage());
            e.printStackTrace();
        } finally {
            //
            System.out.println("final job");
        }



        int [] array = {2, 12, 33};
        int i = 2;

        try {

            int val = array[i];
            System.out.println(val);

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Wrong index : " + i );
            e.printStackTrace();
            System.out.println("please user next indexes bound -> from 0 to" + (array.length - 1) );
        } finally {
            // default implementation -> print first element
         //   System.out.println(val);

        }




        String str = "Hello Java World!";
        String[] words = str.split(" ");
        for (String word : words) {
            try {
                System.out.println(word.charAt(word.indexOf('o')));
            } catch (StringIndexOutOfBoundsException e){
                System.out.println("No such symbol 'o' in word = '" + word + "'");
            }

        }



        System.out.println("End.");
    }
}
