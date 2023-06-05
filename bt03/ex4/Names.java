package bt03.ex4;
import java.util.Random;
import java.util.Arrays;

public class Names {
    public static String[] lastNames = {"Nguyen", "Ly", "Tran", "Le", "Vo", "Doan", "Quach", "Ha"};
    public static String[] firstNames = {"Khoi","Anh","Chi","Quynh", "Hung", "Chau", "An", "Ha", "Ly", "Ba", "Hai", "Nhat", "Tuan"};
    public static String[] middleNames = {"Thi", "Tuan", "Trong", "Van", "Ha", "Tieu", "Thu", "Anh", "Quynh", "Chi"};
    public static void main(String[] args){
        final int N = 100;
        String[] names = new String[N];
        Random r = new Random();
        for(int i = 0; i < names.length; i++){
            String name = "";
            String lName = lastNames[r.nextInt(0, lastNames.length)];
            String fName = firstNames[r.nextInt(0, firstNames.length)];
            String mName = middleNames[r.nextInt(0, middleNames.length)];
            if(r.nextBoolean()){
                name = lName + " "+ mName + " " + fName;
            }else{
                name = lName + " " + fName;
            }
            names[i] = name;
        }
        Arrays.sort(names);
        System.out.println("The generated list of names is: ");
        for(String n: names){
            System.out.println(n);
        }
    }
}
