package task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

System.out.println("Укажите вариант доступа: ");
System.out.println("1 - exp, 2 - pro, 3 - у меня нет ключа");

        Scanner sc= new Scanner(System.in);
        int access = sc.nextInt();

        switch (access) {
            case 1:
              DocumentWorker expertDoc = new ExpertDocumentWorker();

            case 2:
              DocumentWorker proDoc = new ProDocumentWorker();
            case 3:
               DocumentWorker docWorker = new DocumentWorker();
        }
    }
}
