public class TwelveDaysOfOS_Iterably{

	private static final String[] WELCOMES = new String[]{
		"A \"Welcome to Monday!\" class\n\n",
		"A \"Welcome to Wednesday!\" class\n\n"
	};

	private static final String[] GROUPS = new String[]{
		"Two system calls, and\n",
		"Three cond vars\n",
		"Four timer sleeps\n",
		"Five TAs shame \n",
		"Six fibs a-forking\n",
		"Seven locks a-locking\n",
		"Eight frames evicted\n",
		"Nine testers failing\n",
		"Ten threads a-yielding\n",
		"Eleven children dying\n",
		"Twelve sophomores crying\n"
	};

	private static final String[] DAYS = new String[]{
		"First",
		"Second",
		"Third",
		"Fourth",
		"Fifth",
		"Sixth",
		"Seventh",
		"Eigth",
		"Ninth",
		"Tenth",
		"Eleventh",
		"Twelfth"
	};

	public static void main(String args[]){
		for(int i = 0; i < 12; i++){
			System.out.printf("On the %s day of OS A. Norman gave to me\n", DAYS[i]) ;
			for(int j = i; j >= 0; j--){
				if(j == 0){
					if(i % 2 == 0)
						System.out.println(WELCOMES[0]);
					else
						System.out.println(WELCOMES[1]);
				} else {
					System.out.print(GROUPS[j-1]);
				}
			}
		}
	}
}
