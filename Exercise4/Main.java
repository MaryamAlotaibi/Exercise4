import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int ary[] = {1, 2, 3, 4, 5, 6, 7};

        try {
            System.out.println(ary[9]);
            System.out.println("array index in bonds");
        }catch(Exception e){
            System.out.println("array index out of bonds");
        }



        author author1=new author("Maryam","maryam21_19@hotmail.com");
        author author2=new author("Reem","reem_19@hotmail.com");

        System.out.println(author1.getName());
        System.out.println(author1.getEmail());
        System.out.println(author2.getName());
        System.out.println(author2.getEmail());





    }


}
