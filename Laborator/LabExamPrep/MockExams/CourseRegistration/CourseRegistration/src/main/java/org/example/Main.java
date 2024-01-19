package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * 1p Identifizieren sie jede Verantwortung und jedes Anliegen Inrer Lösung korrekt und platzieren Sie sie in komponenten, die sie umfassen
 * Erstellen sie eine Losung zur Verwaltung eines Univensttätskursanmeldesystems. Sie finden alle kursen in der Datei namens
 * "course_registration.csv" mit den Spalten: "student_id",
 * "course_code",
 * "semester",
 * "grade" und
 * "status
 * Die Spalten sind durch das "."-Zeichen getrennt
 *
 * 2p Lesen sie den Inhalt der Datei "course_registration.cvs' und wandeln Sie jede zeile in ein Java-Obiekt um, indem
 * sie es enteprechend modellieren. Erstellen sie eine Kasse, die definiert, wie ein Eintrag aus der Datet als Objekt aussehen sollte.
 * Das Engebnis sollte vom Typ: ArrayList<CourseRegistration> sein.
 *
 * B. 1p Verwenden Sie Java-Streams, um auf dem Bildschirm die Kurse und die Anzaht der eingeschriebenen Studenten für jeden
 * Kurs anzuzeigen, absteigend sortient nach der Anzahl
 * 2p Verwenden Sie Java-Streams und, aber nicht nur, die entsprechende .map()-Methode, um in eine Datei namens "failed_students.txt" alle Studenten-IDs zu speichern, die den Status "Failed" haben.
 *
 * D. 1p Implementieren Sie ein Designmuster, um eine Klasse "CourseCoordinator" zu erstellen, die den Kurs koordinieren soll.
 * Aber heute ist der Koordinator krank und der Vertretungslehrer wird ihn ersetzen. Der Vertretungslehrer weiß, wie man den Kurs koordiniert, genauso wie ein "CourseCoordinator", aber jeder weiß, dass er kein "CourseCoordinator" ist.Design pattern should be strategy so that it can choose whether it is an actual coordinator or not and set it accordingly
 * Hinterlassen Sie einen Kommentan mit dem Name des verwendeten Designmusters.
 * 1p Erstellen Sie einen Test, um die Umsetzung von "D" zu garantieren.
 * 1p Definieren Sie zwei Threads, die die Liste der Kursanmeldungen verwenden. Der erste Thread fügt 5 neve Anmeldungen hinzu, wobei zwischen jeder Anmeldung eine Verzogerung von Sekunden besteht. Der zweite Thread überprüft ständig, ob eine neve Anmeldung hinzugefugt wurde, und zeigt sie auf dem Bildschirm an.. The threads have to share the same resource so please implement it in that manner
 *
 * Beispiel-Ausgabe:
 * Thread-1: Neue Anmeldung hinzufügen und 2 Sekunden wanten
 * Thread-2: Neue Anmeldung hinzugefügt!
 * Thread-1: Neue Anmeldung hinzurügen und 2 Sekunden warten
 * Thread-2: Neve. Anmeldung hinzugefugt!
 * Thread-1: Neue Anmeldung hinzufügen und 2 Sekunden warten
 * Thread-2: Neue Anmeldung hinzugefügt!
 * .
 * .
 * .
 */

public class Main {
    public static void main(String[] args) {

        List<Student> studentList = ReadStudentFromFile.readStudentsFromFile("src/main/java/org/example/course_registration.csv");
        System.out.println(studentList);

        WriteStudentsToFile.writeStudentsToFile(studentList,"src/main/java/org/example/failed_students.txt");

        CourseStatistics.displayStatistics(studentList);

        ArrayList<String> studentArrayList = new ArrayList<>();
        studentArrayList.add("Math");
        studentArrayList.add("Mike");
        studentArrayList.add("German");

        TeacherTest testStrategyPattern = new TeacherTest();
        testStrategyPattern.test(studentArrayList);



    }
}