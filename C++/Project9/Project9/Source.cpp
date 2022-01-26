#include <iostream>
#include <string>
using namespace std;

class Creature
{
public:
	Creature();
	void setName(string name);
	string getName();
	float getHealth();
	void takeDamage(float damage);
private:
	string Name;
	float Health;
protected:
	int NumberOfLimbs;
};

class Goblin :public Creature
{
public:
	Goblin();
	int getNumberOfLimbs();
};

int main() 
{
	Goblin gobby;
	cout << "Name: " << gobby.getName() << endl;
	cout << "Number of Limbs: " << gobby.getNumberOfLimbs() << endl;
}

Creature::Creature()
{
	Health = 100.f;
	cout << "A creature has been created\n";
}

void Creature::setName(string name)
{
	Name = name;
}

string Creature::getName() 
{
	return Name;
}

float Creature::getHealth()
{
	return Health;
}

void Creature::takeDamage(float damage)
{
	float total = Health - damage;
	if (total <= 0.f) 
	{
		cout << getName() << " has died!\n";
		Health = 0;
	}
	else
	{
		Health -= damage;
	}

	cout << "Health: " << Health << endl;
}

Goblin::Goblin() 
{
	NumberOfLimbs = 5;
	setName("Gobby");
}

int Goblin::getNumberOfLimbs() 
{
	return NumberOfLimbs;
}