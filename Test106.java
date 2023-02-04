import java.util.*;

class Test106 {

    public static void main(String[] args) {

        ArrayList<String> prob = new ArrayList<String>();

        ArrayList<String> soln = new ArrayList<String>();
        ArrayList<String> ans = new ArrayList<String>();
        ArrayList<String> ans1 = new ArrayList<String>();
        int count = 0;

        Scanner sc = new Scanner(System.in);

        prob.add(" Question 1\nJava is which type of Programing Language ?");
        soln.add("A.Object Oriented\n B.Procedural Oriented\n C.Direct Oriented \n D.None of these");
        ans1.add("A");
        prob.add("Question 2\n Which operation is used in Stack ?");
        soln.add("A.touch \n B.Don't touch \n C. Feel \n D.Pop");
        ans1.add("D");
        prob.add("Question 3\n What is an Array ?");
        soln.add(
                "A.Collection of Similar type of data\n B. Collection of all types of data \n C. Collection of nothing\n D. None of these");
        ans1.add("A");
        prob.add("Question 4\n What is an Data Structure ?");
        soln.add(
                "A.Set the Data in efficient Manner\n B. Collection of all types of data \n C. Collection of nothing\n D. None of these");
        ans1.add("A");
        prob.add("Question 5\n What is an Linked List ?");
        soln.add(
                "A.Collection of Similar type of data\n B.It is better than Array in most of the Cases  \n C. Worst than Array in all cases \n D. None of these");
        ans1.add("B");
        prob.add("Question 6\n Int return type returns ?");
        soln.add(
                "A.boolean value\n B. String value \n C. Int value\n D. None of these");
        ans1.add("C");
        prob.add("Question 7\n Constructor have which type of Return type ?");
        soln.add(
                "A. No return Type\n B. Boolean return type \n C. Int return type \n D. String return type");
        ans1.add("A");
        prob.add("Question 8\n Queue follow which type of Rule ?");
        soln.add(
                "A.FIFO\n B. LIFO \n C. TIPO \n D. None of these");
        ans1.add("A");
        prob.add("Question 9\n Stack follow which type of Rule ?");
        soln.add(
                "A.LIFO\n B. FIFO \n C. TIPO\n D. None of these");
        ans1.add("A");
        prob.add("Question 10\n ArrayList is a  ?");
        soln.add(
                "A.Dynamic Array\n B. Worst Array \n C. Super Array\n D. None of these");
        ans1.add("A");
        for (int i = 0; i < prob.size(); i++) {

            System.out.println(prob.get(i));
            System.out.println(soln.get(i));
            System.out.println("Enter the choice::");
            ans.add(sc.nextLine());

        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(" Thank You Test Finished");

        System.out.println("Your ans are=");
        for (int i = 0; i < ans.size(); i++) {

            System.out.print(ans.get(i) + "\t");

        }
        System.out.println();
        for (int i = 0; i < ans.size(); i++) {

            if (ans.get(i).equalsIgnoreCase(ans1.get(i))) {
                count++;
            }

        }

        System.out.println(" Your score is::" + count);

        System.out.println("Final Answer are");

        for (int i = 0; i < ans1.size(); i++) {

            System.out.print(ans1.get(i) + "\t");
        }

    }

}
