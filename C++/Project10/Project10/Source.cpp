#include <iostream>
#include <string>
using namespace std;

struct Character
{
	Character();
	void printHealth();
	string Name;
	float Health;
};

int main()
{
	Character* PtrToChar = new Character();
	cout << "Name: " << PtrToChar->Name << endl;
	PtrToChar->printHealth();
	delete PtrToChar;
}

Character::Character()
{
	Name = "Default Name";
	Health = 100.f;
}

void Character::printHealth()
{
	cout << "Health: " << Health << endl;
}