package pr2.Author;
import pr2.Author.Author;

import java.lang.*;

public class TestAuthor {
    public static void main(String[] args) {
        Author test1 = new Author("Света", "ikbo-25-20@sumirea.ru", 'Ж');
        Author test2 = new Author("С1ша", "79166172421@yandex.fu",'?');
        System.out.println(test1);
        System.out.println(test2);
        test2.setEmail("79166172444@yandex.ru");
        test2.setName("Саша");
        test2.setGender('М');
        System.out.println("Исправленный вариант :" + test2);
        System.out.println("Email Светы :" + test1.getEmail());
    }
}
