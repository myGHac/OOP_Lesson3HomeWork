package task2;

import additional_task.Printer;

public class Main {

    public static void main(String [] args) {

    Pupil pupil = new Pupil();
        System.out.println("Класс Pupils");
        pupil.study();
        pupil.read();
        pupil.write();
        pupil.relax();
        System.out.println();

    ExcelentPupil excelentPupil = new ExcelentPupil();
        System.out.println("Класс Excelent Pupil");
        excelentPupil.study();
        excelentPupil.read();
        excelentPupil.write();
        excelentPupil.relax();
        System.out.println();

     GoodPupil goodPupil = new GoodPupil();
        System.out.println("Класс Good Pupil");
        goodPupil.study();
        goodPupil.read();
        goodPupil.write();
        goodPupil.relax();
        System.out.println();

     BadPupil badPupil = new BadPupil();
        System.out.println("Класс Bad Pupil");
        badPupil.study();
        badPupil.read();
        badPupil.write();
        badPupil.relax();
    }
}
