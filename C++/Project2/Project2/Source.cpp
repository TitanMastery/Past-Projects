#include <iostream>
#include <string>
using namespace std;

char getYesNo();
void printResponse(char responseToPrint);
void askYesOrNoQuestion();

void welcome() {
	cout << "Welcome!\n";
}

void printNumber(int numToPrint) {
	cout << numToPrint << endl;
}

int add(int a, int b) {
	return a + b;
}

int main() {
	/*int a(1);
	int b = 13;

	if (a < b) {
		cout << "a is less than b." << endl;
	}
	else if(b < a) {
		cout << "b is less than a" << endl;
	}
	else {
		cout << "a is equal to b" << endl;
	}*/
	string var = "Hey";
	welcome();
	printNumber(5);
	printNumber(add(2,3));
	askYesOrNoQuestion();
}

char getYesNo() {
	cout << "Please answer: y or n,\n";
	char response;
	cin >> response;
	return response;
}

void printResponse(char responseToPrint) {
	cout << "Your answer was: " << responseToPrint << endl;
}

void askYesOrNoQuestion() {
	printResponse(getYesNo());
}