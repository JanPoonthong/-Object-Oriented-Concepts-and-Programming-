public class MyTimeTable {
    static String spaceBetweenPeriod = "\t |\t\t\t    |";

    public static void main(String[] args) {
        studentInformation();
        plusLine();
        System.out.println("+ Date\\Time\t | 9:00 - 10:30 | 10:30 - 12:00 | 12:00 - 13:30 | 13:30 - 15:00 | 15:00 - 16:30 | 16:30 - 18:00 +");
        plusLine();
        weekDays("Monday", "");
        plusLine();

        weekDays("Tuesday", "BBA1001(409)@IBE1122(402)");
        plusLine();

        weekDays("Wednesday", "BG14032421)");
        plusLine();

        weekDays("Thursday", "BBA1001(409)@CSX3002(543)");
        plusLine();

        weekDays("Friday", "ITX4502(542)@ITX2005(542)");
        plusLine();

    }

    static void weekDays(String day, String subject) {
        String[] eachSubject = subject.split("@", 2);

        if (day == "Wednesday") {
            String spaceBetweenPeriodForWednesday = " |\t\t\t    |";
            String spaceBetweenPeriodFormat = String.format("+ %s %s", day, spaceBetweenPeriodForWednesday);
            System.out.print(spaceBetweenPeriodFormat);

            System.out.print("\t\t\t\t|\t\t\t    |");
            System.out.print(String.format("  \t\t\t%s  ", eachSubject[0]));
            System.out.print("\t\t|");
            System.out.print("\t\t\t\t|");


        }
        else if (subject == "") {
            String spaceBetweenPeriodFormat = String.format("+ %s %s", day, spaceBetweenPeriod);
            System.out.print(spaceBetweenPeriodFormat);
            System.out.print("\t\t\t\t|");
            System.out.print("\t\t\t\t|");
            System.out.print("\t\t\t\t|");
            System.out.print("\t\t\t\t|");
            System.out.print("\t\t\t\t|");
        } else {
            if (day == "Tuesday") {
                System.out.print(String.format("+ %s", day));
                System.out.print(String.format("%s", spaceBetweenPeriod));
                System.out.print(String.format("  %s |", eachSubject[0]));
                System.out.print(String.format("\t\t\t\t|  \t\t\t%s ", eachSubject[1]));
                System.out.print("\t\t|");
                System.out.print("\t\t\t\t|");

            }
            else if (day == "Thursday") {
                String spaceBetweenPeriodFormat = String.format("+ %s \t | ", day);
                System.out.print(spaceBetweenPeriodFormat);
                String eachSubjectFormat = String.format("%s |", eachSubject[0]);
                System.out.print(eachSubjectFormat);
                System.out.print("\t\t\t\t|");
                System.out.print("\t\t\t\t|");
                System.out.print(String.format("  \t\t\t%s  ", eachSubject[1]));
                System.out.print("\t\t|");
                System.out.print("\t\t\t\t|");
            }
            else if (day == "Friday") {
                String spaceBetweenPeriodFormat = String.format("+ %s \t |  ", day);
                System.out.print(spaceBetweenPeriodFormat);
                System.out.print(String.format("\t\t%s\t\t|", eachSubject[0]));
                System.out.print(String.format("\t\t\t\t|\t\t\t%s\t\t|", eachSubject[1]));
                System.out.print("\t\t\t\t|");
            }

        }
        System.out.println();



    }

    static void monday() {
        String spaceBetweenPeriodFormat = String.format("+ Monday %s", spaceBetweenPeriod);
        System.out.println(spaceBetweenPeriodFormat);

    }
    static void plusLine() {
        for (int i = 0; i < 109; i++) {
            System.out.print("+");
        }
        System.out.print("\n");
    }


    static void studentInformation() {
        String name = "Jan Poonthong";
        String id = "6511286";
        String[] nickName = name.split(" ", 2);
        String nameFormat = String.format("Name: %s", name);
        System.out.println(nameFormat);
        System.out.println();

        String idFormat = String.format("ID: %s", id);
        System.out.println(idFormat);
        String nickNameFormat = String.format("Nickname: %s", nickName);
        System.out.println(nickNameFormat);
    }

}