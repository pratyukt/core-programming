public class PensDistribution {
    public static void main(String[] args) {
        int pens = 14, students = 3;
        int perStudent = pens / students;
        int remaining = pens % students;
        System.out.println("Each student gets " + perStudent + " pens, Remaining = " + remaining);
    }
}