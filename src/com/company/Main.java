public class Main {

    public static void main(String[] args) {
        Class class1=new Class(4,"Java", new int[]{1, 2, 3, 4, 5});
        System.out.println(class1.getNumber());
        System.out.println(class1.getSoz());
        for (int a:class1.getMas()){
            System.out.println(a+"");

        }


    }
}
