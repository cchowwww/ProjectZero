import java.util.Scanner;

class ProjectZero {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
		double score1, score2, score3;
		double totalScore;
		
		System.out.println("Enter your first test score: ");
		score1= obj.nextDouble();
		System.out.println("Enter your second test score: ");
		score2= obj.nextDouble();
		System.out.println("Enter your third test score: ");
		score3= obj.nextDouble();
		
		totalScore = score1 + score2 + score3;
		System.out.println("Test scores: " + score1 + ", " + score2 + ", " + score3);
		System.out.println("Average of scores: " + totalScore/3);
		if (totalScore/3 > 95) 
		{
			System.out.println("Congratuations on your high test scores");
			System.out.println("Awesome");
		}

    }
    
}