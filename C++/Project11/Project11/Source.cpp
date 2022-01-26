#include <iostream>
using namespace std;

class Character
{
public:
	Character();
	~Character();

	int* CharacterAge;
	float* CharacterHealth;
};

int main()
{
	Character* Char = new Character;
	delete Char;
}

Character::Character()
{
	cout << "A new Character was created.\n";
	CharacterAge = new int(1);
	CharacterHealth = new float(100.f);
}

Character::~Character() 
{
	cout << "Character destroyed.\n";
	delete CharacterAge;
	delete CharacterHealth;
}