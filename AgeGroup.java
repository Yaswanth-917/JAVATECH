public class AgeGroup {
    public static void main(String[] args) {
        int[] ageGroup = new int[6];
        int[] passAges = {23, 45, 12, 36, 17, 8, 54, 31, 28, 41, 60};
        
        for(int age: passAges) {
            if(age <= 10) {
                ageGroup[0]++;
            }
            else if(age > 10 && age <= 20) {
                ageGroup[1]++;
            }
            else if(age > 20 && age <= 30) {
                ageGroup[2]++;
            }
            else if(age > 30 && age <= 40) {
                ageGroup[3]++;
            }
            else if(age > 40 && age <= 50) {
                ageGroup[4]++;
            }
            else {
                ageGroup[5]++;
            }
        }
        System.out.println("Age group\tCount");
        System.out.println("0-10\t\t" + ageGroup[0]);
        System.out.println("10-20\t\t" + ageGroup[1]);
        System.out.println("20-30\t\t" + ageGroup[2]);
        System.out.println("30-40\t\t" + ageGroup[3]);
        System.out.println("40-50\t\t" + ageGroup[4]);
        System.out.println("50+\t\t" + ageGroup[5]);
    }
}