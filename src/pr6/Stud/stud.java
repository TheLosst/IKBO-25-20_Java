package pr6.Stud;

public class stud {

    public static void main(String[] args) {


        String x;
        String list1[] = {"Shamil: 1", "Dora: 3", "Erjayan: 0"};
        String list2[] = {"Ruberoid Djonson: 5", "Jason hren zavalish Stethem: 5", "Solyarich: 2"};
        String list[] = new String[list1.length+ list2.length];

        for(int i=0; i<list.length/2; i++) {
            list[i] = list1[i];
            list[i + list1.length] = list2[i];
        }


        for(int i=0; i< list.length; i++){
            if(i==list.length-1)
                System.out.print(list[i]);
            else
                System.out.print(list[i]+", ");
        }

        for(int i=1; i<list.length; i++)
            for(int j=0; j<list.length-i; j++)
                if(list[j].charAt(list[j].length()-1)>list[j+1].charAt(list[j+1].length()-1)) {
                    x = list[j+1];
                    list[j+1]=list[j];
                    list[j] = x;
                }

        System.out.print("\nafter sorting: ");
        for(int i=0; i< list.length; i++){
            if(i==list.length-1)
                System.out.print(list[i]);
            else
                System.out.print(list[i]+", ");
        }
    }
}
