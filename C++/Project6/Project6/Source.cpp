#include <iostream>
#include <string>
using namespace std; 

struct Container
{
	string name;

	int x;
	int y;
	int z;
};

int main() 
{
	Container container = {"Sam", 5, 6, 7};
	Container* ptrToCont = &container;

	cout << (*ptrToCont).name << endl; 
	cout << (*ptrToCont).x << endl; 
	cout << (*ptrToCont).y << endl; 
	cout << ptrToCont->z << endl; 

	/*
	int numbers[] = {0,1,2,3,4,5,6,7,8,9,10};

	int* numPtr = numbers;

	cout << *numPtr << endl;

	numPtr++;

	cout << *numPtr << endl;

	numPtr++;

	cout << *numPtr << endl;

	numPtr+=3;

	cout << *numPtr << endl;
	*/
}