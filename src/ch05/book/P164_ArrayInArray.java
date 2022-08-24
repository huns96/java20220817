package ch05.book;

public class P164_ArrayInArray {
	public static void main(String[] args) {
		int [][] mathScores = new int [2][3];
		for (int i = 0; i < mathScores.length; i++) {
			for (int k = 0; k < mathScores[i].length; k++) {
				System.out.println("mathScore["+i+"]["+k+"]="+mathScores[i][k]);
			}
		}
		
		System.out.println();
		
		int[][] englishScores = new int [2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for(int i = 0; i < englishScores.length; i++) {
			for(int k = 0; k < englishScores[i].length; k++) {
				System.out.println("englishScores["+i+"]["+k+"]="+englishScores[i][k]);
			}
		}
		
		System.out.println();
		
		int[][] javascores = { {95, 80}, {92, 96, 80}};
		for(int i = 0; i < javascores.length; i++) {
			for(int k = 0; k < javascores[i].length; k++) {
				System.out.println("javascores["+i+"]["+k+"]="+javascores[i][k]);
			}
		}
	}
}
