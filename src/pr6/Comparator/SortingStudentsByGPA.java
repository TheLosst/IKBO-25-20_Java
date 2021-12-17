package pr6.Comparator;

public class SortingStudentsByGPA {

    public int x;
    public String y;

    void sort(int marks[], String names[]) {
        for (int i = 1; i < marks.length; i++)
            for (int j = 0; j < marks.length - i; j++)
                if (marks[j] < marks[j + 1]) {
                    x = marks[j + 1];
                    y = names[j + 1];
                    marks[j + 1] = marks[j];
                    names[j + 1] = names[j];
                    marks[j] = x;
                    names[j] = y;
                }

        for (int i = 0; i < 5; i++)
            System.out.print(names[i] + ": " + marks[i] + "\n");

    }
}
