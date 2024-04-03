public class Main {
    public static void main(String[] args) {
        // create Student instances
        Student student1 = new Student();
        Student student2 = new Student();

        // create t instance
        Tutor t = new Tutor(student1, student2);

        // Tutor t1 = new Tutor(new Student ("Sai", 3, 97, 99, 100), new Student ("Wayne", 3, 90, 100, 96));

        // call study method
        t.s1.study();

        // call getAverage method
        System.out.println(t.s2.getAverage());
    }
}