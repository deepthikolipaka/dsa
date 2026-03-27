package day5;

import java.util.Scanner;
class Credits{
    int Msf=4,Ds=3,Coa=3,Se=3,Os=3,Dslab=1,Oslab=1,Selab=1,Nodejslab=1;
    int Total_Credits=Msf+Ds+Coa+Se+Os+Dslab+Oslab+Selab+Nodejslab;
}
public class Grade extends Credits {
    static int getGradePoint(String grade) {
        switch(grade){
            case "O":return 10;
            case "A+":return 9;
            case "A":return 8; 
            case "B+":return 7;
            case "B":return 6;
            case "C":return 5;
            default :return 0;

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Grade g=new Grade();
        System.out.println("Enter Msf Grade:");
        int msf=getGradePoint(sc.nextLine());
        System.out.println("Enter Data Structures Grade:");
        int ds=getGradePoint(sc.nextLine());
        System.out.println("Enter COA Grade:");
        int coa=getGradePoint(sc.nextLine());
        System.out.println("Enter SE Grade:");
        int se=getGradePoint(sc.nextLine());
        System.out.println("Enter OS Grade:");
        int os=getGradePoint(sc.nextLine());
        System.out.println("Enter DS lab Grade:");
        int dslab=getGradePoint(sc.nextLine());
        System.out.println("Enter OS lab Grade:");
        int oslab=getGradePoint(sc.nextLine());
        System.out.println("Enter SE lab Grade:");
        int selab=getGradePoint(sc.nextLine());
        System.out.println("Enter Node js labGrade:");
        int nodejslab=getGradePoint(sc.nextLine());
        int totalpoints =
        msf*g.Msf+ds*g.Ds+os*g.Os+se*g.Se+coa*g.Coa+dslab*g.Dslab+oslab*g.Oslab+selab*g.Selab+nodejslab*g.Nodejslab;
        float gpa=(float)totalpoints/g.Total_Credits;
        System.out.println("Your GPA:"+gpa);
    }
}
