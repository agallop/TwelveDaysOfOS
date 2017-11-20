public class TwelveDaysOfOS{

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
		"Eleven child dying\n",
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
		"eleventh",
		"Twelfth"
	};

	public static void main(String args[]){
		for(int i = 0; i < 12; i++){
			System.out.printf("On the %s day of OS A. Norman gave to me\n", DAYS[i]) ;
			printGroup(i % 2 == 0, i);
		}
	}



	private static void printGroup(boolean oddDay, int number){
		if(number == 0){
			if(oddDay)
				System.out.println(WELCOMES[0]);
			else
				System.out.println(WELCOMES[1]);
		} else {
			System.out.print(GROUPS[number - 1]);
			printGroup(oddDay, number- 1);
		}
	}
}
