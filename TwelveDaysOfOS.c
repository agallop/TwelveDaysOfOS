#include <stdio.h>

static const char* WELCOMES[] = {
		"A \"Welcome to Monday!\" class\n\n",
		"A \"Welcome to Wednesday!\" class\n\n"
	};

static const char* GROUPS[] = {
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

static const char* DAYS[] = {
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

void printGroup(int, int);

int main(){
	int i;
	for(i = 0; i < 12; i++){
		printf("On the %s day of OS A. Norman gave to me\n", DAYS[i]);
		printGroup(i % 2, i);
	}
}


void printGroup(int oddDay, int number){
	if(!number){
		if(oddDay)
			printf("%s", WELCOMES[0]);
		else
			printf("%s", WELCOMES[1]);
	} else {
		printf("%s", GROUPS[number - 1]);
		printGroup(oddDay, number - 1);
	}

}
